package com.clipboardhealth_amazon.pages;


import com.clipboardhealth_amazon.pages.pagecomponents.amazon_landingpage.HamburgerMenuComponent;
import com.clipboardhealth_amazon.pages.pagecomponents.amazon_productspage.LeftNavigationComponent;
import com.clipboardhealth_amazon.pages.pagecomponents.amazon_productspage.SortByComponent;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.clipboardhealth_amazon.utils.PageActionsHelper.*;

public class Amazon_TelevisionPage {

    private final HamburgerMenuComponent hamburgerMenuComponent;

    private final LeftNavigationComponent leftNavigationComponent;

    private final SortByComponent sortByComponent;

    private static final By HAMBURGER_MENU = By.id("nav-hamburger-menu");

    private static String getNthProduce(int n) {
        return "(//span[@class='a-price-whole'])[" + n + "]";
    }

    private static final String TELEVISIONPAGE_TITLE = "Buy the latest LED TVs, 4K TVs and Android TVs online at Best Prices in India-Amazon.in | Shop by size, price, features and more";

    public Amazon_TelevisionPage() {
        this.hamburgerMenuComponent = new HamburgerMenuComponent();
        this.leftNavigationComponent = new LeftNavigationComponent();
        this.sortByComponent = new SortByComponent();
    }


    public void verifyAmazonTelevisionPageTitle() {
        Assert.assertTrue(getPageTitle().contains(TELEVISIONPAGE_TITLE), TELEVISIONPAGE_TITLE + " not present in field");

    }

    public void clickHamburgerMenu() {
        click(HAMBURGER_MENU);
    }

    public HamburgerMenuComponent getHamburgerMenuComponent() {
        return hamburgerMenuComponent;
    }

    public LeftNavigationComponent getLeftNavigationComponent() {
        return leftNavigationComponent;
    }

    public SortByComponent getSortByComponent() {
        return sortByComponent;
    }

    public void clickNthProduct(int nthProduct) {
        clickOnElementUsingJs(By.xpath(getNthProduce(nthProduct)));
        switchToSucceedingWindow(1);
        waitForPageLoad();
    }


}
