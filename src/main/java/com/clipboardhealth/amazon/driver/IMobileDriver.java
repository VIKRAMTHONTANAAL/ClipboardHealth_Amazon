package com.clipboardhealth.amazon.driver;

import com.clipboardhealth.amazon.driver.entity.MobileDriverData;
import org.openqa.selenium.WebDriver;

public interface IMobileDriver {

    WebDriver getDriver(MobileDriverData driverData);
}
