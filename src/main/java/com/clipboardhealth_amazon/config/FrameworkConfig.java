package com.clipboardhealth_amazon.config;

import com.clipboardhealth_amazon.config.converters.*;
import com.clipboardhealth_amazon.enums.BrowserRemoteModeType;
import com.clipboardhealth_amazon.enums.BrowserType;
import com.clipboardhealth_amazon.enums.MobileRemoteModeType;
import com.clipboardhealth_amazon.enums.RunModeType;
import org.aeonbits.owner.Config;


import java.net.URL;


@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("Chrome")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();


    @Key("runModeBrowser")
    @ConverterClass(StringToRunModeBrowserTypeConverter.class)
    RunModeType browserRunMode();

    @Key("browserRemoteMode")
    @ConverterClass(StringToRemoteModeBrowserTypeConverter.class)
    BrowserRemoteModeType browserRemoteMode();

    @Key("mobileRemoteMode")
    @ConverterClass(StringToMobileRemoteModeTypeConverter.class)
    MobileRemoteModeType mobileRemoteMode();

    @Key("runModeMobile")
    @ConverterClass(StringToRunModeBrowserTypeConverter.class)
    RunModeType mobileRunMode();

    @ConverterClass(StringToURLConverter.class )
    URL seleniumGridURL();
    @ConverterClass(StringToURLConverter.class )
    URL selenoidURL();

    @ConverterClass(StringToURLConverter.class )
    @DefaultValue("http://127.0.0.1:4723/wd/hub")
    URL localAppiumServerURL();


}
