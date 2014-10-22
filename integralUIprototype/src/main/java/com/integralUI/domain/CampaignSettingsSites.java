package com.integralUI.domain;

import java.util.ArrayList;
import java.util.List;

public class CampaignSettingsSites {
    Boolean skip = new Boolean(false);
    List<String> blacklist = new ArrayList<String>();
    List<String> whitelist = new ArrayList<String>();
    List<String> required = new ArrayList<String>();

    public Boolean getSkip() {
        return skip;
    }

    public void setSkip(Boolean skip) {
        this.skip = skip;
    }

    public List<String> getBlacklist() {
        return blacklist;
    }

    public void setBlacklist(List<String> blacklist) {
        this.blacklist = blacklist;
    }

    public List<String> getWhitelist() {
        return whitelist;
    }

    public void setWhitelist(List<String> whitelist) {
        this.whitelist = whitelist;
    }

    public List<String> getRequired() {
        return required;
    }

    public void setRequired(List<String> required) {
        this.required = required;
    }
}
