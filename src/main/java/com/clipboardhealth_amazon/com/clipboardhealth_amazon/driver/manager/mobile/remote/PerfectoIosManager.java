package com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.manager.mobile.remote;

import com.clipboardhealth_amazon.config.factory.BrowserStackConfigFactory;
import com.clipboardhealth_amazon.config.factory.PerfectoConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class PerfectoIosManager {

    private PerfectoIosManager() {
    }

    public static WebDriver getDriver() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("app", "bs://");
        caps.setCapability("device", "iPhone 11");
        caps.setCapability("os_version", "9.0");
        caps.setCapability("app", "bs://");

        return new RemoteWebDriver(PerfectoConfigFactory.getConfig().perfectoURL(), caps);
    }
}
