package com.urise.webapp.model;

public enum ContactType {

    PHONE("Tel."),
    MOBILE("Mobile."),
    HOME_PHONE("Home Telephone"),
    SKYPE("Skype"),
    MAIL("Mail"),
    LINKEDIN("LinkedIn Profile"),
    GITHUB("GitHub  Profile"),
    STACKOVERFLOW("Stackoverflow Profile"),
    HOME_PAGE("Home page");

    private final String title;

    ContactType(String title){
        this.title=title;
    }

    public String getTitle(){
        return title;
    }
}
