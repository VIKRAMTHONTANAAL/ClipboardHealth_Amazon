package com.clipboardhealth.amazon.tests.web;

import com.clipboardhealth.amazon.pages.AmazonLandingPage;
import com.clipboardhealth.amazon.pages.AmazonTelevisionDetailPage;
import com.clipboardhealth.amazon.pages.enums.leftnavigationcomponent.BrandType;
import com.clipboardhealth.amazon.pages.enums.leftnavigationcomponent.CategoryType;
import com.clipboardhealth.amazon.pages.enums.page.PageType;
import com.clipboardhealth.amazon.pages.enums.sortbycomponent.SortType;
import com.clipboardhealth.amazon.tests.web.base.WebBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class AmazonProductDetailsSecondTest extends WebBase {


    @Test
    public void testLaunch() {

        AmazonLandingPage amazon_landingPage = new AmazonLandingPage();
        AmazonTelevisionDetailPage amazon_televisionDetailPage = new AmazonTelevisionDetailPage();

        amazon_landingPage.verifyAmazonLandingPageTitle()
                .navigateToPage(PageType.TELEVISIONS)
                .verifyAmazonTelevisionPageTitle()
                .getLeftNavigationComponent()
                .scrollToCategoryAndFilter(CategoryType.BRANDS, BrandType.SAMSUNG).
                getSortByComponent()
                .sortBy(SortType.HIGHTOLOW)
                .clickNthProduct(2).scrollAndVerifyAboutThisItemSection();
        assertTrue(amazon_televisionDetailPage.getAboutThisSectionTitleText().contains("About this item"), "failed to scroll to product about section");
        assertFalse(amazon_televisionDetailPage.getAboutThisSectionText().isEmpty(), "product about section is displayed");

    }

}
