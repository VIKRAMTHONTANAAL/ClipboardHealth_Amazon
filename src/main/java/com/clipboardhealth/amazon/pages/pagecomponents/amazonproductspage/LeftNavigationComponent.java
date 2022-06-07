package com.clipboardhealth.amazon.pages.pagecomponents.amazonproductspage;


import com.clipboardhealth.amazon.pages.AmazonTelevisionPage;
import com.clipboardhealth.amazon.pages.enums.leftnavigationcomponent.BrandType;
import com.clipboardhealth.amazon.pages.enums.leftnavigationcomponent.CategoryType;
import org.openqa.selenium.By;

import static com.clipboardhealth.amazon.utils.PageActionsHelper.*;
import static com.clipboardhealth.amazon.utils.ScrollHelper.*;

public class LeftNavigationComponent {

    private static final String FILTERCATEGORY =".//*[@id='s-refinements']//*[text()='%s']";
    private static final String FILTEROPTION =".//*[@id='s-refinements']//*[text()='%s']/..//following-sibling::ul//*[text()='%s']";


    public AmazonTelevisionPage scrollToCategoryAndFilter(CategoryType categoryType, BrandType brandType){
        String xpath=String.format(FILTERCATEGORY,categoryType.getName());
        scrollToElementBy(By.xpath(xpath));
        String secondXpath=String.format(FILTEROPTION,categoryType.getName(),brandType.getName());
        click(By.xpath(secondXpath));

        return new AmazonTelevisionPage();

    }

}
