package com.integralUI.domain;

public class CampaignPartnerPeople {
    String managerName;
    String managerEmail;
    String managerPhone;
    Boolean managerAccess = new Boolean(false);
    String billingName;
    String billingEmail;
    String billingPhone;
    Boolean billingAccess = new Boolean(false);

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }

    public String getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }

    public Boolean getManagerAccess() {
        return managerAccess;
    }

    public void setManagerAccess(Boolean managerAccess) {
        this.managerAccess = managerAccess;
    }

    public String getBillingName() {
        return billingName;
    }

    public void setBillingName(String billingName) {
        this.billingName = billingName;
    }

    public String getBillingEmail() {
        return billingEmail;
    }

    public void setBillingEmail(String billingEmail) {
        this.billingEmail = billingEmail;
    }

    public String getBillingPhone() {
        return billingPhone;
    }

    public void setBillingPhone(String billingPhone) {
        this.billingPhone = billingPhone;
    }

    public Boolean getBillingAccess() {
        return billingAccess;
    }

    public void setBillingAccess(Boolean billingAccess) {
        this.billingAccess = billingAccess;
    }
}