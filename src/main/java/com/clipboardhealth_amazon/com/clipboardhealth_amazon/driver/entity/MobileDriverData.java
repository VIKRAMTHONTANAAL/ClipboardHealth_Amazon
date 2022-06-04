package com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.entity;

import com.clipboardhealth_amazon.enums.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MobileDriverData {


    private MobilePlatformType mobilePlatformType;
    private MobileRemoteModeType mobileRemoteModeType;
}
