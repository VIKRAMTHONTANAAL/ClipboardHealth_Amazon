package com.clipboardhealth_amazon.config;

import com.clipboardhealth_amazon.config.converters.StringToBrowserTypeConverter;
import com.clipboardhealth_amazon.enums.BrowserType;
import org.aeonbits.owner.Config;


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
}
