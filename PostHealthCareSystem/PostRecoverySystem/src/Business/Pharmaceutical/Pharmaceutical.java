/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Pharmaceutical;

import Business.Porter.Porter;
import Business.Role.SysAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author samik
 */
public class Pharmaceutical extends UserAccount {
    
    private String orderId;
    private SysAdminRole systemAdmin;
    private Porter deliveryMan;
    private String pharmaceuticalName;
    private Inventory inventory;
    private String address;
    private String contact;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public SysAdminRole getSystemAdmin() {
        return systemAdmin;
    }

    public void setSystemAdmin(SysAdminRole systemAdmin) {
        this.systemAdmin = systemAdmin;
    }

    public Porter getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(Porter deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public String getPharmaceuticalName() {
        return pharmaceuticalName;
    }

    public void setPharmaceuticalName(String pharmaceuticalName) {
        this.pharmaceuticalName = pharmaceuticalName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return pharmaceuticalName;
    }
    
}
