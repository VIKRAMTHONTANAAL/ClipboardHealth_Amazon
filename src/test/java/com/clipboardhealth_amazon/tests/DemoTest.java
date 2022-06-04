package com.clipboardhealth_amazon.tests;

import com.clipboardhealth_amazon.config.BrowserStackConfig;
import com.clipboardhealth_amazon.config.factory.BrowserStackConfigFactory;
import com.clipboardhealth_amazon.config.factory.ConfigFactory;
import org.testng.annotations.Test;

public class DemoTest {


    @Test
    public void testLaunch() {
        System.out.println(BrowserStackConfigFactory.getConfig().browserStackURL());
        System.out.println(ConfigFactory.getConfig().browser());

    }

}
