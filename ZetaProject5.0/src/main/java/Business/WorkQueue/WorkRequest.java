/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author kathe
 */
public class WorkRequest {
    private String result;
    private UserAccount sender;
    private UserAccount handler;
    private UserAccount receiver;
    private UserAccount driver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private int requestId;
    private static int count=1;
    private Enterprise fromEnterprise;
    private Enterprise toEnterprise;
    private String evaluation;

    public WorkRequest(){
        requestDate = new Date();
        requestId=count;
        count++;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }
    
    public UserAccount getHandler() {
        return handler;
    }

    public void setHandler(UserAccount handler) {
        this.handler = handler;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    
     public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    
    public static void setCurrentId(int n){
        System.out.println("Workrequest id set: " + n);
        count=n;
    }
    
    public static int getCurrentId(){
        return count;
    }
    
    public Enterprise getFromEnterprise() {
        return fromEnterprise;
    }

    public void setFromEnterprise(Enterprise fromEnterprise) {
        this.fromEnterprise = fromEnterprise;
    }
    
    public Enterprise getToEnterprise() {
        return toEnterprise;
    }

    public void setToEnterprise(Enterprise toEnterprise) {
        this.toEnterprise = toEnterprise;
    }
    
    public UserAccount getDriver() {
        return driver;
    }

    public void setDriver(UserAccount driver) {
        this.driver = driver;
    }
    
    public String getEvaluation() {
        return evaluation== null ? "Waiting" : evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }
    
    public String toString(){
        return result == null ? "Waiting" : result;
    }

}
