package com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.entity;

import com.clipboardhealth_amazon.enums.*;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MobileDriverData {


    private MobilePlatformType mobilePlatformType;
    private MobileRemoteModeType mobileRemoteModeType;
    private RunModeType runModeType;
}
