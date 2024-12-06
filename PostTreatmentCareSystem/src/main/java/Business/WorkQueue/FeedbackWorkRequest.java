/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;

/**
 *
 * @author samik
 */
public class FeedbackWorkRequest extends WorkRequest {
    private String response;
    private boolean approval = false;
    private UserAccount approvedBy;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public boolean isApproval() {
        return approval;
    }

    public void setApproval(boolean approval) {
        this.approval = approval;
    }

    public UserAccount getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(UserAccount approvedBy) {
        this.approvedBy = approvedBy;
    }
}
