package com.clipboardhealth.amazon.pages.enums.hamburgermenucomponent;

public enum SubMenuType {

    TELEVISIONS("Televisions"),
    ;

    private final String name;


    public String getName(){
        return name;
    }
    SubMenuType(String name) {
        this.name = name;
    }
}
