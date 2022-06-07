package com.clipboardhealth.amazon.pages.pagecomponents.amazonproductspage;


import com.clipboardhealth.amazon.pages.AmazonTelevisionPage;
import com.clipboardhealth.amazon.pages.enums.sortbycomponent.SortType;
import org.openqa.selenium.By;

import static com.clipboardhealth.amazon.utils.PageActionsHelper.*;

public class SortByComponent {

    private static final By sortBy = By.id("s-result-sort-select");

    private static final String SORT_CATEGORY = "(//*[text()='%s'])[2]";

    public AmazonTelevisionPage sortBy(SortType sortType) {
        String xpath = String.format(SORT_CATEGORY, sortType.getName());
        clickOnElementUsingJs(sortBy);
        clickOnElementUsingJs(By.xpath(xpath));

        return new AmazonTelevisionPage();

    }


}
