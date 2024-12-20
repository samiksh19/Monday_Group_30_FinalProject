/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HospitalAdmin;

import Business.Account.Account;
import Business.Account.AccountDirectory;
import Business.AmbulanceDriver.AmbulanceDriver;
import Business.AmbulanceDriver.AmbulanceDriverDirectory;
import Business.Business;
import Business.Doctors.Doctor;
import Business.Doctors.DoctorDirectory;
import Business.Hospital.HospitalAdmin;
import Business.LabAssistant.LabAssistant;
import Business.LabAssistant.LabAssistantDirectory;
import Business.Nurse.Nurse;
import Business.Nurse.NurseDirectory;
import Business.Role.AccountantRole;
import Business.Role.DoctorRole;
import Business.Role.LabExaminerRole;
import Business.Role.NurseRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dalea
 */
public class ManageHospitalStaff extends javax.swing.JPanel {

    /**
     * Creates new form ManageHospitalStaff
     */
    JPanel userProcessContainer;
    Business business;
    UserAccountDirectory userAccountDirectory;
    UserAccount userAccount;
    private int index = -1;
    HospitalAdmin admin = new HospitalAdmin();

   public ManageHospitalStaff(JPanel userProcessContainer,Business business,UserAccount userAccount) {
        initComponents();
        creatingListenerForModification();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userAccount = userAccount;
        for(HospitalAdmin admin1 : business.getHospitalDirectory().getHospitalList()){
            if(admin1.equals(userAccount)){
                admin = admin1;
            }
        }
        populateTable();
        fillRstStaff();
        fillRstDocType();
    }
    
    private void fillRstDocType(){
        comboDoctor.addItem("Paediatrician");
        comboDoctor.addItem("Physician");
        comboDoctor.addItem("Neurologist");
        comboDoctor.addItem("Internist");
        comboDoctor.addItem("Psychiatrists");
        comboDoctor.addItem("Gynaecologist");
        comboDoctor.addItem("Surgeon");
        comboDoctor.addItem("Dermatologist");
        comboDoctor.addItem("Opthalmologist");
    }
    
