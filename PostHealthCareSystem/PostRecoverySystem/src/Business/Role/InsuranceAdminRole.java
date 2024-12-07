/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.Business;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.InsuranceAdminRole.InsuranceAdmin;
/**
 *
 * @author dalea
 */
public class InsuranceAdminRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Business business) {
        return new InsuranceAdmin(userProcessContainer,account,business);
    }
}
