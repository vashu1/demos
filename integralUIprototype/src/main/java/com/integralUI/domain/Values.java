
package com.integralUI.domain;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


public class Values {

    private Long adult;
    private Long alhohol;
    private Long downloads;
    private Long drugs;
    private Long hspreech;
    private Long offensiveLanguage;
    private Long violence;
    private Long atc;
    private Long rsa;


    public Long getAdult() {
        return adult;
    }

    public void setAdult(Long adult) {
        this.adult = adult;
    }

    public Long getAlhohol() {
        return alhohol;
    }

    public void setAlhohol(Long alhohol) {
        this.alhohol = alhohol;
    }

    public Long getDownloads() {
        return downloads;
    }

    public void setDownloads(Long downloads) {
        this.downloads = downloads;
    }

    public Long getDrugs() {
        return drugs;
    }

    public void setDrugs(Long drugs) {
        this.drugs = drugs;
    }

    public Long getHspreech() {
        return hspreech;
    }

    public void setHspreech(Long hspreech) {
        this.hspreech = hspreech;
    }

    public Long getOffensiveLanguage() {
        return offensiveLanguage;
    }

    public void setOffensiveLanguage(Long offensiveLanguage) {
        this.offensiveLanguage = offensiveLanguage;
    }

    public Long getViolence() {
        return violence;
    }

    public void setViolence(Long violence) {
        this.violence = violence;
    }

    public Long getAtc() {
        return atc;
    }

    public void setAtc(Long atc) {
        this.atc = atc;
    }

    public Long getRsa() {
        return rsa;
    }

    public void setRsa(Long rsa) {
        this.rsa = rsa;
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
