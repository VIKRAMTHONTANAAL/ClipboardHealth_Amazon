package com.clipboardhealth.amazon.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.clipboardhealth.amazon.driver.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import static com.clipboardhealth.amazon.utils.PageActionManager.setReport;


public final class PageActionsHelper {


    private PageActionsHelper() {
    }


    static int waitTime = 30;
    static ExtentTest test;
    static ExtentReports extent;

    public static void click(By by) {
        if (!isElementVisible(by))
            throw new RuntimeException("Unable to locate the element even after waiting for " + waitTime + " seconds");
        try {
            DriverManager.getDriver().findElement(by).click();
            PageActionManager.getTest().pass("Clicking on element " + by, MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
        } catch (Exception e) {
            PageActionManager.getTest().fail("Clicking on element " + by, MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
        }
    }

    public static void sendKeys(By by, String value) {
        if (!isElementVisible(by))
            throw new RuntimeException("Unable to locate the element even after waiting for " + waitTime + " seconds");
        try {
            DriverManager.getDriver().findElement(by).sendKeys(value);
            PageActionManager.getTest().pass("Input " + value + " in element");
        } catch (Exception e) {
            PageActionManager.getTest().fail("failed to input " + value + " in element: {}", MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
        }
    }

    public static String getPageTitle() {
        waitForPageLoad();
        return DriverManager.getDriver().getTitle();
    }

    public static String getTextFromElement(By by) {
        PageActionManager.getTest().pass("Text:///// " + DriverManager.getDriver().findElement(by).getText() + "//// in element");
        return DriverManager.getDriver().findElement(by).getText();
    }

    public static boolean isElementVisible(By by) {
        try {
            new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(waitTime)).until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        } catch (TimeoutException ex) {
            return false;
        }
    }

    public static void waitForPageLoad() {
        if (DriverManager.getDriver() != null) {
            ExpectedCondition<Boolean> expectation = driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
            try {
                Thread.sleep(3000);
                WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(waitTime));
                wait.until(expectation);
            } catch (Exception e) {
                Assert.fail("Timeout waiting for Page Load Request to complete.");
            }
        }
    }

    public static void selectFromDropDownByValue(By by, String value) {
        try {
            WebElement element = DriverManager.getDriver().findElement(by);

            Select select = new Select(element);
            select.selectByValue(value);
            PageActionManager.getTest().pass("selected from dropdown by value {}");
        } catch (Exception e) {
            PageActionManager.getTest().fail("failed to select from dropdown by value {} : {}", MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
        }
    }

    public static void clickOnElementUsingJs(By by) {
        try {
            WebElement element = DriverManager.getDriver().findElement(by);
            ((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].click();", element);
            PageActionManager.getTest().pass("clicked on element using javascript", MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
        } catch (Exception e) {
            PageActionManager.getTest().fail("failed to click on element using javascript: {}", MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
        }
    }

    public static void switchToSucceedingWindow(Integer iterations) {
        try {
            for (int i = 0; i < iterations; i++) {
                String handlePointer = "";
                ArrayList<String> windowHandles = new ArrayList<>(DriverManager.getDriver().getWindowHandles());
                String handle = DriverManager.getDriver().getWindowHandle();
                int windowHandlesSize = windowHandles.size();
                for (int k = 0; k < windowHandlesSize; k++) {
                    handlePointer = windowHandles.get(k);
                    if (handlePointer.equals(handle)) {
                        //If the last window is selected and to loop around the window, below condition suffice
                        if (k == (windowHandlesSize - 1)) {
                            handlePointer = windowHandles.get(0);
                            break;
                        }
                        //Increment handler pointer index and grab that handler data from array list
                        handlePointer = windowHandles.get(k + 1);
                        break;
                    }
                }
                //Switch to previous (or preceding) tab
                DriverManager.getDriver().switchTo().window(handlePointer);
                PageActionManager.getTest().pass("switched to succeeding window");

            }

        } catch (Exception e) {
            PageActionManager.getTest().fail("failed to switch to succeeding window {}", MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());

        }
    }

    public static void setExtentReporterTestCaseName(String testCaseName) {
        extent = new ExtentReports();
        setReport(extent);
        ExtentSparkReporter spark = new ExtentSparkReporter(testCaseName + ".html");
        final File conf = new File("extent-config.json");
        try {
            spark.loadJSONConfig(conf);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        extent.attachReporter(spark);
        test = extent.createTest(testCaseName);
        PageActionManager.setTest(test);
    }

    public static void endReport() {
        PageActionManager.getReports().flush();
        PageActionManager.unloadReports();
        PageActionManager.unloadTest();
    }

    public static String getBase64() {
        return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
    }


}
