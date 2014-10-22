package com.integralUI.domain;

import java.util.ArrayList;
import java.util.List;

public class CampaignSettingsKeywords {
    Boolean skip = new Boolean(false);
    List<String> list = new ArrayList<String>();

    public Boolean getSkip() {
        return skip;
    }

    public void setSkip(Boolean skip) {
        this.skip = skip;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
