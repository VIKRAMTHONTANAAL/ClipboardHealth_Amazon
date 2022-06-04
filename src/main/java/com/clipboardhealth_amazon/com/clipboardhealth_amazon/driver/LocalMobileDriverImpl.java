package com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver;

import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.entity.MobileDriverData;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.factory.mobile.local.LocalMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalMobileDriverImpl implements IMobileDriver {

    public WebDriver getDriver(MobileDriverData driverData) {
        return LocalMobileDriverFactory.getDriver(driverData.getMobilePlatformType());
    }
}
