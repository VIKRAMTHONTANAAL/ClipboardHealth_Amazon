package com.clipboardhealth.amazon.driver.manager.mobile.local;


import com.clipboardhealth.amazon.config.factory.ConfigFactory;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class IosManager {

    private IosManager(){}

    public static WebDriver getDriver(){
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME    , Platform.IOS);
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME    , "XCUITest");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME    , "iPod touch (7th generation)");
        desiredCapabilities.setCapability(MobileCapabilityType.APP    , System.getProperty("user.dir")+"/ios-app.zip");
        return new RemoteWebDriver(ConfigFactory.getConfig().localAppiumServerURL(),desiredCapabilities);

    }
}
