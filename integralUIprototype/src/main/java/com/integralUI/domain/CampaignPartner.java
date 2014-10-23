package com.integralUI.domain;

import java.util.ArrayList;
import java.util.List;

public class CampaignPartner {
    String name;
    CampaignAddress address;
    List<CampaignPartnerPeople> peoples = new ArrayList<CampaignPartnerPeople>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CampaignAddress getAddress() {
        return address;
    }

    public void setAddress(CampaignAddress address) {
        this.address = address;
    }

    public List<CampaignPartnerPeople> getPeoples() {
        return peoples;
    }

    public void setPeoples(List<CampaignPartnerPeople> peoples) {
        this.peoples = peoples;
    }
}
