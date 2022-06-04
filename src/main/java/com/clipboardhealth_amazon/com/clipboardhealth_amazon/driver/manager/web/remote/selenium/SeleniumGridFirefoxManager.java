package com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.manager.web.remote.selenium;

import com.clipboardhealth_amazon.config.factory.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;

public final class SeleniumGridFirefoxManager {

    private SeleniumGridFirefoxManager(){}

    public static WebDriver getDriver()  {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability("browserName","firefox");
        desiredCapabilities.setCapability("browserVersion","91.0");
        desiredCapabilities.setCapability("enableVNC",true);
        desiredCapabilities.setCapability("enableVideo",false);
        return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridURL(),desiredCapabilities);
    }
}
