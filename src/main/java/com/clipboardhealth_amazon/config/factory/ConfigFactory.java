package com.clipboardhealth_amazon.config.factory;

import com.clipboardhealth_amazon.config.FrameworkConfig;
import org.aeonbits.owner.ConfigCache;

public final class ConfigFactory {

    private ConfigFactory(){}

    public static FrameworkConfig getConfig(){
return ConfigCache.getOrCreate(FrameworkConfig.class);
    }
}
