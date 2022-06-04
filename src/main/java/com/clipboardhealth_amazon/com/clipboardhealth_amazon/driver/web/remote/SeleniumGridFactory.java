package com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.web.remote;

import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.manager.web.remote.selenium.SeleniumGridChromeManager;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.manager.web.remote.selenium.SeleniumGridFirefoxManager;
import com.clipboardhealth_amazon.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public final class SeleniumGridFactory {

    private SeleniumGridFactory(){}


    public static WebDriver getDriver(BrowserType browserType)  {
        return browserType==BrowserType.CHROME
                ? SeleniumGridChromeManager.getDriver()
                : SeleniumGridFirefoxManager.getDriver();
    }
}
