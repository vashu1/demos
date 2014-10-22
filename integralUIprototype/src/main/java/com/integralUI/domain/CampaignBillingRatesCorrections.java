package com.integralUI.domain;

public class CampaignBillingRatesCorrections {
    Long displayCPM = new Long(0);
    Long displayMinimum = new Long(0);
    Long videoJSCPM = new Long(0);
    Long videoJSMinimum = new Long(0);
    Long vastCPM = new Long(0);
    Long vastMinimum = new Long(0);

    public Long getDisplayCPM() {
        return displayCPM;
    }

    public void setDisplayCPM(Long displayCPM) {
        this.displayCPM = displayCPM;
    }

    public Long getDisplayMinimum() {
        return displayMinimum;
    }

    public void setDisplayMinimum(Long displayMinimum) {
        this.displayMinimum = displayMinimum;
    }

    public Long getVideoJSCPM() {
        return videoJSCPM;
    }

    public void setVideoJSCPM(Long videoJSCPM) {
        this.videoJSCPM = videoJSCPM;
    }

    public Long getVideoJSMinimum() {
        return videoJSMinimum;
    }

    public void setVideoJSMinimum(Long videoJSMinimum) {
        this.videoJSMinimum = videoJSMinimum;
    }

    public Long getVastCPM() {
        return vastCPM;
    }

    public void setVastCPM(Long vastCPM) {
        this.vastCPM = vastCPM;
    }

    public Long getVastMinimum() {
        return vastMinimum;
    }

    public void setVastMinimum(Long vastMinimum) {
        this.vastMinimum = vastMinimum;
    }
}