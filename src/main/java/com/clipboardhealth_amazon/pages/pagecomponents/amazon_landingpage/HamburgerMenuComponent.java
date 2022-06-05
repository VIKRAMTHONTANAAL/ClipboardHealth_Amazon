package com.clipboardhealth_amazon.pages.pagecomponents.amazon_landingpage;

import com.clipboardhealth_amazon.pages.enums.hamburgermenucomponent.MenuType;
import com.clipboardhealth_amazon.pages.enums.hamburgermenucomponent.SubMenuType;
import org.openqa.selenium.By;

import static com.clipboardhealth_amazon.utils.PageActionsHelper.*;
import static com.clipboardhealth_amazon.utils.Scrollers.*;

public class HamburgerMenuComponent {

    private static final String HAMBURGER_MENU="//div[text()='%s']/parent::a";
    private static final String HAMBURGER_SUB_MENU="//a[text()='%s']";


    public void scrollAndClickMenuItem(MenuType menuType){
        String xpath=String.format(HAMBURGER_MENU,menuType.getName());
        scrollToElementBy(By.xpath(xpath));
        click(By.xpath(xpath));
    }


    public void scrollAndClickSubMenuItem(SubMenuType subMenuType){
        String xpath=String.format(HAMBURGER_SUB_MENU,subMenuType.getName());
        scrollToElementBy(By.xpath(xpath));
        click(By.xpath(xpath));
    }


}
