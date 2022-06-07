package com.clipboardhealth.amazon.pages;


import com.clipboardhealth.amazon.pages.pagecomponents.amazonlandingpage.HamburgerMenuComponent;
import com.clipboardhealth.amazon.pages.pagecomponents.amazonproductspage.LeftNavigationComponent;
import com.clipboardhealth.amazon.pages.pagecomponents.amazonproductspage.SortByComponent;
import com.clipboardhealth.amazon.utils.PageActionsHelper;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AmazonTelevisionPage {

    private final HamburgerMenuComponent hamburgerMenuComponent;

    private final LeftNavigationComponent leftNavigationComponent;

    private final SortByComponent sortByComponent;

    private static final By HAMBURGERMENU = By.id("nav-hamburger-menu");

    private static String getNthProduce(int n) {
        return "(//span[@class='a-price-whole'])[" + n + "]";
    }

    private static final String TELEVISIONPAGETITLE = "Buy the latest LED TVs, 4K TVs and Android TVs online at Best Prices in India-Amazon.in | Shop by size, price, features and more";

    public AmazonTelevisionPage() {
        this.hamburgerMenuComponent = new HamburgerMenuComponent();
        this.leftNavigationComponent = new LeftNavigationComponent();
        this.sortByComponent = new SortByComponent();
    }


    public AmazonTelevisionPage verifyAmazonTelevisionPageTitle() {
        Assert.assertTrue(PageActionsHelper.getPageTitle().contains(TELEVISIONPAGETITLE), TELEVISIONPAGETITLE + " not present in field");
return this;
    }

    public void clickHamburgerMenu() {
        PageActionsHelper.click(HAMBURGERMENU);
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

    public AmazonTelevisionDetailPage clickNthProduct(int nthProduct) {
        PageActionsHelper.clickOnElementUsingJs(By.xpath(getNthProduce(nthProduct)));
        PageActionsHelper.switchToSucceedingWindow(1);
        PageActionsHelper.waitForPageLoad();

        return new AmazonTelevisionDetailPage();
    }


}
