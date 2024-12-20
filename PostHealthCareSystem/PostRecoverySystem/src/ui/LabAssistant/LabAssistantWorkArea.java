/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.LabAssistant;

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
 * @author prach
 */
public class LabAssistantWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form LabAssistantWorkArea
     */
    private JPanel userProcessContainer;
    private Business business;
    private UserAccount userAccount;
    private List<WorkRequest> workRequestList;

    public LabAssistantWorkArea(JPanel userProcessContainer, UserAccount userAccount, Business business) {
        initComponents();
        creatingListenerForDelInfo();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
        fillDelRqTable();
        System.out.println("Done fillDelRqTable ");
    }

    private void fillDelRqTable() {
        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
        model.setRowCount(0);
        workRequestList = business.getWorkQueue().getWorkRequestListabAssistant(userAccount);
//        System.out.println("workRequestList: "+workRequestList);
        for (WorkRequest request : workRequestList) {
            Object[] row = new Object[patientTable.getColumnCount()];
            row[0] = request;
            row[1] = request.getPatient();
            row[2] = request.getHospitalAdmin();
            row[3] = request.getLabAssistant();
            row[4] = request.getStatus();
            model.addRow(row);

        }
    }

    private void creatingListenerForDelInfo() {
        System.out.println("Start Listener ");
        patientTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = patientTable.getSelectedRow();
                System.out.println("Hello " + selectedRow);
                if (selectedRow >= 0) {
                    WorkRequest request = (WorkRequest) patientTable.getValueAt(selectedRow, 0);
                    System.out.println(patientTable.getValueAt(selectedRow, 0) + " Hello req  " + request);
                    if (request instanceof LabWorkRequest) {
                        LabWorkRequest orderWorkRequest = (LabWorkRequest) patientTable.getValueAt(selectedRow, 0);
                        if (orderWorkRequest != null) {
                            System.out.println(patientTable.getValueAt(selectedRow, 0) + " Inside  " + request);
                            ProcessWorkRequestPanel processOrderJPanel = new ProcessWorkRequestPanel(userProcessContainer, business, userAccount, orderWorkRequest);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(163, 186, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("LAB REQUESTS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 30, 348, 46));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/LabAssistant/labassistant1.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 116, 449, -1));

        patientTable.setBackground(new java.awt.Color(203, 213, 220));
        patientTable.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Patient Name", "Sender", "Receiver", "Lab Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(patientTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 627, 351));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable patientTable;
    // End of variables declaration//GEN-END:variables
}
