package com.clipboardhealth.amazon.driver;

import com.clipboardhealth.amazon.driver.entity.WebDriverData;
import com.clipboardhealth.amazon.driver.factory.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalWebDriverImpl implements IWebDriver {

    @Override
    public WebDriver getDriver(WebDriverData driverData) {
        return LocalDriverFactory.getDriver(driverData.getBrowserType());
    }
}
