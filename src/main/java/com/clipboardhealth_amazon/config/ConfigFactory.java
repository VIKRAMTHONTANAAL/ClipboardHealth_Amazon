package com.clipboardhealth_amazon.config;

import org.aeonbits.owner.ConfigCache;

public final class ConfigFactory {

    private ConfigFactory(){}

    public static FrameworkConfig getConfig(){
return ConfigCache.getOrCreate(FrameworkConfig.class);
    }
}
