package com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.manager.web.remote.selenoid;

import com.clipboardhealth_amazon.config.factory.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SelenoidFirefoxManager {

    private SelenoidFirefoxManager(){}

    public static WebDriver getDriver(){
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability("browserName","firefox");
        desiredCapabilities.setCapability("browserVersion","91.0");
        desiredCapabilities.setCapability("enableVNC",true);
        desiredCapabilities.setCapability("enableVideo",false);
        return new RemoteWebDriver(ConfigFactory.getConfig().selenoidURL(),desiredCapabilities);
    }
}
