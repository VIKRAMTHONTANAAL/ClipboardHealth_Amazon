package com.clipboardhealth.amazon.driver;

import com.clipboardhealth.amazon.driver.entity.MobileDriverData;
import com.clipboardhealth.amazon.driver.entity.WebDriverData;
import com.clipboardhealth.amazon.driver.factory.DriverFactory;
import com.clipboardhealth.amazon.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.Objects;

import static com.clipboardhealth.amazon.config.factory.ConfigFactory.getConfig;


public final class Driver {

    private Driver() {
    }



    //local web, remote web, local mobile, remote mobile
    public static void initDriverForWeb() {

        if(Objects.isNull(DriverManager.getDriver())) {

            WebDriverData webDriverData = new WebDriverData(getConfig().browser(), getConfig().browserRemoteMode());
            WebDriver driver = DriverFactory.getDriverForWeb(getConfig().browserRunMode()).getDriver(webDriverData);
            DriverManager.setDriver(driver);
            loadURL();
            maximizeBrowserWindow();
        }

    }

    public static void loadURL(){
        DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        DriverManager.getDriver().manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        DriverManager.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        DriverManager.getDriver().get(getConfig().Url());
    }

    public static void maximizeBrowserWindow(){
        DriverManager.getDriver().manage().window().maximize();
    }

    public static void initDriverForMobile() {
        if(Objects.isNull(DriverManager.getDriver())) {
            MobileDriverData mobileDriverData = new MobileDriverData((MobilePlatformType.IOS), getConfig().mobileRemoteMode());
            WebDriver driver = DriverFactory.getDriverForMobile(getConfig().mobileRunMode()).getDriver(mobileDriverData);
            //  driver.get("https://www.amazon.in");
            DriverManager.setDriver(driver);
        }
    }

    public static void quitDriver() {
        if(Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
