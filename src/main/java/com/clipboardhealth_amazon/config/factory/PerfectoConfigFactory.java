package com.clipboardhealth_amazon.config.factory;

import com.clipboardhealth_amazon.config.PerfectoConfig;
import org.aeonbits.owner.ConfigCache;

public final class PerfectoConfigFactory {

    private PerfectoConfigFactory(){}

    public static PerfectoConfig getConfig(){
return ConfigCache.getOrCreate(PerfectoConfig.class);
    }
}
