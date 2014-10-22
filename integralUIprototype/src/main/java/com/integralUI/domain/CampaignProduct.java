package com.integralUI.domain;


public class CampaignProduct {
    CampaignProductMediaTypes mediaTypes;
    String packageName;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public CampaignProductMediaTypes getMediaTypes() {
        return mediaTypes;
    }

    public void setMediaTypes(CampaignProductMediaTypes mediaTypes) {
        this.mediaTypes = mediaTypes;
    }
}

