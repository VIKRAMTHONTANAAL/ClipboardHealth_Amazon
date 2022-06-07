package com.clipboardhealth.amazon.driver.manager.mobile.remote;

import com.clipboardhealth.amazon.config.factory.BrowserStackConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserStackAndroidManager {

    private BrowserStackAndroidManager(){}

    public static WebDriver getDriver(){
        DesiredCapabilities caps=new DesiredCapabilities();
caps.setCapability("app","bs://");
        caps.setCapability("device","Google Pixel 3");
        caps.setCapability("os_version","9.0");
        caps.setCapability("app","bs://");

return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL(), caps);
    }
}
