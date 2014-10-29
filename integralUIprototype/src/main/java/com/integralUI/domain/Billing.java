
package com.integralUI.domain;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


public class Billing {

    private List<Rate> rates = new ArrayList<Rate>();
    private List<Pref> prefs = new ArrayList<Pref>();
    private List<Sow> sows = new ArrayList<Sow>();

    public List<Rate> getRates() {
        return rates;
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }

    public List<Pref> getPrefs() {
        return prefs;
    }

    public void setPrefs(List<Pref> prefs) {
        this.prefs = prefs;
    }

    public List<Sow> getSows() {
        return sows;
    }

    public void setSows(List<Sow> sows) {
        this.sows = sows;
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
