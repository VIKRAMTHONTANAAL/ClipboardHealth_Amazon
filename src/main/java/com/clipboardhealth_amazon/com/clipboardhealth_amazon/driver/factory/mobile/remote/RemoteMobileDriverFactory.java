package com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.factory.mobile.remote;

import com.clipboardhealth_amazon.enums.MobilePlatformType;
import com.clipboardhealth_amazon.enums.MobileRemoteModeType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public class RemoteMobileDriverFactory {


    private RemoteMobileDriverFactory() {
    }

    private static final Map<MobileRemoteModeType, Function<MobilePlatformType, WebDriver>> MAP = new EnumMap<>(MobileRemoteModeType.class);


    static {
        MAP.put(MobileRemoteModeType.PERFECTO, PerfectoMobileFactory::getDriver);
        MAP.put(MobileRemoteModeType.BROWSER_STACK, BrowserStackMobileFactory::getDriver);
    }


    public static WebDriver getDriver(MobileRemoteModeType mobileRemoteModeType, MobilePlatformType mobilePlatformType)  {

        return MAP.get(mobileRemoteModeType).apply(mobilePlatformType);
    }
}
