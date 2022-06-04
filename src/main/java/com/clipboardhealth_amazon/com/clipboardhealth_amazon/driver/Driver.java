package com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver;

import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.entity.MobileDriverData;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.entity.WebDriverData;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.factory.DriverFactory;
import com.clipboardhealth_amazon.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import static com.clipboardhealth_amazon.config.factory.ConfigFactory.getConfig;


public final class Driver {

    private Driver() {
    }

    //local web, remote web, local mobile, remote mobile
    public static void initDriverForWeb() {
        WebDriverData driverData =  WebDriverData.builder()
                .browserType(getConfig().browser())
                .browserRemoteModeType(getConfig().browserRemoteMode())
                .runModeType(getConfig().browserRunMode())
                .build();

        WebDriver driver = DriverFactory.getDriverForWeb(driverData);
        driver.quit();

        //  driver.get("https://www.amazon.in");

    }

    public static void initDriverForMobile() {
        MobileDriverData driverData =  MobileDriverData.builder()
                .mobilePlatformType(MobilePlatformType.ANDROID)
                .mobileRemoteModeType(getConfig().mobileRemoteMode())
                .runModeType(getConfig().mobileRunMode())
                .build();

        WebDriver driver = DriverFactory.getDriverForMobile(driverData);
        driver.quit();

        //  driver.get("https://www.amazon.in");

    }

    public static void quitDriver() {
        /*
         *
         */

    }
}
