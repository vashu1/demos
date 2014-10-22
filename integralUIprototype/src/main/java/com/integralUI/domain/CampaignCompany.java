package com.integralUI.domain;

public class CampaignCompany {
    String name;
    String status;
    Boolean outsideUS = new Boolean(false);
    Boolean billForVAT = new Boolean(false);
    String currency;
    CampaignAddress address;
    CampaignCompanyContact contacts;

    String displayPO;
    String displayIO;
    String displayRFI;

    String mobilePO;
    String mobileIO;
    String mobileRFI;

    String videoVASTPO;
    String videoVASTIO;
    String videoVASTRFI;

    String videoJSPO;
    String videoJSIO;
    String videoJSRFI;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getOutsideUS() {
        return outsideUS;
    }

    public void setOutsideUS(Boolean outsideUS) {
        this.outsideUS = outsideUS;
    }

    public Boolean getBillForVAT() {
        return billForVAT;
    }

    public void setBillForVAT(Boolean billForVAT) {
        this.billForVAT = billForVAT;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public CampaignAddress getAddress() {
        return address;
    }

    public void setAddress(CampaignAddress address) {
        this.address = address;
    }

    public CampaignCompanyContact getContacts() {
        return contacts;
    }

    public void setContacts(CampaignCompanyContact contacts) {
        this.contacts = contacts;
    }

    public String getDisplayPO() {
        return displayPO;
    }

    public void setDisplayPO(String displayPO) {
        this.displayPO = displayPO;
    }

    public String getDisplayIO() {
        return displayIO;
    }

    public void setDisplayIO(String displayIO) {
        this.displayIO = displayIO;
    }

    public String getDisplayRFI() {
        return displayRFI;
    }

    public void setDisplayRFI(String displayRFI) {
        this.displayRFI = displayRFI;
    }

    public String getMobilePO() {
        return mobilePO;
    }

    public void setMobilePO(String mobilePO) {
        this.mobilePO = mobilePO;
    }

    public String getMobileIO() {
        return mobileIO;
    }

    public void setMobileIO(String mobileIO) {
        this.mobileIO = mobileIO;
    }

    public String getMobileRFI() {
        return mobileRFI;
    }

    public void setMobileRFI(String mobileRFI) {
        this.mobileRFI = mobileRFI;
    }

    public String getVideoVASTPO() {
        return videoVASTPO;
    }

    public void setVideoVASTPO(String videoVASTPO) {
        this.videoVASTPO = videoVASTPO;
    }

    public String getVideoVASTIO() {
        return videoVASTIO;
    }

    public void setVideoVASTIO(String videoVASTIO) {
        this.videoVASTIO = videoVASTIO;
    }

    public String getVideoVASTRFI() {
        return videoVASTRFI;
    }

    public void setVideoVASTRFI(String videoVASTRFI) {
        this.videoVASTRFI = videoVASTRFI;
    }

    public String getVideoJSPO() {
        return videoJSPO;
    }

    public void setVideoJSPO(String videoJSPO) {
        this.videoJSPO = videoJSPO;
    }

    public String getVideoJSIO() {
        return videoJSIO;
    }

    public void setVideoJSIO(String videoJSIO) {
        this.videoJSIO = videoJSIO;
    }

    public String getVideoJSRFI() {
        return videoJSRFI;
    }

    public void setVideoJSRFI(String videoJSRFI) {
        this.videoJSRFI = videoJSRFI;
    }
}
