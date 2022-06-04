package com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver;

import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.entity.WebDriverData;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.factory.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalWebDriverImpl implements IWebDriver {

    @Override
    public WebDriver getDriver(WebDriverData driverData) {
        return LocalDriverFactory.getDriver(driverData.getBrowserType());
    }
}
