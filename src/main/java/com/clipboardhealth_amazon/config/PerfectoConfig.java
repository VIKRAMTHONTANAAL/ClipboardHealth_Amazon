package com.clipboardhealth_amazon.config;

import com.clipboardhealth_amazon.config.converters.StringToURLConverter;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "file:${user.dir}/src/test/resources/perfecto.properties"
})
public interface PerfectoConfig extends Config {

    String username();

    String key();

    @DefaultValue("https://${username}:${key}@hub-cloud.perfecto.com/wd/hub")
    @ConverterClass(StringToURLConverter.class)
    URL perfectoURL();
}
