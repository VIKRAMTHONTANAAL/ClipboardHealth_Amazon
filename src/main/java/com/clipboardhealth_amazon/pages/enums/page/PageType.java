package com.clipboardhealth_amazon.pages.enums.page;

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
