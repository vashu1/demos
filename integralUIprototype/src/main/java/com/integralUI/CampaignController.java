package com.integralUI;

import com.integralUI.domain.Campaign;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CampaignController {

    private Campaign defaultCampaign() {
        Campaign campaign = new Campaign();

        return campaign;
    }

    @RequestMapping(value = "/rest/campaign/list", method = RequestMethod.GET)
    @ResponseBody
    public Campaign list() {
        return defaultCampaign();
    }
}
