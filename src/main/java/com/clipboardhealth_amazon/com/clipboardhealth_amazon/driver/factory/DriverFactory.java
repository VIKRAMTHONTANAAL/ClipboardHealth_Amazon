package com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.factory;

import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.*;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.entity.MobileDriverData;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.entity.WebDriverData;
import com.clipboardhealth_amazon.enums.RunModeType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class DriverFactory {

    private DriverFactory() {
    }

    private static final Map<RunModeType, Supplier<IWebDriver>> WEB = new EnumMap<>(RunModeType.class);
    private static final Map<RunModeType, Supplier<IMobileDriver>> MOBILE = new EnumMap<>(RunModeType.class);

    static {
        WEB.put(RunModeType.LOCAL, LocalWebDriverImpl::new);
        WEB.put(RunModeType.REMOTE, RemoteWebDriverImpl::new);
        MOBILE.put(RunModeType.LOCAL, LocalMobileDriverImpl::new);
        MOBILE.put(RunModeType.REMOTE, RemoteMobileDriverImpl::new);

    }

    public static IWebDriver getDriverForWeb(RunModeType runModeType) {
        return WEB.get(runModeType).get();
    }

    public static IMobileDriver getDriverForMobile(RunModeType runModeType) {
        return MOBILE.get(runModeType).get();
    }

}


