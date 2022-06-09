package com.clipboardhealth.amazon.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public final class PageActionManager {

    private PageActionManager(){}
    private static final ThreadLocal<ExtentTest> extest = new ThreadLocal<>();

    private static final ThreadLocal<ExtentReports> exreports = new ThreadLocal<>();

    public static void setTest(ExtentTest extentTest) {
        extest.set(extentTest);

    }
    public static void setReport(ExtentReports extentReports) {
        exreports.set(extentReports);
    }

    public static void unloadTest(){
        extest.remove();
    }

    public static void unloadReports(){
        exreports.remove();
    }



    public static ExtentTest getTest(){
        return extest.get();
    }

    public static ExtentReports getReports(){
        return exreports.get();
    }
}
