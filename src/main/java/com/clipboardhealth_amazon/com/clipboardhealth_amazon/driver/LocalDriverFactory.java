package com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver;

import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.manager.ChromeManager;
import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.manager.FirefoxManager;
import com.clipboardhealth_amazon.config.ConfigFactory;
import com.clipboardhealth_amazon.enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class LocalDriverFactory {

private LocalDriverFactory(){}

    public static WebDriver getDriver(){
        WebDriver driver=null;
        if (isBrowserChrome()) driver = ChromeManager.getDriver();
         else driver = FirefoxManager.getDriver();

        return driver;

    }

    private static boolean isBrowserChrome() {
        return ConfigFactory.getConfig().browser() == BrowserType.CHROME;
    }

}
