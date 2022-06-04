package com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver;

import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.entity.WebDriverData;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.factory.web.local.LocalDriverFactory;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.factory.web.remote.RemoteDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteWebDriverImpl implements IWebDriver {


    public WebDriver getDriver(WebDriverData driverData) {
        return RemoteDriverFactory.getDriver(driverData.getBrowserRemoteModeType(),driverData.getBrowserType());
    }
}
