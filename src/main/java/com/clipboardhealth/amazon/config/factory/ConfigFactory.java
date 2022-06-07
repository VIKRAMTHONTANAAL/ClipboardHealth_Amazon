package com.clipboardhealth.amazon.config.factory;

import com.clipboardhealth.amazon.config.FrameworkConfig;
import org.aeonbits.owner.ConfigCache;

public final class ConfigFactory {

    private ConfigFactory(){}

    public static FrameworkConfig getConfig(){
return ConfigCache.getOrCreate(FrameworkConfig.class);
    }
}
