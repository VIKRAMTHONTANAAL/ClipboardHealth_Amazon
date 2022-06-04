package com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.entity;


import com.clipboardhealth_amazon.enums.*;
import lombok.Builder;
import lombok.Getter;


@Builder
@Getter
public class DriverData {

    private BrowserType browserType;
    private BrowserRemoteModeType browserRemoteModeType;
    private MobilePlatformType mobilePlatformType;
    private RunModeType runModeType;
    private MobileRemoteModeType mobileRemoteModeType;

}
