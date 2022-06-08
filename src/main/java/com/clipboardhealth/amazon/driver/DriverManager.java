package com.clipboardhealth.amazon.driver;

import com.clipboardhealth.amazon.enums.PlatformType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;

import static java.lang.ThreadLocal.withInitial;

public final class DriverManager {

    private DriverManager(){

    }

    private static final ThreadLocal<WebDriver> WEBDRIVERTHREADLOCAL = new ThreadLocal<>();
    private static final ThreadLocal<WebDriver> MOBILEDRIVERTHREADLOCAL = new ThreadLocal<>();

    private static final ThreadLocal<PlatformType> CONTEXT= withInitial(()-> PlatformType.WEB);

    private static final Map<PlatformType,ThreadLocal<WebDriver>> DRIVERMAP =new EnumMap<>(PlatformType.class);

    public static WebDriver getDriver() {
       return CONTEXT.get()== PlatformType.MOBILE
        ?  MOBILEDRIVERTHREADLOCAL.get()
        :  WEBDRIVERTHREADLOCAL.get();

    }

    public static void setDriver(WebDriver driver) {
        if (isMobileDriver(driver)) {
        MOBILEDRIVERTHREADLOCAL.set(driver);
        DRIVERMAP.put(PlatformType.MOBILE, MOBILEDRIVERTHREADLOCAL);
        CONTEXT.set(PlatformType.MOBILE);
        }else{
            WEBDRIVERTHREADLOCAL.set(driver);
            DRIVERMAP.put(PlatformType.WEB, WEBDRIVERTHREADLOCAL);
            CONTEXT.set(PlatformType.WEB);
        }
        }

    private static boolean isMobileDriver(WebDriver driver) {
        return driver instanceof AndroidDriver || driver instanceof IOSDriver;
    }

    public static void unload(){
        WEBDRIVERTHREADLOCAL.remove();
        MOBILEDRIVERTHREADLOCAL.remove();
        CONTEXT.remove();

    }
}
