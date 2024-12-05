/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Roles.Role;
import Business.Roles.AdminRole;
import java.util.ArrayList;


/**
 *
 * @author dalea
 */
public class Business extends Organization{
    
    private static Business business;
    private ArrayList<Network> networkList;
    
    public static Business getInstance(){
        if(business==null){
            business=new Business();
        }
        return business;
    }

    public Business() {
        super(null);
    }
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
//    @Override
//    public ArrayList<Role> getSupportedRole() {
//        ArrayList<Role> roleList=new ArrayList<Role>();
//        roleList.add(new AdminRole());
//        return roleList;
//    }
//    
//    private Business(){
//        super(null);
//        networkList=new ArrayList<Network>();
//    }
     public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    
}
