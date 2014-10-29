
package com.integralUI.domain;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


public class Additional {

    private String name;
    private String currency;
    private Long displayCPM;
    private Long mobileCPM;
    private Float vastCPM;
    private Long vidJsCPM;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Long getDisplayCPM() {
        return displayCPM;
    }

    public void setDisplayCPM(Long displayCPM) {
        this.displayCPM = displayCPM;
    }

    public Long getMobileCPM() {
        return mobileCPM;
    }

    public void setMobileCPM(Long mobileCPM) {
        this.mobileCPM = mobileCPM;
    }

    public Float getVastCPM() {
        return vastCPM;
    }

    public void setVastCPM(Float vastCPM) {
        this.vastCPM = vastCPM;
    }

    public Long getVidJsCPM() {
        return vidJsCPM;
    }

    public void setVidJsCPM(Long vidJsCPM) {
        this.vidJsCPM = vidJsCPM;
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
