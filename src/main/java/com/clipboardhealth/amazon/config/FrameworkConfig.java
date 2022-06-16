package com.clipboardhealth.amazon.config;

import com.clipboardhealth.amazon.config.converters.*;
import com.clipboardhealth.amazon.enums.BrowserRemoteModeType;
import com.clipboardhealth.amazon.enums.BrowserType;
import com.clipboardhealth.amazon.enums.MobileRemoteModeType;
import com.clipboardhealth.amazon.enums.RunModeType;
import org.aeonbits.owner.Config;



import java.net.URL;


@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties",
        "file:${user.dir}/src/test/resources/prod-config.properties",
        "file:${user.dir}/src/test/resources/qa-config.properties"
})
public interface FrameworkConfig extends Config {
    @DefaultValue("staging")
    String environment();

    @Key("${environment}.Url")
    @DefaultValue("https://www.amazon.in")
    String Url();

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

    @ConverterClass(StringToURLConverter.class)
    URL seleniumGridURL();

    @ConverterClass(StringToURLConverter.class)
    URL selenoidURL();

    @ConverterClass(StringToURLConverter.class)
    @DefaultValue("http://127.0.0.1:4723/wd/hub")
    URL localAppiumServerURL();



}
