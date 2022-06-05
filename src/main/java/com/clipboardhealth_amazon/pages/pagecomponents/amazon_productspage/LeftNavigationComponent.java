package com.clipboardhealth_amazon.pages.pagecomponents.amazon_productspage;


import com.clipboardhealth_amazon.pages.enums.leftnavigationcomponent.BrandType;
import com.clipboardhealth_amazon.pages.enums.leftnavigationcomponent.CategoryType;
import org.openqa.selenium.By;

import static com.clipboardhealth_amazon.utils.PageActionsHelper.*;
import static com.clipboardhealth_amazon.utils.Scrollers.*;

public class LeftNavigationComponent {

    private static final String FILTER_CATEGORY=".//*[@id='s-refinements']//*[text()='%s']";
    private static final String FILTER_OPTION=".//*[@id='s-refinements']//*[text()='%s']/..//following-sibling::ul//*[text()='%s']";


    public void scrollToCategoryAndFilter(CategoryType categoryType, BrandType brandType){
        String xpath=String.format(FILTER_CATEGORY,categoryType.getName());
        scrollToElementBy(By.xpath(xpath));
        String secondXpath=String.format(FILTER_OPTION,categoryType.getName(),brandType.getName());
        click(By.xpath(secondXpath));
    }

}
