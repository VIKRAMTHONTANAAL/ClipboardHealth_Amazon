package com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.web.remote;

import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.manager.web.remote.selenoid.SelenoidChromeManager;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.manager.web.remote.selenoid.SelenoidFirefoxManager;
import com.clipboardhealth_amazon.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SelenoidFactory {

    public SelenoidFactory(){}

    public static WebDriver getDriver(BrowserType browserType){
        return browserType==BrowserType.CHROME
                ? SelenoidChromeManager.getDriver()
                : SelenoidFirefoxManager.getDriver();
    }

}
