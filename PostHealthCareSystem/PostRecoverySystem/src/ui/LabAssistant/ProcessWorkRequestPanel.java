/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.LabAssistant;

import Business.Business;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.LabWorkRequest;
import java.awt.CardLayout;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author prach
 */
public class ProcessWorkRequestPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessWorkRequestPanel
     */
    
    JPanel userProcessContainer;
    Business business;
    UserAccount userAccount;
    LabWorkRequest workRequest;
    LabWorkRequest labTestWorkRequest;
    Random r = new Random();
    String[] report = {"Normal","Below Normal","Above Normal","Visit the Doctor"};
    private int index = -1;
    
    public ProcessWorkRequestPanel(JPanel userProcessContainer, Business business, UserAccount account, LabWorkRequest workRequest) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userAccount = account;
        this.workRequest = workRequest;
        fillTest();
        changeButtonText();
        display();
    }
    
        private void fillTest(){
        comboRstTest.addItem("X-ray");
        comboRstTest.addItem("Blood Test");
        comboRstTest.addItem("Urine Test");
        comboRstTest.addItem("Stool Test");
        comboRstTest.addItem("Swab Test");
        comboRstTest.addItem("CT-scan");
        comboRstTest.addItem("Sonography Test");
        comboRstTest.addItem("MRI");
    }

    private void display() {

        customerNameValue.setText(workRequest.getHospitalAdmin().getHospitalName());
        status.setText(workRequest.getStatus());

    }

    private void changeButtonText() {
        switch (workRequest.getStatus()) {
            case "Request to LabAssistant":
                btnStatus.setText("Start Lab");
                break;
            case "Lab in Process":
                btnStatus.setText("Complete Lab Results");
                break;
            default:
                btnStatus.setVisible(false);
        }
    }
    
    private void sendMail(){
        String from = "dalealphonso7@gmail.com";
        String pass = "fvsk kwtq rfzf prti";
        System.out.print("Username"+workRequest.getPatient().getEmail());
        String[] to = { workRequest.getPatient().getEmail() }; // list of recipient email addresses
        String subject = "LAB RESULTS";
        String body = workRequest.getTestType()+" results are now ready, "+report[r.nextInt(4)];

        sendFromGMail(from, pass, to, subject, body);
    }
    
    private static void sendFromGMail(String from, String pass, String[] to, String subject, String body) {
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
         
         props.put("mail.smtp.host", "smtp.gmail.com"); 
         props.put("mail.smtp.port", "587"); 
         props.put("mail.smtp.auth", "true"); 
         props.put("mail.smtp.starttls.enable", "true"); 
         props.put("mail.smtp.ssl.protocols", "TLSv1.2");

        Session session = Session.getInstance(props, new javax.mail.Authenticator(){
            protected javax.mail.PasswordAuthentication getPasswordAuthenticator(){
                return new javax.mail.PasswordAuthentication(from, pass);
            }
        });
        

        try {
            
           Message message = new MimeMessage(session);            
            InternetAddress[] toAddress = new InternetAddress[to.length];
            message.setFrom(new InternetAddress("no-reply@gmail.com"));

            // To get the array of addresses
            for( int i = 0; i < to.length; i++ ) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for( int i = 0; i < toAddress.length; i++) {
                message.setRecipient(Message.RecipientType.TO, toAddress[i]);
            }

            message.setSubject(subject);
            message.setText(body);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }
        catch (AddressException ae) {
            ae.printStackTrace();
        }
        catch (MessagingException me) {
            me.printStackTrace();
        }
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
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        customerNameValue = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        comboRstTest = new javax.swing.JComboBox<>();
        btnStatus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("LAB DETAILS");

        jLabel5.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Status");

        jLabel3.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Admin Name");

        enterpriseLabel1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel1.setText("Select Test");

        customerNameValue.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        customerNameValue.setText("<Value>");

        status.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        status.setText("<Value>");

        btnStatus.setBackground(new java.awt.Color(255, 255, 204));
        btnStatus.setText("START LAB");
        btnStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/LabAssistant/labres.gif"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton1)
                        .addGap(145, 145, 145)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(42, 42, 42)
                                .addComponent(customerNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel5)
                                .addGap(41, 41, 41)
                                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(enterpriseLabel1)
                                .addGap(39, 39, 39)
                                .addComponent(comboRstTest, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(btnStatus)))))
                .addGap(30, 30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel9)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(customerNameValue))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(status))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboRstTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(btnStatus)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 986, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        LabAssistantWorkArea labAssistantWorkAreaJPanel = new LabAssistantWorkArea(userProcessContainer, userAccount, business);
        userProcessContainer.add("LabAssistantWorkAreaJPanel", labAssistantWorkAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusActionPerformed
        // TODO add your handling code here:
        if (workRequest.getStatus().equals("Request to LabAssistant")) {
            String testType = comboRstTest.getSelectedItem().toString();
            workRequest.setTestType(testType);
            workRequest.setStatus("Lab in Process");
            workRequest.setTestResult("In Process");
            JOptionPane.showMessageDialog(null, "Lab in Process");
        } else if (workRequest.getStatus().equals("Lab in Process")) {
            workRequest.setStatus("Lab Completed");
            sendMail();
            workRequest.setTestResult("Completed");
            JOptionPane.showMessageDialog(null, "Lab Results available");
        } else {
            btnStatus.setVisible(false);
        }
        changeButtonText();
        status.setText(workRequest.getStatus());
    }//GEN-LAST:event_btnStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStatus;
    private javax.swing.JComboBox<String> comboRstTest;
    private javax.swing.JLabel customerNameValue;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
