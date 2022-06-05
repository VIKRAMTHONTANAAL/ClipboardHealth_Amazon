package com.clipboardhealth_amazon.pages.enums.sortbycomponent;

public enum SortType {

    HIGHTOLOW("Price: High to Low"),;


    private final String name;


    public String getName(){
        return name;
    }
    SortType(String name) {
        this.name = name;
    }
}
