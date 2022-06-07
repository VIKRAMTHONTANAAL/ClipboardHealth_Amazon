package com.clipboardhealth.amazon.pages.enums.leftnavigationcomponent;

public enum BrandType {

    SAMSUNG("Samsung"),
    ;

    private final String name;


    public String getName(){
        return name;
    }
    BrandType(String name) {
        this.name = name;
    }
}
