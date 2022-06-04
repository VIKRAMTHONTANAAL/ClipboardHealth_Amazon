package com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.web.remote;

import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.manager.web.remote.browserstack.BrowserStackChromeManager;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.manager.web.remote.browserstack.BrowserStackFirefoxManager;
import com.clipboardhealth_amazon.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class BrowserStackFactory {

    public BrowserStackFactory(){}

    public static WebDriver getDriver(BrowserType browserType){
        return browserType==BrowserType.CHROME
                ? BrowserStackChromeManager.getDriver()
                : BrowserStackFirefoxManager.getDriver();
    }

}
