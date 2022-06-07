package com.clipboardhealth.amazon.pages;


import com.clipboardhealth.amazon.pages.enums.page.PageType;
import com.clipboardhealth.amazon.pages.pagecomponents.amazonlandingpage.HamburgerMenuComponent;
import com.clipboardhealth.amazon.utils.PageActionsHelper;
import com.clipboardhealth.amazon.pages.enums.hamburgermenucomponent.MenuType;
import com.clipboardhealth.amazon.pages.enums.hamburgermenucomponent.SubMenuType;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Objects;


public class AmazonLandingPage {

    private final HamburgerMenuComponent hamburgerMenuComponent;

    private static final By HAMBURGERMENU = By.id("nav-hamburger-menu");

    private static final String LANDINGPAGETITLE ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

    public AmazonLandingPage(){
       this.hamburgerMenuComponent=new HamburgerMenuComponent();
    }


    public AmazonLandingPage verifyAmazonLandingPageTitle(){
        Assert.assertTrue(Objects.requireNonNull(PageActionsHelper.getPageTitle()).contains(LANDINGPAGETITLE), LANDINGPAGETITLE +" not present in field");
        return this;
    }

    public void clickHamburgerMenu(){
        PageActionsHelper.click(HAMBURGERMENU);
    }


    public HamburgerMenuComponent getHamburgerMenuComponent(){
        return hamburgerMenuComponent;
    }


    public AmazonTelevisionPage navigateToPage(PageType pageType){
        if(pageType.getName().equalsIgnoreCase("Televisions")){
        clickHamburgerMenu();
        getHamburgerMenuComponent().scrollAndClickMenuItem(MenuType.TVAPPLIANCESELECTRONICS);
        getHamburgerMenuComponent().scrollAndClickSubMenuItem(SubMenuType.TELEVISIONS);
        return new AmazonTelevisionPage();

        }
        return null;
    }



}
