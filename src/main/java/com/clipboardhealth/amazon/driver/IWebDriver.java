package com.clipboardhealth.amazon.driver;

import com.clipboardhealth.amazon.driver.entity.WebDriverData;
import org.openqa.selenium.WebDriver;

public interface IWebDriver {

   WebDriver getDriver(WebDriverData driverData);
}
