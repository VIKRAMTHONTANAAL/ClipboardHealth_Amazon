package com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.factory;

import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.LocalMobileDriverImpl;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.LocalWebDriverImpl;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.RemoteMobileDriverImpl;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.RemoteWebDriverImpl;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.entity.MobileDriverData;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.entity.WebDriverData;
import com.clipboardhealth_amazon.enums.RunModeType;
import org.openqa.selenium.WebDriver;

public final class DriverFactory {

    private DriverFactory() {
    }

    public static WebDriver getDriverForWeb(WebDriverData webDriverData) {
        return webDriverData.getRunModeType() == RunModeType.LOCAL
                ? new LocalWebDriverImpl().getDriver(webDriverData)
                : new RemoteWebDriverImpl().getDriver(webDriverData);
    }

    public static WebDriver getDriverForMobile(MobileDriverData mobileDriverData) {
        return mobileDriverData.getRunModeType() == RunModeType.LOCAL
                ? new LocalMobileDriverImpl().getDriver(mobileDriverData)
                : new RemoteMobileDriverImpl().getDriver(mobileDriverData);
    }

}


