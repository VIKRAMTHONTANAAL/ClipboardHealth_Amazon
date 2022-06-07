package com.clipboardhealth.amazon.driver.factory.mobile.remote;
import com.clipboardhealth.amazon.driver.manager.mobile.remote.BrowserStackAndroidManager;
import com.clipboardhealth.amazon.driver.manager.mobile.remote.BrowserStackIosManager;
import com.clipboardhealth.amazon.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class BrowserStackMobileFactory {

    public BrowserStackMobileFactory() {
    }
    private static final Map<MobilePlatformType, Supplier<WebDriver>> MAP = new EnumMap<>(MobilePlatformType.class);

    static {
        MAP.put(MobilePlatformType.ANDROID, BrowserStackAndroidManager::getDriver);
        MAP.put(MobilePlatformType.IOS, BrowserStackIosManager::getDriver);

    }
    public static WebDriver getDriver(MobilePlatformType mobilePlatformType) {
        return MAP.get(mobilePlatformType).get();
    }

}
