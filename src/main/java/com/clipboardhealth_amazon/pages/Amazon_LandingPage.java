package com.clipboardhealth_amazon.pages;


import com.clipboardhealth_amazon.pages.enums.hamburgermenucomponent.MenuType;
import com.clipboardhealth_amazon.pages.enums.hamburgermenucomponent.SubMenuType;
import com.clipboardhealth_amazon.pages.enums.page.PageType;
import com.clipboardhealth_amazon.pages.pagecomponents.amazon_landingpage.HamburgerMenuComponent;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Objects;

import static com.clipboardhealth_amazon.utils.PageActionsHelper.*;


public class Amazon_LandingPage {

    private final HamburgerMenuComponent hamburgerMenuComponent;

    private static final By HAMBURGER_MENU= By.id("nav-hamburger-menu");

    private static final String LANDINGPAGE_TITLE="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

    public Amazon_LandingPage(){
       this.hamburgerMenuComponent=new HamburgerMenuComponent();
    }


    public void verifyAmazonLandingPageTitle(){
        Assert.assertTrue(Objects.requireNonNull(getPageTitle()).contains(LANDINGPAGE_TITLE),LANDINGPAGE_TITLE+" not present in field");
    }

    public void clickHamburgerMenu(){
        click(HAMBURGER_MENU);
    }


    public HamburgerMenuComponent getHamburgerMenuComponent(){
        return hamburgerMenuComponent;
    }


    public void navigateToPage(PageType pageType){
        if(pageType.getName().equalsIgnoreCase("Televisions")){
        clickHamburgerMenu();
        getHamburgerMenuComponent().scrollAndClickMenuItem(MenuType.TVAPPLIANCESELECTRONICS);
        getHamburgerMenuComponent().scrollAndClickSubMenuItem(SubMenuType.TELEVISIONS);

        }
    }



}
