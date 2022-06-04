package com.clipboardhealth_amazon.tests;

import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.Driver;
import org.testng.annotations.BeforeMethod;

public class WebBase {


    @BeforeMethod
    public void setUp(){
        Driver.initDriverForWeb();
        Driver.initDriverForMobile();

    }
}
