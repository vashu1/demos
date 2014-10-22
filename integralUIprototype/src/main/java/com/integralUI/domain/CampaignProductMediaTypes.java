package com.integralUI.domain;

public class CampaignProductMediaTypes {
    Boolean display = new Boolean(false);
    Boolean mobile = new Boolean(false);
    Boolean videoVAST = new Boolean(false);
    Boolean videoJS = new Boolean(false);

    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    public Boolean getMobile() {
        return mobile;
    }

    public void setMobile(Boolean mobile) {
        this.mobile = mobile;
    }

    public Boolean getVideoVAST() {
        return videoVAST;
    }

    public void setVideoVAST(Boolean videoVAST) {
        this.videoVAST = videoVAST;
    }

    public Boolean getVideoJS() {
        return videoJS;
    }

    public void setVideoJS(Boolean videoJS) {
        this.videoJS = videoJS;
    }
}