    private void fillRstStaff(){
        comboStaff.addItem("Doctor");
        comboStaff.addItem("Nurse");
        comboStaff.addItem("Lab");
        comboStaff.addItem("Ambulance");
        comboStaff.addItem("Account");
    }    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnback = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        enterpriseLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        staff = new javax.swing.JTextField();
        txtpswrd = new javax.swing.JTextField();
        comboStaff = new javax.swing.JComboBox<>();
        comboDoctor = new javax.swing.JComboBox<>();
        availdoc = new javax.swing.JTextField();
        btnaddstaff = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(163, 186, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnback.setBackground(new java.awt.Color(0, 105, 137));
        btnback.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 21, 111, 48));

        jLabel1.setBackground(new java.awt.Color(166, 206, 55));
        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE HOSPITAL STAFF");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 578, -1));

        jScrollPane1.setBackground(new java.awt.Color(205, 181, 220));

        tblMenu.setBackground(new java.awt.Color(203, 213, 220));
        tblMenu.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STAFF NAME", "STAFF PASSWORD", "STAFF TYPE", "DOCTOR AVAILABILITY", "DOCTOR TYPE", "ADDRESS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMenu);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 87, 1190, 146));

        jLabel2.setBackground(new java.awt.Color(166, 206, 55));
        jLabel2.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel2.setText("Staff Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        enterpriseLabel1.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        enterpriseLabel1.setText("Staff Type");
        jPanel1.add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        jLabel4.setBackground(new java.awt.Color(166, 206, 55));
        jLabel4.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        enterpriseLabel2.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        enterpriseLabel2.setText("Doctor Type");
        jPanel1.add(enterpriseLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, -1, -1));

        jLabel5.setBackground(new java.awt.Color(166, 206, 55));
        jLabel5.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Doctor Availability");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 610, -1, -1));

        jLabel3.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("***** Fill the below details only for Doctor *****");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 1160, -1));
        jPanel1.add(staff, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 380, -1));
        jPanel1.add(txtpswrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 380, -1));

        jPanel1.add(comboStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 380, -1));

        jPanel1.add(comboDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 370, -1));
        jPanel1.add(availdoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 610, 370, -1));

        btnaddstaff.setBackground(new java.awt.Color(0, 105, 137));
        btnaddstaff.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnaddstaff.setForeground(new java.awt.Color(255, 255, 255));
        btnaddstaff.setText("ADD STAFF");
        btnaddstaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddstaffActionPerformed(evt);
            }
        });
        jPanel1.add(btnaddstaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 700, 198, 48));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        HospitalAdminArea adminWorkAreaJPanel = new HospitalAdminArea(userProcessContainer,userAccount, business);
        userProcessContainer.add("AdminWorkAreaJPanel", adminWorkAreaJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnaddstaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddstaffActionPerformed
        // TODO add your handling code here:

           // Retrieve input values
            String staffName = staff.getText();
            String password = txtpswrd.getText();
            String choice = comboStaff.getSelectedItem().toString();
            String availability = availdoc.getText(); // Availability for doctors

            // Check for empty fields
            if (staffName.isEmpty() || password.isEmpty() || choice.isEmpty()) {
                JOptionPane.showMessageDialog(null, 
                    "Please fill in all fields:\n" +
                    "1. Staff Name\n" +
                    "2. Password\n" +
                    "3. Role Selection");
                return;
            }

            // Additional validation if choice is "Doctor"
            if (choice.equalsIgnoreCase("Doctor") && availability.isEmpty()) {
                JOptionPane.showMessageDialog(null, 
                    "Availability is mandatory for Doctors. Please provide availability time.");
                return;
            }

            // Validate password strength
            boolean PASSWORD_PATTERN = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&+=~|?])(?=\\S+$).{8,}$", password);
            if (!PASSWORD_PATTERN) {
                JOptionPane.showMessageDialog(null, 
                    "Create a strong password with the following requirements:\n" +
                    "1. At least 8 characters long.\n" +
                    "2. Includes uppercase and lowercase letters.\n" +
                    "3. Contains at least one number.\n" +
                    "4. Has at least one special character (!@#$%^&+=~|).");
                txtpswrd.setText("");
                return;
            }

            // Check if the username is unique
            if (!business.getUserAccountDirectory().checkUsernameUnique(staffName)) {
                JOptionPane.showMessageDialog(null, 
                    "The username \"" + staffName + "\" already exists. Please choose a different username.");
                return;
            }

            // Add staff based on role
            switch (choice.toLowerCase()) {
                case "doctor":
                    Doctor doctor = new Doctor();
                    doctor.setName(staffName);
                    doctor.setType(choice);
                    doctor.setDocType(comboDoctor.getSelectedItem().toString());
                    doctor.setTime(availability);
                    doctor.setUsername(staffName);
                    doctor.setPassword(password);
                    doctor.setRole(new DoctorRole());
                    business.getUserAccountDirectory().addUserAccount(doctor);
                    business.getDoctorDirectory().addDoctor(doctor);
                    break;

                case "nurse":
                    Nurse nurse = new Nurse();
                    nurse.setName(staffName);
                    nurse.setType(choice);
                    nurse.setUsername(staffName);
                    nurse.setPassword(password);
                    nurse.setRole(new NurseRole());
                    business.getUserAccountDirectory().addUserAccount(nurse);
                    business.getNurseDirectory().addReception(nurse);
                    break;

                case "ambulance":
                    AmbulanceDriver driver = new AmbulanceDriver();
                    driver.setAmbulanceDriverName(staffName);
                    driver.setType(choice);
                    driver.setUsername(staffName);
                    driver.setPassword(password);
                    business.getUserAccountDirectory().addUserAccount(driver);
                    business.getAmbulanceDirectory().addAmbulanceDriver(driver);
                    break;

                case "lab":
                    LabAssistant labAssistant = new LabAssistant();
                    labAssistant.setLabAssistantName(staffName);
                    labAssistant.setType(choice);
                    labAssistant.setUsername(staffName);
                    labAssistant.setPassword(password);
                    labAssistant.setRole(new LabExaminerRole());
                    business.getUserAccountDirectory().addUserAccount(labAssistant);
                    business.getLabAssistantDirectory().addLabAssistant(labAssistant);
                    break;

                case "account":
                    Account account = new Account();
                    account.setAccountName(staffName);
                    account.setType(choice);
                    account.setUsername(staffName);
                    account.setPassword(password);
                    account.setRole(new AccountantRole());
                    business.getUserAccountDirectory().addUserAccount(account);
                    business.getAccountDirectory().addAccount(account);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid staff type selected.");
                    return;
            }

            // Clear fields and update table
            populateTable();
            staff.setText("");
            txtpswrd.setText("");
            availdoc.setText("");

            JOptionPane.showMessageDialog(null, "Staff member added successfully!");
    }//GEN-LAST:event_btnaddstaffActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availdoc;
    private javax.swing.JButton btnaddstaff;
    private javax.swing.JButton btnback;
    private javax.swing.JComboBox<String> comboDoctor;
    private javax.swing.JComboBox<String> comboStaff;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel enterpriseLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField staff;
    private javax.swing.JTable tblMenu;
    private javax.swing.JTextField txtpswrd;
    // End of variables declaration//GEN-END:variables
