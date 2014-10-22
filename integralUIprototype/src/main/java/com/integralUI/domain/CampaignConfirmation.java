package com.integralUI.domain;

public class CampaignConfirmation {
    String notes;
    Boolean confirmed = new Boolean(false);

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }
}
