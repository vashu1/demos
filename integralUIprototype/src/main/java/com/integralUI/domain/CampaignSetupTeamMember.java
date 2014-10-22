package com.integralUI.domain;

/**
 * Created with IntelliJ IDEA.
 * User: ibondar
 * Date: 22/10/14
 * Time: 17:00
 * To change this template use File | Settings | File Templates.
 */
public class CampaignSetupTeamMember {
    String name;

    String email;

    CampaignSetupTeamMember(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
