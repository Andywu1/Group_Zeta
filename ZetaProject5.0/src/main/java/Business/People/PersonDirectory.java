/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;


import java.util.ArrayList;

/**
 *
 * @author kathe
 */
public class PersonDirectory {
    private ArrayList<Person>personList;
    
    public PersonDirectory(){
        personList=new ArrayList<>();
    }
    
   
    public Person createPerson(String name){
        Person person=new Person();
        person.setName(name);
        personList.add(person);
        return person;
      
    }
}
