package Business.DB4OUtil;


import Business.Ecosystem.ConfigureASystem;
import Business.Ecosystem.EcoSystem;
import Business.Organization.Organization;
import Business.People.Person;
import Business.WorkQueue.WorkRequest;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kathe &
 */
public class DB4OUtil {
     private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true); // Change to the object you want to save
            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(EcoSystem system) {
        System.out.println("Stored.");
        ObjectContainer conn = createConnection();
        system.id=Person.getCurrentId();
        system.workRequestId=WorkRequest.getCurrentId();
        system.organizationId=Organization.getCurrentId();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public EcoSystem retrieveSystem(){
        ObjectContainer conn = createConnection();
        ObjectSet<EcoSystem> systems = conn.query(EcoSystem.class); // Change to the object you want to save
        EcoSystem system;
        if (systems.size() == 0){
            System.out.println("New Ecosystem.");
            system = ConfigureASystem.configure();  // If there's no System in the record, create a new one
        }
        else{
            System.out.println("Old Ecosystem.");
            system = systems.get(systems.size() - 1);

            Person.setCurrentId(system.id);
            WorkRequest.setCurrentId(system.workRequestId);
            Organization.setCurrentId(system.organizationId);
        }
        conn.close();
        return system;
    }
}
