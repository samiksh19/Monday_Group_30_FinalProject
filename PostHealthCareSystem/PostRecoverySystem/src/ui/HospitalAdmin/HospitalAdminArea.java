/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HospitalAdmin;

import Business.Business;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author dalea
 */
public class HospitalAdminArea extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Business business;
    UserAccount userAccount;
    /**
     * Creates new form HospitalAdminArea
     */
    public HospitalAdminArea(JPanel userProcessContainer, UserAccount userAccount, Business business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business=business;
        this.userAccount = userAccount;   
    }
     private void manageInfo() {
        UpdateHospitalInfoPanel updateRestaurantInfoJPanel = new UpdateHospitalInfoPanel(userProcessContainer,business, userAccount);
        userProcessContainer.add("UpdateRestaurantInfoJPanel",updateRestaurantInfoJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }
    
    private void manageHospitalStaff() {
        ManageHospitalStaff createMenuItemJPanel = new ManageHospitalStaff(userProcessContainer,business,userAccount);
        userProcessContainer.add("CreateMenuItemJPanel",createMenuItemJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }
     private void manageLabAssistant() {
        LabAssistantSchedule labAssistantScheduleJPanel = new LabAssistantSchedule(userProcessContainer,userAccount,business);
        userProcessContainer.add("LabAssistantScheduleJPanel",labAssistantScheduleJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        manageOrganizationJButton = new javax.swing.JButton();
        userJButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(163, 186, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME TO ADMIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 70, 646, 95));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/HospitalAdmin/admin3.gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 490, 490));

        manageOrganizationJButton.setBackground(new java.awt.Color(0, 105, 137));
        manageOrganizationJButton.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        manageOrganizationJButton.setForeground(new java.awt.Color(255, 255, 255));
        manageOrganizationJButton.setText("Manage Hospital Staff");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 260, 58));

        userJButton.setBackground(new java.awt.Color(0, 105, 137));
        userJButton.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        userJButton.setForeground(new java.awt.Color(255, 255, 255));
        userJButton.setText("Manage Lab Assistant");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 260, 58));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1269, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1269, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 957, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed
        manageHospitalStaff();
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        manageLabAssistant();
    }//GEN-LAST:event_userJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    // End of variables declaration//GEN-END:variables
}
