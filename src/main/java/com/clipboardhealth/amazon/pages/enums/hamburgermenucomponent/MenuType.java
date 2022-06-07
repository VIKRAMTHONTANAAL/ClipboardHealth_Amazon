package com.clipboardhealth.amazon.pages.enums.hamburgermenucomponent;

public enum MenuType {

    TVAPPLIANCESELECTRONICS("TV, Appliances, Electronics"),
    ;

    private final String name;


    public String getName(){
        return name;
    }
    MenuType(String name) {
        this.name = name;
    }
}