private void populateTable() {

            DoctorDirectory doctorDirectory = business.getDoctorDirectory();
            AccountDirectory accountDirectory = business.getAccountDirectory();
            LabAssistantDirectory labAssistantDirectory = business.getLabAssistantDirectory();
            AmbulanceDriverDirectory ambulanceDriverDirectory = business.getAmbulanceDirectory();
            NurseDirectory nurseDirectory = business.getNurseDirectory();
            DefaultTableModel model = (DefaultTableModel) tblMenu.getModel();
            
            model.setRowCount(0);
            for (Doctor doctor : doctorDirectory.getDoctorList()) {

                        Object[] row = new Object[6];
                        row[0] = doctor.getUsername();
                        row[1] = doctor.getPassword();
                        row[2] = doctor.getType();
                        row[3] = doctor.getTime();
                        row[4] = doctor.getDocType();
                        row[5] = admin.getAddress();
                        model.addRow(row);
                    
            }
            for (Account account : accountDirectory.getAccountList()) {

                        Object[] row = new Object[6];
                        row[0] = account.getUsername();
                        row[1] = account.getPassword();
                        row[2] = account.getType();
                        row[5] = admin.getAddress();
                   
                        model.addRow(row);
                    
            }
            for (LabAssistant labAssistant : labAssistantDirectory.getLabAssistantList()) {

                        Object[] row = new Object[6];
                        row[0] = labAssistant.getUsername();
                        row[1] = labAssistant.getPassword();
                        row[2] = labAssistant.getType();
                        row[5] = admin.getAddress();
                        model.addRow(row);
                    
            }
            for (AmbulanceDriver ambDriver : ambulanceDriverDirectory.getAmbulanceDriverList()) {

                        Object[] row = new Object[6];
                        row[0] = ambDriver.getUsername();
                        row[1] = ambDriver.getPassword();
                        row[2] = ambDriver.getType();
                        row[5] = admin.getAddress();
                        model.addRow(row);
                    
            }   
            for (Nurse nurse : nurseDirectory.getReceptionList()) {

                        Object[] row = new Object[6];
                        row[0] = nurse.getUsername();
                        row[1] = nurse.getPassword();
                        row[2] = nurse.getType();
                        row[5] = admin.getAddress();
                        model.addRow(row);
                    
            }
    }
        
    private void creatingListenerForModification() {
       tblMenu.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
           int selectedRow = tblMenu.getSelectedRow();
             if (selectedRow >= 0) {
                  Doctor doctor = (Doctor) tblMenu.getValueAt(selectedRow, 0);
                  Account account = (Account) tblMenu.getValueAt(selectedRow, 0);
                  AmbulanceDriver ambDriver = (AmbulanceDriver) tblMenu.getValueAt(selectedRow, 0);
                  Nurse nurse = (Nurse) tblMenu.getValueAt(selectedRow, 0);
                  LabAssistant labAssistant = (LabAssistant) tblMenu.getValueAt(selectedRow, 0);
                 if(doctor!=null || account!=null || ambDriver!=null || nurse!=null || labAssistant!=null){
                     display(doctor,account,ambDriver,nurse,labAssistant);
                 }
             }
        }
    });
    }
    
    private void display(Doctor doctor,Account account,AmbulanceDriver ambDriver,Nurse nurse,LabAssistant labAssistant) {
        
        if(doctor != null) {
        staff.setText(doctor.getUsername());
        txtpswrd.setText(doctor.getPassword());
        availdoc.setText(doctor.getTime());
        }
        if(account != null){
        staff.setText(account.getUsername());
        txtpswrd.setText(account.getPassword());
        }
        if(ambDriver != null){
        staff.setText(ambDriver.getUsername());
        txtpswrd.setText(ambDriver.getPassword());
        }
        if(nurse != null){
        staff.setText(nurse.getUsername());
        txtpswrd.setText(nurse.getPassword());
        }
        if(labAssistant != null){
        staff.setText(labAssistant.getUsername());
        txtpswrd.setText(labAssistant.getPassword());
        }
    }
}
