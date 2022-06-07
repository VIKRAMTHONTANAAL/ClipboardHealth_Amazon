package com.clipboardhealth.amazon.pages.pagecomponents.amazonlandingpage;

import com.clipboardhealth.amazon.pages.enums.hamburgermenucomponent.MenuType;
import com.clipboardhealth.amazon.pages.enums.hamburgermenucomponent.SubMenuType;
import org.openqa.selenium.By;

import static com.clipboardhealth.amazon.utils.PageActionsHelper.*;
import static com.clipboardhealth.amazon.utils.ScrollHelper.*;

public class HamburgerMenuComponent {

    private static final String HAMBURGERMENU ="//div[text()='%s']/parent::a";
    private static final String HAMBURGERSUBMENU ="//a[text()='%s']";


    public void scrollAndClickMenuItem(MenuType menuType){
        String xpath=String.format(HAMBURGERMENU,menuType.getName());
        scrollToElementBy(By.xpath(xpath));
        click(By.xpath(xpath));
    }


    public void scrollAndClickSubMenuItem(SubMenuType subMenuType){
        String xpath=String.format(HAMBURGERSUBMENU,subMenuType.getName());
        scrollToElementBy(By.xpath(xpath));
        click(By.xpath(xpath));
    }


}
