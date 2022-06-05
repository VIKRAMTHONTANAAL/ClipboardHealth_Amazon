package com.clipboardhealth_amazon.pages;


import com.clipboardhealth_amazon.pages.pagecomponents.amazon_landingpage.HamburgerMenuComponent;

import org.openqa.selenium.By;

import static com.clipboardhealth_amazon.utils.PageActionsHelper.*;
import static com.clipboardhealth_amazon.utils.Scrollers.scrollToElementBy;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class Amazon_TelevisionDetailPage {

    private final HamburgerMenuComponent hamburgerMenuComponent;

    private static final String SORT_CATEGORY = "(//*[text()='%s'])[2]";

    private static final By HAMBURGER_MENU = By.id("nav-hamburger-menu");

    private static final By ABOUTTHISITEM_SECTION = By.id("feature-bullets");

    private static final By TEXT_ABOUTTHISITEM=By.xpath(".//*[@class='a-size-base-plus a-text-bold']");


    public Amazon_TelevisionDetailPage() {
        this.hamburgerMenuComponent = new HamburgerMenuComponent();
    }



    public void clickHamburgerMenu() {
        click(HAMBURGER_MENU);
    }

    public HamburgerMenuComponent getHamburgerMenuComponent() {
        return hamburgerMenuComponent;
    }

    public void scrollAndVerifyAboutThisItemSection(){
        scrollToElementBy(TEXT_ABOUTTHISITEM);
        assertTrue(getTextFromElement(TEXT_ABOUTTHISITEM).contains("About this item"),"failed to scroll to product about section");
        assertFalse(getTextFromElement(ABOUTTHISITEM_SECTION).isEmpty(),"product about section is displayed");
    }



}
