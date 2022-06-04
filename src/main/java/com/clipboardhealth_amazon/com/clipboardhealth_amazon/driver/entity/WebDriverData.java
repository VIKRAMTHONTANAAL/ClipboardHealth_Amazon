package com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.entity;

import com.clipboardhealth_amazon.enums.BrowserRemoteModeType;
import com.clipboardhealth_amazon.enums.BrowserType;
import com.clipboardhealth_amazon.enums.RunModeType;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class WebDriverData {

    private BrowserType browserType;
    private BrowserRemoteModeType browserRemoteModeType;
    private RunModeType runModeType;
}
