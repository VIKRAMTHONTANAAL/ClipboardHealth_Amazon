package com.clipboardhealth.amazon.pages.enums.leftnavigationcomponent;

public enum CategoryType {

    BRANDS("Brands"),
    ;

    private final String name;


    public String getName(){
        return name;
    }
    CategoryType(String name) {
        this.name = name;
    }
}
