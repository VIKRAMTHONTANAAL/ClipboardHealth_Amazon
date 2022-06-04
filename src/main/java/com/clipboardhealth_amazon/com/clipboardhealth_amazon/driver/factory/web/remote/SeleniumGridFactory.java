package com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.factory.web.remote;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.manager.web.remote.selenium.SeleniumGridChromeManager;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.manager.web.remote.selenium.SeleniumGridFirefoxManager;
import com.clipboardhealth_amazon.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class SeleniumGridFactory {

    private SeleniumGridFactory(){}


    private static final Map<BrowserType, Supplier<WebDriver>> MAP =
            new EnumMap<>(BrowserType.class);

    static {
        MAP.put(BrowserType.CHROME, SeleniumGridChromeManager::getDriver);
        MAP.put(BrowserType.FIREFOX, SeleniumGridFirefoxManager::getDriver);

    }
    public static WebDriver getDriver(BrowserType browserType) {
        return MAP.get(browserType).get();
    }
}
