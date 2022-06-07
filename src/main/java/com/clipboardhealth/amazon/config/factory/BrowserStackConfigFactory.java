package com.clipboardhealth.amazon.config.factory;

import com.clipboardhealth.amazon.config.BrowserStackConfig;
import org.aeonbits.owner.ConfigCache;

public final class BrowserStackConfigFactory {

    private BrowserStackConfigFactory(){}

    public static BrowserStackConfig getConfig(){
return ConfigCache.getOrCreate(BrowserStackConfig.class);
    }
}
