package com.clipboardhealth_amazon.config;

import com.clipboardhealth_amazon.config.converters.StringToBrowserTypeConverter;
import com.clipboardhealth_amazon.config.converters.StringToURLConverter;
import com.clipboardhealth_amazon.enums.BrowserRemoteModeType;
import com.clipboardhealth_amazon.enums.BrowserType;
import com.clipboardhealth_amazon.enums.RunModeBrowserType;
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
    RunModeBrowserType browserRunMode();

    @Key("browserRemoteMode")
    BrowserRemoteModeType browserRemoteMode();

    @ConverterClass(StringToURLConverter.class )
    URL seleniumGridURL();
    @ConverterClass(StringToURLConverter.class )
    URL selenoidURL();
}
