
package com.integralUI.domain;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


public class Rate {

    private String name;
    private String currency;
    private Float displayCPM;
    private Float mobileCPM;
    private Long vastCPM;
    private Long vidJsCPM;
    private List<Additional> additional = new ArrayList<Additional>();


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

    public Float getDisplayCPM() {
        return displayCPM;
    }

    public void setDisplayCPM(Float displayCPM) {
        this.displayCPM = displayCPM;
    }

    public Float getMobileCPM() {
        return mobileCPM;
    }

    public void setMobileCPM(Float mobileCPM) {
        this.mobileCPM = mobileCPM;
    }

    public Long getVastCPM() {
        return vastCPM;
    }

    public void setVastCPM(Long vastCPM) {
        this.vastCPM = vastCPM;
    }

    public Long getVidJsCPM() {
        return vidJsCPM;
    }

    public void setVidJsCPM(Long vidJsCPM) {
        this.vidJsCPM = vidJsCPM;
    }

    public List<Additional> getAdditional() {
        return additional;
    }

    public void setAdditional(List<Additional> additional) {
        this.additional = additional;
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
