package com.clipboardhealth_amazon.pages.pagecomponents.amazon_productspage;


import com.clipboardhealth_amazon.pages.enums.sortbycomponent.SortType;
import org.openqa.selenium.By;

import static com.clipboardhealth_amazon.utils.PageActionsHelper.*;

public class SortByComponent {

    private static final By sortBy = By.id("s-result-sort-select");

    private static final String SORT_CATEGORY = "(//*[text()='%s'])[2]";

    public void sortBy(SortType sortType) {
        String xpath = String.format(SORT_CATEGORY, sortType.getName());
        clickOnElementUsingJs(sortBy);
        clickOnElementUsingJs(By.xpath(xpath));

    }


}
