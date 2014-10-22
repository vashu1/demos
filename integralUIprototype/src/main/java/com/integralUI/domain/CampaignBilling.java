package com.integralUI.domain;

public class CampaignBilling {
    CampaignBillingImpressions impressions;
    CampaignBillingRates rates;

    public CampaignBillingImpressions getImpressions() {
        return impressions;
    }

    public void setImpressions(CampaignBillingImpressions impressions) {
        this.impressions = impressions;
    }

    public CampaignBillingRates getRates() {
        return rates;
    }

    public void setRates(CampaignBillingRates rates) {
        this.rates = rates;
    }
}
