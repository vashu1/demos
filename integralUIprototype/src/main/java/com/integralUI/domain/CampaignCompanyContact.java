package com.integralUI.domain;

import java.util.ArrayList;
import java.util.List;

public class CampaignCompanyContact {
    Boolean sendFax = new Boolean(false);
    Boolean sendHardCopy = new Boolean(false);
    String name;
    String email;
    String phone;
    String fax;
    String notes;
    List<String> ccEmails = new ArrayList<String>();

    public Boolean getSendFax() {
        return sendFax;
    }

    public void setSendFax(Boolean sendFax) {
        this.sendFax = sendFax;
    }

    public Boolean getSendHardCopy() {
        return sendHardCopy;
    }

    public void setSendHardCopy(Boolean sendHardCopy) {
        this.sendHardCopy = sendHardCopy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<String> getCcEmails() {
        return ccEmails;
    }

    public void setCcEmails(List<String> ccEmails) {
        this.ccEmails = ccEmails;
    }
}

