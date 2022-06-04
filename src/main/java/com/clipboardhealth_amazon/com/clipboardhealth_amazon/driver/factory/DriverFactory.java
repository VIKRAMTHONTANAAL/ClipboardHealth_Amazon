package com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.factory;

import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.entity.DriverData;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.factory.mobile.local.LocalMobileDriverFactory;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.factory.web.local.LocalDriverFactory;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.factory.web.remote.RemoteDriverFactory;
import com.clipboardhealth_amazon.enums.RunModeType;
import org.openqa.selenium.WebDriver;

public final class DriverFactory {

private DriverFactory(){}

    public static WebDriver getDriverForWeb(DriverData driverData) {

        if(driverData.getRunModeType() == RunModeType.LOCAL) {
            return LocalDriverFactory.getDriver(driverData.getBrowserType());
        }
        else {
            return RemoteDriverFactory.getDriver(driverData.getBrowserRemoteModeType(),driverData.getBrowserType());
        }

    }
    public static WebDriver getDriverForMobile(DriverData driverData){

        if(driverData.getRunModeType() == RunModeType.LOCAL) {
            return LocalMobileDriverFactory.getDriver(driverData.getMobilePlatformType());
        }
        else {
            return RemoteMobileDriverFactory.getDriver(driverData.getMobileRemoteModeType(),driverData.getMobilePlatformType());
        }
    }

}
