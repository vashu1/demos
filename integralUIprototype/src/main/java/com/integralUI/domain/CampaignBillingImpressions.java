package com.integralUI.domain;

import java.util.ArrayList;
import java.util.List;

public class CampaignBillingImpressions {
    Boolean forAll = new Boolean(false);
    List<CampaignBillingImpressionsCustomPartners> customParners = new ArrayList<CampaignBillingImpressionsCustomPartners>();

    public Boolean getForAll() {
        return forAll;
    }

    public void setForAll(Boolean forAll) {
        this.forAll = forAll;
    }

    public List<CampaignBillingImpressionsCustomPartners> getCustomParners() {
        return customParners;
    }

    public void setCustomParners(List<CampaignBillingImpressionsCustomPartners> customParners) {
        this.customParners = customParners;
    }
}

