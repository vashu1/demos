package com.integralUI.domain;

public class CampaignSettings {
    Boolean skip = new Boolean(false);
    // brandSafety - whats here?
    CampaignSettingsAdFraud adFraud;
    CampaignSettingsGeo geo;
    CampaignSettingsLanguage language;
    CampaignSettingsRisk risk;
    CampaignSettingsSites sites;
    CampaignSettingsKeywords keywords;

    public Boolean getSkip() {
        return skip;
    }

    public void setSkip(Boolean skip) {
        this.skip = skip;
    }

    public CampaignSettingsAdFraud getAdFraud() {
        return adFraud;
    }

    public void setAdFraud(CampaignSettingsAdFraud adFraud) {
        this.adFraud = adFraud;
    }

    public CampaignSettingsGeo getGeo() {
        return geo;
    }

    public void setGeo(CampaignSettingsGeo geo) {
        this.geo = geo;
    }

    public CampaignSettingsLanguage getLanguage() {
        return language;
    }

    public void setLanguage(CampaignSettingsLanguage language) {
        this.language = language;
    }

    public CampaignSettingsRisk getRisk() {
        return risk;
    }

    public void setRisk(CampaignSettingsRisk risk) {
        this.risk = risk;
    }

    public CampaignSettingsSites getSites() {
        return sites;
    }

    public void setSites(CampaignSettingsSites sites) {
        this.sites = sites;
    }

    public CampaignSettingsKeywords getKeywords() {
        return keywords;
    }

    public void setKeywords(CampaignSettingsKeywords keywords) {
        this.keywords = keywords;
    }
}
