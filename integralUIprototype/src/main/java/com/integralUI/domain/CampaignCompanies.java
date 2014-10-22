package com.integralUI.domain;

import java.util.ArrayList;
import java.util.List;

public class CampaignCompanies {
    List<CampaignCompany> companies = new ArrayList<CampaignCompany>();

    public List<CampaignCompany> getCompanies() {
        return companies;
    }

    public void setCompanies(List<CampaignCompany> companies) {
        this.companies = companies;
    }
}
