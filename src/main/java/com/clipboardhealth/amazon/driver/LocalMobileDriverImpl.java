package com.clipboardhealth.amazon.driver;

import com.clipboardhealth.amazon.driver.entity.MobileDriverData;
import com.clipboardhealth.amazon.driver.factory.mobile.local.LocalMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalMobileDriverImpl implements IMobileDriver {

    public WebDriver getDriver(MobileDriverData driverData) {
        return LocalMobileDriverFactory.getDriver(driverData.getMobilePlatformType());
    }
}
