/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PatientRole;

import Business.Business;
import Business.InsuranceBody.InsuranceBody;
import Business.InsuranceBody.InsuranceProviderDirectory;
import Business.Patients.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.InsuranceWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author prach
 */
public class InsuranceClaimApprovalForm extends javax.swing.JPanel {

    /**
     * Creates new form InsuranceClaimApprovalForm
     */
    JPanel userProcessContainer;
    Business business;
    UserAccount userAccount;
    Patient patient;
    InsuranceProviderDirectory insuranceProviderDirectory;
    private int indexTreatment = -1;
    private int indexInsuranceAdmin = -1;
    ArrayList<String> treatmentFillList;

    public InsuranceClaimApprovalForm(JPanel userProcessContainer, UserAccount userAccount, Business business) {
        initComponents();
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userAccount = userAccount;
        patient = (Patient) userAccount;
        insuranceProviderDirectory = business.getInsuranceProviderDirectory();
        treatmentFillList = new ArrayList<String>();
//        fillDropDownList(insuranceProviderDirectory.getInsuranceProviderList());
//        fillTreatmentList(treatmentFillList);
    }
        
    public void fillDropDownList(ArrayList<InsuranceBody> insuranceProviderList) {
        for (InsuranceBody insurance : insuranceProviderList) {
            insuranceCombo.addItem(insurance.getInsuranceProviderName());
        }
    }
    
    public void fillTreatmentList(ArrayList<String> treatmentFillList) {
        treatmentFillList.add("Consultation");
        treatmentFillList.add("Medicines Purchased");
        treatmentFillList.add("Surgicial Routine");
        for (String treatment : treatmentFillList) {
            treatmentList.addItem(treatment);
        }
    }
    
    private boolean creatingOrder() {
        InsuranceWorkRequest orderWorkRequest = new InsuranceWorkRequest();
        orderWorkRequest.setClaimAmount(Integer.parseInt(amount.getText()));
        orderWorkRequest.setPatientName(patientName.getText());
        orderWorkRequest.setTreatment(treatmentList.getSelectedItem().toString());
            orderWorkRequest.setMessage("Claim Approval");
            if (patient != null) {
                orderWorkRequest.setPatient(patient);
            } else {
                return false;
            }
            InsuranceBody insurance = insuranceProviderDirectory.getInsuranceProviderList().get(indexInsuranceAdmin);
            
            if (insurance != null) {
                orderWorkRequest.setInsurance(insurance);                
            } else {
                return false;
            }
            orderWorkRequest.setRequestDate(new Date());
            orderWorkRequest.setStatus("Request to Insurance Admin");
            business.getWorkQueue().addWorkRequest(orderWorkRequest);
            return true;
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
        claimAmount = new javax.swing.JLabel();
        patientName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        insuranceCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        sendToCDCbtn = new javax.swing.JButton();
        btnBack2 = new javax.swing.JButton();
        treatmentList = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        claimAmount.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        claimAmount.setForeground(new java.awt.Color(255, 255, 255));
        claimAmount.setText("Claim Amount");

        patientName.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Patient Name");

        amount.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Treatment");

        enterpriseLabel1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel1.setText("Choose Insurance Admin");

        insuranceCombo.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        insuranceCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insuranceCombosetIndexForAdmin(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLAIM INFORMATION");

        sendToCDCbtn.setBackground(new java.awt.Color(255, 255, 204));
        sendToCDCbtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        sendToCDCbtn.setText("Send to Insurance Admin");
        sendToCDCbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToCDCbtnsendToInsuranceAdminbtnActionPerformed(evt);
            }
        });

        btnBack2.setBackground(new java.awt.Color(255, 255, 204));
        btnBack2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnBack2.setText("Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        treatmentList.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        treatmentList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treatmentListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                    .addGap(273, 273, 273)
                    .addComponent(jLabel7))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(262, 262, 262)
                    .addComponent(claimAmount)
                    .addGap(520, 520, 520)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(enterpriseLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(treatmentList, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(103, 103, 103)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(insuranceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addComponent(sendToCDCbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insuranceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(claimAmount)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(treatmentList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(sendToCDCbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void insuranceCombosetIndexForAdmin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insuranceCombosetIndexForAdmin
        // TODO add your handling code here:
        indexInsuranceAdmin = insuranceCombo.getSelectedIndex();
    }//GEN-LAST:event_insuranceCombosetIndexForAdmin

    private void sendToCDCbtnsendToInsuranceAdminbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToCDCbtnsendToInsuranceAdminbtnActionPerformed
        // TODO add your handling code here:
        if (claimAmount.getText().isEmpty() || patientName.getText().isEmpty() || indexInsuranceAdmin==-1 || indexTreatment == -1) {
            JOptionPane.showMessageDialog(null, "Enter all fields");
        }
        InsuranceWorkRequest orderWorkRequest = new InsuranceWorkRequest();
//        creatingOrder();
        amount.setText("");
        patientName.setText("");
        JOptionPane.showMessageDialog(null, "Sent to Insurance Admin");

    }//GEN-LAST:event_sendToCDCbtnsendToInsuranceAdminbtnActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
        PatientAreaPanel patientAreaJPanel = new PatientAreaPanel(userProcessContainer, userAccount, business);
        userProcessContainer.add("PatientAreaJPanel", patientAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBack2ActionPerformed

    private void treatmentListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treatmentListActionPerformed
        // TODO add your handling code here:
        indexTreatment = treatmentList.getSelectedIndex();
    }//GEN-LAST:event_treatmentListActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JButton btnBack2;
    private javax.swing.JLabel claimAmount;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JComboBox<String> insuranceCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField patientName;
    private javax.swing.JButton sendToCDCbtn;
    private javax.swing.JComboBox<String> treatmentList;
    // End of variables declaration//GEN-END:variables
}
