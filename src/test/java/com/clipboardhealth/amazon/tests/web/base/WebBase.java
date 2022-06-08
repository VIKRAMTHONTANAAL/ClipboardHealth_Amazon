package com.clipboardhealth.amazon.tests.web.base;

import com.clipboardhealth.amazon.driver.Driver;
import com.clipboardhealth.amazon.utils.PageActionsHelper;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WebBase {


    @BeforeMethod
    public void setUp(){
        Driver.initDriverForWeb();
        PageActionsHelper.setExtentReporterTestCaseName(this.toString());

    }

    @AfterMethod
    public void tearDown(){
        Driver.quitDriver();
        PageActionsHelper.endReport();
    }
}
