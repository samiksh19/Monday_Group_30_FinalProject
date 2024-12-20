/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdmin;

import Business.Business;
import Business.Dashboard.Dashboard;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author prach
 */
public class SystemAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkArea
     */
    JPanel userProcessContainer;
    Business business;
    
    public SystemAdminWorkArea(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
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
        btnManageHospital = new javax.swing.JButton();
        btnManagePharmacy = new javax.swing.JButton();
        btnManageGovernment = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnManageHospital1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(163, 186, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageHospital.setBackground(new java.awt.Color(0, 105, 137));
        btnManageHospital.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnManageHospital.setForeground(new java.awt.Color(255, 255, 255));
        btnManageHospital.setText("Dashboard");
        btnManageHospital.setBorderPainted(false);
        btnManageHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageHospitalActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 370, 60));

        btnManagePharmacy.setBackground(new java.awt.Color(0, 105, 137));
        btnManagePharmacy.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnManagePharmacy.setForeground(new java.awt.Color(255, 255, 255));
        btnManagePharmacy.setText("Manage Pharmacy");
        btnManagePharmacy.setBorderPainted(false);
        btnManagePharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePharmacyActionPerformed(evt);
            }
        });
        jPanel1.add(btnManagePharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 370, 60));

        btnManageGovernment.setBackground(new java.awt.Color(0, 105, 137));
        btnManageGovernment.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnManageGovernment.setForeground(new java.awt.Color(255, 255, 255));
        btnManageGovernment.setText("Manage Insurance Provider");
        btnManageGovernment.setBorderPainted(false);
        btnManageGovernment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageGovernmentbtnManageInsuranceProviderlActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageGovernment, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 370, 60));

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SYSTEM ADMIN DASHBOARD");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 32, 1190, 60));

        btnManageHospital1.setBackground(new java.awt.Color(0, 105, 137));
        btnManageHospital1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnManageHospital1.setForeground(new java.awt.Color(255, 255, 255));
        btnManageHospital1.setText("Manage Hospital");
        btnManageHospital1.setBorderPainted(false);
        btnManageHospital1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageHospital1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageHospital1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 370, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/Admin.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 570, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageHospitalActionPerformed
        // TODO add your handling code here:
 Dashboard ad = new Dashboard();
        System.out.println("Inside admin dashboard");
    }//GEN-LAST:event_btnManageHospitalActionPerformed

    private void btnManagePharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePharmacyActionPerformed
        // TODO add your handling code here:
        ManagePharmacy managePharmacyJPanel =new ManagePharmacy(userProcessContainer, business);
        userProcessContainer.add("managePharmacyJPanel",managePharmacyJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagePharmacyActionPerformed

    private void btnManageGovernmentbtnManageInsuranceProviderlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageGovernmentbtnManageInsuranceProviderlActionPerformed
        // TODO add your handling code here:
        ManageInsuranceProvider manageInsuranceProviderJPanel = new ManageInsuranceProvider(userProcessContainer, business);
        userProcessContainer.add("manageInsuranceProviderJPanel",manageInsuranceProviderJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageGovernmentbtnManageInsuranceProviderlActionPerformed

    private void btnManageHospital1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageHospital1ActionPerformed
        // TODO add your handling code here:
         ManageHospital manageHospitalJPanel =new ManageHospital(userProcessContainer, business);
        userProcessContainer.add("manageHospitalJPanel",manageHospitalJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnManageHospital1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageGovernment;
    private javax.swing.JButton btnManageHospital;
    private javax.swing.JButton btnManageHospital1;
    private javax.swing.JButton btnManagePharmacy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
