package com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver;

import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.entity.WebDriverData;
import org.openqa.selenium.WebDriver;

public interface IWebDriver {

   WebDriver getDriver(WebDriverData driverData);
}
