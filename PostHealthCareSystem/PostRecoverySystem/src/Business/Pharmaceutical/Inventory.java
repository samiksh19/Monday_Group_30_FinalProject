/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Pharmaceutical;

import Business.Porter.Porter;
import Business.Role.SysAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author samik
 */

public class Inventory {
    ArrayList<Medicines> itemList = new ArrayList<Medicines>();

    public ArrayList<Medicines> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Medicines> itemList) {
        this.itemList = itemList;
    }
    
    public void addItem(Medicines item){
        itemList.add(item);
    }
    
    public void removeItem(Medicines item){
        itemList.remove(item);
    }
}