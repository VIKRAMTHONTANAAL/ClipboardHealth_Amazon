package com.clipboardhealth.amazon.driver;

import com.clipboardhealth.amazon.driver.entity.MobileDriverData;
import com.clipboardhealth.amazon.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteMobileDriverImpl implements IMobileDriver {

    public WebDriver getDriver(MobileDriverData driverData) {
        return RemoteMobileDriverFactory.getDriver(driverData.getMobileRemoteModeType(),driverData.getMobilePlatformType());
    }
}
