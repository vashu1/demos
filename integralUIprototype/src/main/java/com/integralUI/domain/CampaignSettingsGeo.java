package com.integralUI.domain;

import java.util.ArrayList;
import java.util.List;

public class CampaignSettingsGeo {
    Boolean skip = new Boolean(false);

    Boolean fileExists = new Boolean(false);
    List<String> where = new ArrayList<String>();

    public Boolean getSkip() {
        return skip;
    }

    public void setSkip(Boolean skip) {
        this.skip = skip;
    }

    public Boolean getFileExists() {
        return fileExists;
    }

    public void setFileExists(Boolean fileExists) {
        this.fileExists = fileExists;
    }

    public List<String> getWhere() {
        return where;
    }

    public void setWhere(List<String> where) {
        this.where = where;
    }
}
