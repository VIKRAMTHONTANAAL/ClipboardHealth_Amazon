package com.clipboardhealth.amazon.pages.enums.page;

public enum PageType {

    TELEVISIONS("Televisions"),
    ;

    private final String name;


    public String getName(){
        return name;
    }
    PageType(String name) {
        this.name = name;
    }
}
