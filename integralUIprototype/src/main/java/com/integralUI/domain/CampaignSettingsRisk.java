package com.integralUI.domain;

public class CampaignSettingsRisk {
    Boolean skip = new Boolean(false);
    Long value = new Long(0);

    public Boolean getSkip() {
        return skip;
    }

    public void setSkip(Boolean skip) {
        this.skip = skip;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }
}
