package com.clipboardhealth.amazon.driver.manager.mobile.local;


import com.clipboardhealth.amazon.config.factory.ConfigFactory;
import io.appium.java_client.remote.MobileCapabilityType;


import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class AndroidManager {

    private AndroidManager(){}

    public static WebDriver getDriver(){
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME    , Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME    , "UIAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP    , System.getProperty("user.dir")+"/android-app.apk");
        return new RemoteWebDriver(ConfigFactory.getConfig().localAppiumServerURL(),desiredCapabilities);

    }
}
