package com.clipboardhealth.amazon.tests.mobile.base;

import com.clipboardhealth.amazon.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class MobileBase {


    @BeforeMethod
    public void setUp(){
        Driver.initDriverForMobile();

    }
    @AfterMethod
    public void tearDown(){
        Driver.quitDriver();

    }
}
