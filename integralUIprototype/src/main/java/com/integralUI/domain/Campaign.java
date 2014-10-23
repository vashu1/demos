package com.integralUI.domain;

import java.util.ArrayList;
import java.util.List;

public class Campaign {
    CampaignSetup setup;
    CampaignProduct product;
    List<CampaignPartner> partners = new ArrayList<CampaignPartner>();
    CampaignBilling billing;
    List<CampaignCompany> companies = new ArrayList<CampaignCompany>();
    CampaignSettings settings;
    CampaignConfirmation confirmation;

    public CampaignSetup getSetup() {
        return setup;
    }

    public void setSetup(CampaignSetup setup) {
        this.setup = setup;
    }

    public CampaignProduct getProduct() {
        return product;
    }

    public void setProduct(CampaignProduct product) {
        this.product = product;
    }

    public List<CampaignPartner> getPartners() {
        return partners;
    }

    public void setPartners(List<CampaignPartner> partners) {
        this.partners = partners;
    }

    public CampaignBilling getBilling() {
        return billing;
    }

    public void setBilling(CampaignBilling billing) {
        this.billing = billing;
    }

    public List<CampaignCompany> getCompanies() {
        return companies;
    }

    public void setCompanies(List<CampaignCompany> companies) {
        this.companies = companies;
    }

    public CampaignSettings getSettings() {
        return settings;
    }

    public void setSettings(CampaignSettings settings) {
        this.settings = settings;
    }

    public CampaignConfirmation getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(CampaignConfirmation confirmation) {
        this.confirmation = confirmation;
    }
}
