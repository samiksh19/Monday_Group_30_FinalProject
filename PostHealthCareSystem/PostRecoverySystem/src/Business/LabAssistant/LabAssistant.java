/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.LabAssistant;

import Business.UserAccount.UserAccount;

/**
 *
 * @author samik
 */
public class LabAssistant extends UserAccount{
    private String labAssistantName;
    private String type;

    public String getLabAssistantName() {
        return labAssistantName;
    }

    public void setLabAssistantName(String labAssistantName) {
        this.labAssistantName = labAssistantName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        return this.labAssistantName;
    }
}
