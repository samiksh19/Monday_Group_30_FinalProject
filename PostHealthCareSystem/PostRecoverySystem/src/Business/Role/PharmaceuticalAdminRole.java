/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Business;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.PharmaAdminRole.PharmaceuticalAdminWorkArea;

/**
 *
 * @author dalea
 */
public class PharmaceuticalAdminRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Business business) {
        return new PharmaceuticalAdminWorkArea(userProcessContainer,account,business);
    }
}
