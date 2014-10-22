package com.integralUI;

import com.integralUI.domain.*;
import io.github.benas.jpopulator.api.Populator;
import io.github.benas.jpopulator.impl.PopulatorBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class CampaignController {

    private Campaign testCampaign() {
        Populator populator = new PopulatorBuilder().build();
        Campaign result = populator.populateBean(Campaign.class);
        result.getBilling().getImpressions().setCustomParners(populator.populateBeans(CampaignBillingImpressionsCustomPartners.class, 2));
        result.getSetup().setTeam(populator.populateBeans(CampaignSetupTeamMember.class, 2));
        result.setPartners(populator.populateBean(CampaignPartners.class));
        result.getPartners().setList(populator.populateBeans(CampaignPartner.class, 2));
        result.setCompanies(populator.populateBeans(CampaignCompany.class, 1));

        result.getCompanies().get(0).getContacts().setCcEmails(new ArrayList<String>());
        result.getSettings().getGeo().setWhere(new ArrayList<String>());
        result.getSettings().getLanguage().setCustom(new ArrayList<String>());
        result.getSettings().getSites().setBlacklist(new ArrayList<String>());
        result.getSettings().getSites().setRequired(new ArrayList<String>());
        result.getSettings().getSites().setWhitelist(new ArrayList<String>());
        result.getSettings().getKeywords().setList(new ArrayList<String>());

        result.getCompanies().get(0).getContacts().getCcEmails().add("CcEmail");
        result.getSettings().getGeo().getWhere().add("CcEmail");
        result.getSettings().getLanguage().getCustom().add("ru");
        result.getSettings().getSites().getBlacklist().add("Blacklist");
        result.getSettings().getSites().getRequired().add("Required");
        result.getSettings().getSites().getWhitelist().add("Whitelist");
        result.getSettings().getKeywords().getList().add("Keyword");
        return result;
    }

    @RequestMapping(value = "/rest/campaign/list", method = RequestMethod.GET)
    @ResponseBody
    public Campaign list() {
        return testCampaign();
    }
}
