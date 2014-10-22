package com.integralUI.domain;


public class CampaignBillingRates {
    Boolean correct = new Boolean(false);
    CampaignBillingRatesCorrections corrections;
    String currencyCPM;

    public Boolean getCorrect() {
        return correct;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }

    public CampaignBillingRatesCorrections getCorrections() {
        return corrections;
    }

    public void setCorrections(CampaignBillingRatesCorrections corrections) {
        this.corrections = corrections;
    }

    public String getCurrencyCPM() {
        return currencyCPM;
    }

    public void setCurrencyCPM(String currencyCPM) {
        this.currencyCPM = currencyCPM;
    }
}
