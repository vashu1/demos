
package com.integralUI.domain;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


public class Preferences {

    private Boolean faxACopy;
    private Boolean billInUkPounds;
    private Boolean billForVat;
    private String notes;
    private String cc;


    public Boolean getFaxACopy() {
        return faxACopy;
    }

    public void setFaxACopy(Boolean faxACopy) {
        this.faxACopy = faxACopy;
    }

    public Boolean getBillInUkPounds() {
        return billInUkPounds;
    }

    public void setBillInUkPounds(Boolean billInUkPounds) {
        this.billInUkPounds = billInUkPounds;
    }

    public Boolean getBillForVat() {
        return billForVat;
    }

    public void setBillForVat(Boolean billForVat) {
        this.billForVat = billForVat;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }
}
