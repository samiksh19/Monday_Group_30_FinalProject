/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdmin;

import Business.Business;
import Business.InsuranceBody.InsuranceBody;
import Business.InsuranceBody.InsuranceProviderDirectory;
import Business.Role.InsuranceAdminRole;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prach
 */
public class ManageInsuranceProvider extends javax.swing.JPanel {

    /**
     * Creates new form ManagerInsuranceProvider
     */
    JPanel userProcessContainer;
    Business business;
    UserAccountDirectory userAccountList;

    public ManageInsuranceProvider(JPanel userProcessContainer, Business business) {
        initComponents();
        creatingListenerForModification();
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

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        deliveryManNameTextfield = new javax.swing.JTextField();
        passwordTextfield = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeliveryMan = new javax.swing.JTable();
        userNameTextfield = new javax.swing.JTextField();
        backjButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDeliveryMan = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        btnModify.setBackground(new java.awt.Color(255, 255, 204));
        btnModify.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 204));
        btnDelete.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        deliveryManNameTextfield.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        deliveryManNameTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        deliveryManNameTextfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        passwordTextfield.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        passwordTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordTextfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblDeliveryMan.setBackground(new java.awt.Color(204, 255, 204));
        tblDeliveryMan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblDeliveryMan.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        tblDeliveryMan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "USERNAME", "PASSWORD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDeliveryMan.setGridColor(new java.awt.Color(56, 90, 174));
        tblDeliveryMan.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tblDeliveryMan.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblDeliveryMan);

        userNameTextfield.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        userNameTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userNameTextfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        backjButton1.setBackground(new java.awt.Color(255, 255, 204));
        backjButton1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        backjButton1.setText("Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE INSURANCE PROVIDER");

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Name");

        btnDeliveryMan.setBackground(new java.awt.Color(255, 255, 204));
        btnDeliveryMan.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnDeliveryMan.setText("Create");
        btnDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryManbtnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(backjButton1)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jLabel2)
                                .addGap(30, 30, 30)
                                .addComponent(userNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deliveryManNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(btnDeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(userNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(passwordTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deliveryManNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(122, 122, 122)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDeliveryMan.getSelectedRow();
        if (selectedRow >= 0) {

            InsuranceBody insuranceAdmin = (InsuranceBody) tblDeliveryMan.getValueAt(selectedRow, 0);

            insuranceAdmin.setUsername(userNameTextfield.getText());
            insuranceAdmin.setPassword(passwordTextfield.getText());
            insuranceAdmin.setInsuranceProviderName(deliveryManNameTextfield.getText());
            insuranceAdmin.setRole(new InsuranceAdminRole());

            fillTable();
            userNameTextfield.setText("");
            passwordTextfield.setText("");
            deliveryManNameTextfield.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Select a row");
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void fillTable() {
        InsuranceProviderDirectory insuranceAdminDirectory = business.getInsuranceProviderDirectory();
        DefaultTableModel model = (DefaultTableModel) tblDeliveryMan.getModel();

        model.setRowCount(0);

        for (InsuranceBody insuranceAdmin : insuranceAdminDirectory.getInsuranceProviderList()) {
            Object[] row = new Object[4];
            row[0] = insuranceAdmin;
            row[1] = insuranceAdmin.getUsername();
            row[2] = insuranceAdmin.getPassword();
            model.addRow(row);

        }
    }
    
    private void display(InsuranceBody insuranceAdmin) {
        userNameTextfield.setText(insuranceAdmin.getUsername());
        passwordTextfield.setText(insuranceAdmin.getPassword());
        deliveryManNameTextfield.setText(insuranceAdmin.getInsuranceProviderName());
    }

    private void creatingListenerForModification() {
        tblDeliveryMan.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = tblDeliveryMan.getSelectedRow();
                if (selectedRow >= 0) {
                    InsuranceBody insuranceAdmin = (InsuranceBody) tblDeliveryMan.getValueAt(selectedRow, 0);
                    if (insuranceAdmin != null) {
                        display(insuranceAdmin);
                    }
                }
            }
        });
    }

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDeliveryMan.getSelectedRow();

        if (selectedRow >= 0) {
            InsuranceBody admin = (InsuranceBody) tblDeliveryMan.getValueAt(selectedRow, 0);
            InsuranceProviderDirectory insuranceProviderList = business.getInsuranceProviderDirectory();
            insuranceProviderList.deleteInsuranceProvider(admin);
            JOptionPane.showMessageDialog(null, "Insurance Admin" + userNameTextfield.getText() + " deleted");
            fillTable();
            userNameTextfield.setText("");
            passwordTextfield.setText("");
            deliveryManNameTextfield.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Select a row.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkArea sysAdminwjp = (SystemAdminWorkArea) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void btnDeliveryManbtnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryManbtnCreateActionPerformed
        // TODO add your handling code here:
        if (userNameTextfield.getText().isEmpty() || passwordTextfield.getText().isEmpty() || deliveryManNameTextfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter all fields");
            return;
        }
        
        if (business.getUserAccountDirectory().checkUsernameUnique(userNameTextfield.getText())) {
            InsuranceBody insuranceAdmin = new InsuranceBody();
            insuranceAdmin.setInsuranceProviderName(deliveryManNameTextfield.getText());
            insuranceAdmin.setUsername(userNameTextfield.getText());
            insuranceAdmin.setPassword(passwordTextfield.getText());
            insuranceAdmin.setRole(new InsuranceAdminRole());
            business.getUserAccountDirectory().addUserAccount(insuranceAdmin);
            business.getInsuranceProviderDirectory().addInsuranceProvider(insuranceAdmin);

            fillTable();
            userNameTextfield.setText("");
            passwordTextfield.setText("");
            deliveryManNameTextfield.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Username " + userNameTextfield.getText() + " exists");
        }
    }//GEN-LAST:event_btnDeliveryManbtnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeliveryMan;
    private javax.swing.JButton btnModify;
    private javax.swing.JTextField deliveryManNameTextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField passwordTextfield;
    private javax.swing.JTable tblDeliveryMan;
    private javax.swing.JTextField userNameTextfield;
    // End of variables declaration//GEN-END:variables
}
