package com.integralUI.domain;

import java.util.ArrayList;
import java.util.List;

public class CampaignSetup {
    String name;
    String description;
    String brand;
    String product;
    String adserver; // change type?
    String expected;
    String dateStart;
    String dateEnd;
    String market;
    List<CampaignSetupTeamMember> team= new ArrayList<CampaignSetupTeamMember>();
    String welcome;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getAdserver() {
        return adserver;
    }

    public void setAdserver(String adserver) {
        this.adserver = adserver;
    }

    public String getExpected() {
        return expected;
    }

    public void setExpected(String expected) {
        this.expected = expected;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public List<CampaignSetupTeamMember> getTeam() {
        return team;
    }

    public void setTeam(List<CampaignSetupTeamMember> team) {
        this.team = team;
    }

    public String getWelcome() {
        return welcome;
    }

    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }
}


