package com.clipboardhealth_amazon.tests.web.base;

import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.clipboardhealth_amazon.utils.PageActionsHelper.*;

public class WebBase {


    @BeforeMethod
    public void setUp(){
        Driver.initDriverForWeb();
        setExtentReporter_TestCaseName(this.toString());

    }

    @AfterMethod
    public void tearDown(){
        Driver.quitDriver();
        endReport();
    }
}
