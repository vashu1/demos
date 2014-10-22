package com.integralUI.domain;

public class CampaignSettingsAdFraud {
    Boolean skip = new Boolean(false);

    Boolean blockInvisibleTraffic = new Boolean(false);
    Boolean blockIllegalDomains = new Boolean(false);
    Boolean blockSuspiciousTraffic = new Boolean(false);
    Boolean blockAdWare = new Boolean(false);
    Boolean sambreel = new Boolean(false);
    Boolean anchorFree = new Boolean(false);

    public Boolean getSkip() {
        return skip;
    }

    public void setSkip(Boolean skip) {
        this.skip = skip;
    }

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

    public Boolean getSambreel() {
        return sambreel;
    }

    public void setSambreel(Boolean sambreel) {
        this.sambreel = sambreel;
    }

    public Boolean getAnchorFree() {
        return anchorFree;
    }

    public void setAnchorFree(Boolean anchorFree) {
        this.anchorFree = anchorFree;
    }
}
