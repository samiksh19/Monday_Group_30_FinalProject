/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author samik
 */
public class WorkQueue {
     private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public WorkRequest addWorkRequest(WorkRequest request){
        
        workRequestList.add(request);
        return request;
    }
    
    public void removeWorkRequest(WorkRequest request){
        workRequestList.remove(request);
    }
}
