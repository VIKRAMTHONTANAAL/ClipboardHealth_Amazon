package com.clipboardhealth.amazon.pages;


import com.clipboardhealth.amazon.pages.pagecomponents.amazonlandingpage.HamburgerMenuComponent;

import org.openqa.selenium.By;

import static com.clipboardhealth.amazon.utils.PageActionsHelper.*;
import static com.clipboardhealth.amazon.utils.ScrollHelper.scrollToElementBy;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class AmazonTelevisionDetailPage {

    private final HamburgerMenuComponent hamburgerMenuComponent;
    private static final By HAMBURGERMENU = By.id("nav-hamburger-menu");

    private static final By ABOUTTHISITEMSECTION = By.id("feature-bullets");

    private static final By TEXTABOUTTHISITEM =By.xpath(".//*[@class='a-size-base-plus a-text-bold']");


    public AmazonTelevisionDetailPage() {
        this.hamburgerMenuComponent = new HamburgerMenuComponent();
    }



    public void clickHamburgerMenu() {
        click(HAMBURGERMENU);
    }

    public HamburgerMenuComponent getHamburgerMenuComponent() {
        return hamburgerMenuComponent;
    }

    public void scrollAndVerifyAboutThisItemSection(){
        scrollToElementBy(TEXTABOUTTHISITEM);
//        assertTrue(getTextFromElement(TEXTABOUTTHISITEM).contains("About this item"),"failed to scroll to product about section");
//        assertFalse(getTextFromElement(ABOUTTHISITEMSECTION).isEmpty(),"product about section is displayed");
    }

    public String getAboutThisSectionTitleText(){
        return getTextFromElement(TEXTABOUTTHISITEM);
    }

    public String getAboutThisSectionText(){
        return getTextFromElement(ABOUTTHISITEMSECTION);
    }



}
