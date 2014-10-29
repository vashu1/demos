
package com.integralUI.domain;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


public class MediaTypes {

    private Boolean display;
    private Boolean mobile;
    private Boolean videoVAST;
    private Boolean videoJS;


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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }
}
