/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Porter;

import Business.Business;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.WorkRequest;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author prach
 */
public class PorterWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form PorterWorkArea
     */
    private JPanel userProcessContainer;
    private Business business;
    private UserAccount userAccount;
    private List<WorkRequest> workRequestList;
    public PorterWorkArea(JPanel userProcessContainer, UserAccount userAccount, Business business) {
        initComponents();
//        creatingListenerForDelInfo();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
//        fillDelRqTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
