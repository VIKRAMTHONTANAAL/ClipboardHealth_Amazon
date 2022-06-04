package com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver;

import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.factory.web.local.LocalDriverFactory;
import com.clipboardhealth_amazon.config.factory.ConfigFactory;
import org.openqa.selenium.WebDriver;

public final class Driver {

private Driver(){}
    public static void initDriver() {
        WebDriver driver = LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
        driver.get("https://www.amazon.in");
    }

    public static void quitDriver() {
/*
 *
 */


    }
}
