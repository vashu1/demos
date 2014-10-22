package com.integralUI.domain;

public class CampaignBillingImpressionsCustomPartners {
    String company;
    Boolean billCompany = new Boolean(false);
    CampaignProductMediaTypes mediaTypes;
    String expectedImpressions;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Boolean getBillCompany() {
        return billCompany;
    }

    public void setBillCompany(Boolean billCompany) {
        this.billCompany = billCompany;
    }

    public CampaignProductMediaTypes getMediaTypes() {
        return mediaTypes;
    }

    public void setMediaTypes(CampaignProductMediaTypes mediaTypes) {
        this.mediaTypes = mediaTypes;
    }

    public String getExpectedImpressions() {
        return expectedImpressions;
    }

    public void setExpectedImpressions(String expectedImpressions) {
        this.expectedImpressions = expectedImpressions;
    }
}
