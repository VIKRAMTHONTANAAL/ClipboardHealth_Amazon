package com.clipboardhealth.amazon.driver.entity;

import com.clipboardhealth.amazon.enums.MobilePlatformType;
import com.clipboardhealth.amazon.enums.MobileRemoteModeType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MobileDriverData {


    private MobilePlatformType mobilePlatformType;
    private MobileRemoteModeType mobileRemoteModeType;
}
