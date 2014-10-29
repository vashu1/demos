
package com.integralUI.domain;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


public class AdFraud {

    private Boolean blockInvisibleTraffic;
    private Boolean blockIllegalDomains;
    private Boolean blockSuspiciousTraffic;
    private Boolean blockAdWare;

    public Boolean getBlockInvisibleTraffic() {
        return blockInvisibleTraffic;
    }

    public void setBlockInvisibleTraffic(Boolean blockInvisibleTraffic) {
        this.blockInvisibleTraffic = blockInvisibleTraffic;
    }

    public Boolean getBlockIllegalDomains() {
        return blockIllegalDomains;
    }

    public void setBlockIllegalDomains(Boolean blockIllegalDomains) {
        this.blockIllegalDomains = blockIllegalDomains;
    }

    public Boolean getBlockSuspiciousTraffic() {
        return blockSuspiciousTraffic;
    }

    public void setBlockSuspiciousTraffic(Boolean blockSuspiciousTraffic) {
        this.blockSuspiciousTraffic = blockSuspiciousTraffic;
    }

    public Boolean getBlockAdWare() {
        return blockAdWare;
    }

    public void setBlockAdWare(Boolean blockAdWare) {
        this.blockAdWare = blockAdWare;
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
