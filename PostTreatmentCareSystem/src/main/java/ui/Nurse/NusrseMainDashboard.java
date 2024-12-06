/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Nurse;

import ui.Patient.*;
import Business.Enterprise.ClinicalSupportEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author samik
 */
public class NusrseMainDashboard extends javax.swing.JPanel {

    /**
     * Creates new form MainDashboard
     */
    private JPanel workArea;
    private UserAccount userAccount;
    private final Enterprise enterprise;
    
    public NusrseMainDashboard(JPanel workArea, UserAccount userAccount, Enterprise enterprise) {
        initComponents();
        this.workArea = workArea;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnReminder = new javax.swing.JButton();
        btnFeedback = new javax.swing.JButton();
        btnViewReport = new javax.swing.JButton();
        btnFamilyDetail = new javax.swing.JButton();
        btnInsurancePlan = new javax.swing.JButton();
        btnPatientHistory = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        lblTitle.setText("Welcome, ");

        btnLogout.setText("Logout");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 479, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(jPanel1);

        btnReminder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReminder.setText("View Critical Patients");
        btnReminder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReminderActionPerformed(evt);
            }
        });

        btnFeedback.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFeedback.setText("Feedback");
        btnFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedbackActionPerformed(evt);
            }
        });

        btnViewReport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewReport.setText("Send Reminder");
        btnViewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewReportActionPerformed(evt);
            }
        });

        btnFamilyDetail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFamilyDetail.setText("View Family Details");
        btnFamilyDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFamilyDetailActionPerformed(evt);
            }
        });

        btnInsurancePlan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInsurancePlan.setText("Insurance Recommendation");
        btnInsurancePlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsurancePlanActionPerformed(evt);
            }
        });

        btnPatientHistory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPatientHistory.setText("View Patients ");
        btnPatientHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPatientHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFeedback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(91, 91, 91)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReminder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFamilyDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnViewReport, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(btnInsurancePlan, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPatientHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReminder, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewReport, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFamilyDetail, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(btnInsurancePlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFeedback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(142, 142, 142))
        );

        jSplitPane1.setRightComponent(jPanel2);

        add(jSplitPane1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsurancePlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsurancePlanActionPerformed
        // TODO add your handling code here:
        InsurranceRecommendation panel = new InsurranceRecommendation(workArea, userAccount, (HospitalEnterprise)enterprise);
        workArea.add("InsurranceRecommendation",panel);

        CardLayout layout = (CardLayout) workArea.getLayout();
                layout.next(workArea);  
    }//GEN-LAST:event_btnInsurancePlanActionPerformed

    private void btnPatientHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientHistoryActionPerformed
        // TODO add your handling code here:
        
        ViewPatientHistory panel = new ViewPatientHistory(workArea, userAccount, (HospitalEnterprise)enterprise);
        workArea.add("ViewPatientHistory", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnPatientHistoryActionPerformed

    private void btnReminderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReminderActionPerformed
        // TODO add your handling code here:
         ViewReminder panel = new ViewReminder(workArea, userAccount, (HospitalEnterprise)enterprise);
        workArea.add("ViewReminder", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
       
        layout.next(workArea);
    }//GEN-LAST:event_btnReminderActionPerformed

    private void btnViewReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewReportActionPerformed

    private void btnFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedbackActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) workArea.getLayout();
        workArea.add("CreateFeedbackForm", new CreateFeedbackForm(workArea));
        layout.next(workArea);
               
    }//GEN-LAST:event_btnFeedbackActionPerformed

    private void btnFamilyDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFamilyDetailActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) workArea.getLayout();
        workArea.add("ViewPatientFamilyDetails", new ViewPatientFamilyDetails(workArea, userAccount, (ClinicalSupportEnterprise)enterprise));
        layout.next(workArea);
    }//GEN-LAST:event_btnFamilyDetailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFamilyDetail;
    private javax.swing.JButton btnFeedback;
    private javax.swing.JButton btnInsurancePlan;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPatientHistory;
    private javax.swing.JButton btnReminder;
    private javax.swing.JButton btnViewReport;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
