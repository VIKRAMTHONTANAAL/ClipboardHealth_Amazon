package com.clipboardhealth.amazon.driver.manager.web.remote.browserstack;

import com.clipboardhealth.amazon.config.factory.BrowserStackConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserStackFirefoxManager {

    private BrowserStackFirefoxManager(){}

    public static WebDriver getDriver(){
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability("browserName","firefox");
        desiredCapabilities.setCapability("browserVersion","91.0");
        desiredCapabilities.setCapability("enableVNC",true);
        desiredCapabilities.setCapability("enableVideo",false);
        return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL(),desiredCapabilities);
    }
}
