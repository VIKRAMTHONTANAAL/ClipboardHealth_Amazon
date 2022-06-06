package com.clipboardhealth_amazon.tests.web;
import com.clipboardhealth_amazon.pages.Amazon_LandingPage;
import com.clipboardhealth_amazon.pages.Amazon_TelevisionDetailPage;
import com.clipboardhealth_amazon.pages.Amazon_TelevisionPage;
import com.clipboardhealth_amazon.pages.enums.leftnavigationcomponent.BrandType;
import com.clipboardhealth_amazon.pages.enums.leftnavigationcomponent.CategoryType;
import com.clipboardhealth_amazon.pages.enums.page.PageType;
import com.clipboardhealth_amazon.pages.enums.sortbycomponent.SortType;
import com.clipboardhealth_amazon.tests.web.base.WebBase;
import org.testng.annotations.Test;

public class AmazonProductDetails_Test_002 extends WebBase {


    @Test
    public void testLaunch() throws InterruptedException {

        Amazon_LandingPage amazon_landingPage = new Amazon_LandingPage();
        Amazon_TelevisionPage amazon_televisionPage = new Amazon_TelevisionPage();
        Amazon_TelevisionDetailPage amazon_televisionDetailPage=new Amazon_TelevisionDetailPage();


        amazon_landingPage.verifyAmazonLandingPageTitle();
        amazon_landingPage.navigateToPage(PageType.TELEVISIONS);
        amazon_televisionPage.verifyAmazonTelevisionPageTitle();
        amazon_televisionPage.getLeftNavigationComponent().scrollToCategoryAndFilter(CategoryType.BRANDS, BrandType.SAMSUNG);
        amazon_televisionPage.getSortByComponent().sortBy(SortType.HIGHTOLOW);
        amazon_televisionPage.clickNthProduct(2);
        amazon_televisionDetailPage.scrollAndVerifyAboutThisItemSection();



    }

}
