package com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver;

import com.clipboardhealth_amazon.config.ConfigFactory;
import com.clipboardhealth_amazon.enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class Driver {

private Driver(){}
    public static void initDriver() {
        WebDriver driver = LocalDriverFactory.getDriver();
        driver.get("https://www.amazon.in");
    }

    public static void quitDriver() {
/*
 *
 */


    }
}
