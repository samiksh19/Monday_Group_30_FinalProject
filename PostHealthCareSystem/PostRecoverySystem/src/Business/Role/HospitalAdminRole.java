/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.UserAccount.UserAccount;
import Business.Business;
import javax.swing.JPanel;
import ui.HospitalAdmin.HospitalAdminArea;


/**
 *
 * @author dalea
 */
public class HospitalAdminRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Business business) {
        return new HospitalAdminArea(userProcessContainer,account,business);
    }
}
