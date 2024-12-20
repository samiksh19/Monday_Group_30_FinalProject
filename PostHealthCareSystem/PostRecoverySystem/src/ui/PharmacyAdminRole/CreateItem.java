/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PharmacyAdminRole;

import Business.Business;
import Business.Pharmacy.Pharmacy;
import Business.UserAccount.UserAccount;
import Business.Pharmacy.PharmacyInventory;
import Business.Pharmacy.PharmacyMedicine;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prach
 */
public class CreateItem extends javax.swing.JPanel {

    /**
     * Creates new form CreateItem
     */
    JPanel userProcessContainer;
    Business business;
    UserAccount userAccount;
    Pharmacy pharmacy;
    private DefaultTableModel defaultTableModel;
    private List<PharmacyInventory> itemQuantityList = new ArrayList<>();
    public CreateItem(JPanel userProcessContainer, UserAccount userAccount, Business business) {
        initComponents();
        initListners();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userAccount = userAccount;
        defaultTableModel = (DefaultTableModel) tblMenu.getModel();
        pharmacy = (Pharmacy) userAccount;
        populateTable(); 
    }
    private void populateTable() {
        PharmacyInventory menu = pharmacy.getMenu();
        DefaultTableModel model = (DefaultTableModel) tblMenu.getModel();
        model.setRowCount(0);
        if(menu != null){
        for (PharmacyMedicine item : menu.getItemList()) {

            Object[] row = new Object[3];
            row[0] = item;
            row[1] = item.getPrice();
            row[2] = item.getQty();
            model.addRow(row);
        }
        }
    }

    private void display(PharmacyMedicine item) {
        itemName.setText(item.getName());
        itemPrice.setText(String.valueOf(item.getPrice()));
        itemQty.setText(String.valueOf(item.getQty()));

    }
    private void initListners() {
        tblMenu.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = tblMenu.getSelectedRow();
                if (selectedRow >= 0) {
                    PharmacyMedicine item = (PharmacyMedicine) tblMenu.getValueAt(selectedRow, 0);
                    if (item != null) {
                        display(item);
                    }
                }
            }
        });
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        itemName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        itemPrice = new javax.swing.JTextField();
        btnAddItem = new javax.swing.JButton();
        btnUpdateItem = new javax.swing.JButton();
        btnBack2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        itemQty = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(163, 186, 195));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE INVENTORY");

        tblMenu.setForeground(new java.awt.Color(204, 255, 204));
        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM NAME", "ITEM PRICE", "ITEM QUANTITY"
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
        jScrollPane1.setViewportView(tblMenu);

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel2.setText("Item Name");

        itemName.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel3.setText("Item Price");

        itemPrice.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N

        btnAddItem.setBackground(new java.awt.Color(0, 105, 137));
        btnAddItem.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnAddItem.setForeground(new java.awt.Color(255, 255, 255));
        btnAddItem.setText("Add Item");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnUpdateItem.setBackground(new java.awt.Color(0, 105, 137));
        btnUpdateItem.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnUpdateItem.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateItem.setText("Update");
        btnUpdateItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateItemActionPerformed(evt);
            }
        });

        btnBack2.setBackground(new java.awt.Color(0, 105, 137));
        btnBack2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnBack2.setForeground(new java.awt.Color(255, 255, 255));
        btnBack2.setText("Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel4.setText("Item Quantity");

        itemQty.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jLabel2)
                                .addGap(36, 36, 36)
                                .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jLabel3)
                                .addGap(35, 35, 35)
                                .addComponent(itemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1076, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(jLabel4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(btnUpdateItem, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(itemQty, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(itemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(itemQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateItem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(269, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1208, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 888, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        if (itemName.getText().isEmpty() || itemPrice.getText().isEmpty() || itemQty.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter all fields");
            return;
        }
        if(pharmacy.getMenu() != null){
            for (PharmacyMedicine item : pharmacy.getMenu().getItemList()) {
                if (itemName.getText().equals(item.getName())) {
                    JOptionPane.showMessageDialog(null, "Duplicate Items");
                    return;
                }
            }
        }
        double price = 0.0;
        int qty = 0;
        try {
            price = Double.valueOf(itemPrice.getText());
            qty = Integer.valueOf(itemQty.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter a valid number");
            return;
        }

        PharmacyMedicine item = new PharmacyMedicine(itemName.getText(), Double.valueOf(itemPrice.getText()),Integer.valueOf(itemQty.getText()));

        if(pharmacy.getMenu() != null){
            pharmacy.getMenu().addItem(item);
            populateTable();
            itemName.setText("");
            itemPrice.setText("");
            itemQty.setText("");
        } else{
            PharmacyInventory menu = new PharmacyInventory();
            menu.addItem(item);
            pharmacy.setMenu(menu);
            populateTable();
            itemName.setText("");
            itemPrice.setText("");
            itemQty.setText("");
        }
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnUpdateItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateItemActionPerformed
        int selectedRow = tblMenu.getSelectedRow();
        if (selectedRow >= 0) {

            PharmacyMedicine item = (PharmacyMedicine) tblMenu.getValueAt(selectedRow, 0);
            item.setName(itemName.getText());
            item.setPrice(Double.valueOf(itemPrice.getText()));
            item.setQty(Integer.valueOf(itemQty.getText()));
            populateTable();
            itemName.setText("");
            itemPrice.setText("");
            itemQty.setText("");

        } else {
            JOptionPane.showMessageDialog(null,"Pick a row");
        }
    }//GEN-LAST:event_btnUpdateItemActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        PharmacyAdminWorkArea adminWorkAreaJPanel = new PharmacyAdminWorkArea(userProcessContainer,userAccount, business);
        userProcessContainer.add("AdminWorkAreaJPanel", adminWorkAreaJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBack2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnUpdateItem;
    private javax.swing.JTextField itemName;
    private javax.swing.JTextField itemPrice;
    private javax.swing.JTextField itemQty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMenu;
    // End of variables declaration//GEN-END:variables
}
