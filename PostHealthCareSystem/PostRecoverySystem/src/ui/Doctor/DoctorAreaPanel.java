/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Doctor;

import Business.Business;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.LabWorkRequest;
import Business.WorkRequest.WorkRequest;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dalea
 */
public class DoctorAreaPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Business business;
    private UserAccount userAccount;
    private List<WorkRequest> workRequestList;

    /**
     * Creates new form DoctorAreaPanel
     */
    public DoctorAreaPanel(JPanel userProcessContainer, UserAccount userAccount, Business business) {
        initComponents();
        creatingListenerForDelInfo();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
        fillDelRqTable();
    }

    private void fillDelRqTable() {
        DefaultTableModel model = (DefaultTableModel) tblDeliveryManWorkRequest.getModel();
        model.setRowCount(0);
        workRequestList = business.getWorkQueue().getWorkRequestListDoctor(userAccount);
        for (WorkRequest request : workRequestList) {
            Object[] row = new Object[tblDeliveryManWorkRequest.getColumnCount()];
            row[0] = request;
            row[1] = request.getReception();
            row[2] = request.getPatient();
            row[3] = request.getStatus();
            model.addRow(row);
        }
    }

    private void creatingListenerForDelInfo() {
        tblDeliveryManWorkRequest.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = tblDeliveryManWorkRequest.getSelectedRow();
                if (selectedRow >= 0) {
                    WorkRequest request = (WorkRequest) tblDeliveryManWorkRequest.getValueAt(selectedRow, 0);
                    if (request instanceof LabWorkRequest) {
                        LabWorkRequest orderWorkRequest = (LabWorkRequest) tblDeliveryManWorkRequest.getValueAt(selectedRow, 0);
                        if (orderWorkRequest != null) {
                            WorkRequestDocPanel processOrderJPanel = new WorkRequestDocPanel(userProcessContainer, business, userAccount, orderWorkRequest);
                            userProcessContainer.add("ProcessOrderJPanel", processOrderJPanel);
                            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                            layout.next(userProcessContainer);
                        }
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDeliveryManWorkRequest = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(163, 186, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setForeground(new java.awt.Color(203, 213, 220));

        tblDeliveryManWorkRequest.setBackground(new java.awt.Color(203, 213, 220));
        tblDeliveryManWorkRequest.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        tblDeliveryManWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MESSAGE", "SENDER", "RECEIVER", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDeliveryManWorkRequest);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 190, 960, 340));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 251, 789, 310));

        jLabel1.setBackground(new java.awt.Color(107, 220, 236));
        jLabel1.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("APPOINTMENTS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 789, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1215, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1209, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 807, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDeliveryManWorkRequest;
    // End of variables declaration//GEN-END:variables
}
