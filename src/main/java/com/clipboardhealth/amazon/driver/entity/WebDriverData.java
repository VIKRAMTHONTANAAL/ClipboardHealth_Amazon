package com.clipboardhealth.amazon.driver.entity;

import com.clipboardhealth.amazon.enums.BrowserRemoteModeType;
import com.clipboardhealth.amazon.enums.BrowserType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class WebDriverData {

    private BrowserType browserType;
    private BrowserRemoteModeType browserRemoteModeType;
}
