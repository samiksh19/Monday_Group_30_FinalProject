/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PatientRole;

import Business.Account.Account;
import Business.Account.AccountDirectory;
import Business.Business;
import Business.Doctors.Doctor;
import Business.Doctors.DoctorDirectory;
import Business.Nurse.Nurse;
import Business.Nurse.NurseDirectory;
import Business.Patients.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.LabWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prach
 */
public class AppointmentSchedule extends javax.swing.JPanel {

    /**
     * Creates new form AppointmentSchedule
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Patient patient;
    private DefaultTableModel defaultTableModel;
    private DefaultTableModel defaultCartTable;
    private int index = -1;
    private int row = 0;
    private int column = 0;
    private int quantity = 0;
    private Business business;
    private NurseDirectory nurseDirectory;
    private DoctorDirectory doctorDirectory;
    private AccountDirectory accountDirectory;
    private Random r = new Random();
    public AppointmentSchedule(JPanel userProcessContainer, UserAccount account, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        patient = (Patient) account;
        nurseDirectory = business.getNurseDirectory();
        doctorDirectory = business.getDoctorDirectory();
        accountDirectory = business.getAccountDirectory();
        fillRstList(doctorDirectory.getDoctorList());
        fillTimeCombo(doctorDirectory.getDoctorList());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void fillTimeCombo(ArrayList<Doctor> doctorList) {
        for (Doctor doctor : doctorList) {
            timeCombo1.addItem(doctor.getTime());
        }
    }
    


    public void fillRstList(ArrayList<Doctor> doctorList) {
        for (Doctor doctor : doctorList) {
            rstCombo.addItem(doctor.getName());
        }
    }
    private boolean creatingOrder() {
            LabWorkRequest orderWorkRequest = new LabWorkRequest();
            orderWorkRequest.setMessage(txtMessage.getText());
            if (patient != null) {
                orderWorkRequest.setPatient(patient);
            } else {
                return false;
            }
            Nurse nurse = nurseDirectory.getReceptionList().get(index);
            Doctor doctor = doctorDirectory.getDoctorList().get(rstCombo.getSelectedIndex());
//            Account account = accountDirectory.getAccountList().get(0);
            Account account;
            try {
                account = accountDirectory.getAccountList().get(0);
            } catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Account not found.");
                return false;
            }
            if (nurse != null) {
                orderWorkRequest.setReception(nurse);
                orderWorkRequest.setDoctor(doctor);
                orderWorkRequest.setAccount(account);
            } else {
                return false;
            }
            orderWorkRequest.setRequestDate(new Date());
            orderWorkRequest.setStatus("Request to Hospital");
            orderWorkRequest.setBill("1200");
            business.getWorkQueue().addWorkRequest(orderWorkRequest);
            return true;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        rstCombo = new javax.swing.JComboBox<>();
        enterpriseLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        enterpriseLabel3 = new javax.swing.JLabel();
        timeCombo1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        requestTestJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(163, 186, 195));

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel1.setText("Message");

        txtMessage.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N

        rstCombo.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        rstCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rstComboActionPerformed(evt);
            }
        });

        enterpriseLabel1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        enterpriseLabel1.setText("Choose Doctor");

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 51, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MAKE AN APPOINTMENT");

        enterpriseLabel3.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        enterpriseLabel3.setText("Choose Time");

        timeCombo1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        timeCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeCombo1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/PatientRole/a3.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        btnback.setBackground(new java.awt.Color(0, 105, 137));
        btnback.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        requestTestJButton.setBackground(new java.awt.Color(0, 105, 137));
        requestTestJButton.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setText("Book Appointment");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel3.setText("Incase of any symptoms or queries, book an appointment to notify the Doctor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnback)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(enterpriseLabel1)
                                            .addComponent(enterpriseLabel3)
                                            .addComponent(jLabel1))
                                        .addGap(84, 84, 84)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtMessage, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(timeCombo1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(rstCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(jLabel3)))
                                .addContainerGap(216, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(requestTestJButton)
                                .addGap(295, 295, 295))))))
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(enterpriseLabel1)
                                        .addGap(64, 64, 64))
                                    .addComponent(enterpriseLabel3))
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rstCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(timeCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65)
                        .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(363, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rstComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rstComboActionPerformed
        index = rstCombo.getSelectedIndex();
    }//GEN-LAST:event_rstComboActionPerformed

    private void timeCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeCombo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeCombo1ActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        PatientAreaPanel customerAreaJPanel = new PatientAreaPanel(userProcessContainer, userAccount, business);
        userProcessContainer.add("DeliveryManWorkAreaJPanel", customerAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        if (creatingOrder()) {
            JOptionPane.showMessageDialog(null, "Appointment Booked");
            AppointmentInfo requestLabTestJPanel = new AppointmentInfo(userProcessContainer, business, patient);
            userProcessContainer.add("RequestLabTestJPanel", requestLabTestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_requestTestJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel enterpriseLabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JComboBox<String> rstCombo;
    private javax.swing.JComboBox<String> timeCombo1;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
