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
        WebDriverData webDriverData = new WebDriverData(getConfig().browser(), getConfig().browserRemoteMode());
        WebDriver driver = DriverFactory.getDriverForWeb(getConfig().browserRunMode()).getDriver(webDriverData);
        DriverManager.setDriver(driver);

        //  driver.get("https://www.amazon.in");

    }

    public static void initDriverForMobile() {
        MobileDriverData mobileDriverData = new MobileDriverData((MobilePlatformType.ANDROID), getConfig().mobileRemoteMode());
        WebDriver driver = DriverFactory.getDriverForMobile(getConfig().mobileRunMode()).getDriver(mobileDriverData);
        //  driver.get("https://www.amazon.in");
        DriverManager.setDriver(driver);
    }

    public static void quitDriver() {
        DriverManager.getDriver().quit();

    }
}
