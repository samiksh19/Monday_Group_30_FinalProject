/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AmbulanceDriver;

import Business.UserAccount.UserAccount;

/**
 *
 * @author prach
 */
public class AmbulanceDriver extends UserAccount{
    private String ambulanceDriverName;
    private String type;

    public String getAmbulanceDriverName() {
        return ambulanceDriverName;
    }

    public void setAmbulanceDriverName(String ambulanceDriverName) {
        this.ambulanceDriverName = ambulanceDriverName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
     @Override
    public String toString() {
        return this.ambulanceDriverName;
    }
}
