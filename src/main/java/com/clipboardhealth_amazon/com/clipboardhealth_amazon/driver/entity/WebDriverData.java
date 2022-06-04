package com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.entity;

import com.clipboardhealth_amazon.enums.BrowserRemoteModeType;
import com.clipboardhealth_amazon.enums.BrowserType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class WebDriverData {

    private BrowserType browserType;
    private BrowserRemoteModeType browserRemoteModeType;
}
