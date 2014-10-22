package com.integralUI.domain;

import java.util.ArrayList;
import java.util.List;

public class CampaignSettingsLanguage {
    Boolean skip = new Boolean(false);

    Boolean all = new Boolean(false);
    List<String> custom = new ArrayList<String>();

    public Boolean getSkip() {
        return skip;
    }

    public void setSkip(Boolean skip) {
        this.skip = skip;
    }

    public Boolean getAll() {
        return all;
    }

    public void setAll(Boolean all) {
        this.all = all;
    }

    public List<String> getCustom() {
        return custom;
    }

    public void setCustom(List<String> custom) {
        this.custom = custom;
    }
}
