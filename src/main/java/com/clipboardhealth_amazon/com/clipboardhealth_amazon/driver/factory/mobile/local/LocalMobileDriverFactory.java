package com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.factory.mobile.local;

import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.manager.mobile.local.AndroidManager;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.manager.mobile.local.IosManager;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.manager.web.local.ChromeManager;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.manager.web.local.FirefoxManager;
import com.clipboardhealth_amazon.enums.BrowserType;
import com.clipboardhealth_amazon.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalMobileDriverFactory {
    private LocalMobileDriverFactory() {
    }

    private static final Map<MobilePlatformType, Supplier<WebDriver>> MAP = new EnumMap<>(MobilePlatformType.class);

    static {
        MAP.put(MobilePlatformType.ANDROID, AndroidManager::getDriver);
        MAP.put(MobilePlatformType.IOS, IosManager::getDriver);
    }

    public static WebDriver getDriver(MobilePlatformType mobilePlatformType) {
        return MAP.get(mobilePlatformType).get();
    }

}
