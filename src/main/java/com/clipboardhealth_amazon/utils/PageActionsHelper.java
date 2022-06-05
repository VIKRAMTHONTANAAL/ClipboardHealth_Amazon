package com.clipboardhealth_amazon.utils;

import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.DriverManager;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;


@Log4j2
public class PageActionsHelper {

    private PageActionsHelper(){}

    static int waitTime=30;


    public static void click(By by){
        if (!isElementVisible(by))
            throw new RuntimeException("Unable to locate the element even after waiting for " +waitTime + " seconds");
        try {
            DriverManager.getDriver().findElement(by).click();
            log.info("Clicking on element");
        }
        catch (Exception e){
            log.error("failed to click on element: {}", e.getMessage());
            log.debug("caught {}", e);
        }
    }

    public static void sendKeys(By by, String value){
        if (!isElementVisible(by))
            throw new RuntimeException("Unable to locate the element even after waiting for " +waitTime + " seconds");
        try {
            DriverManager.getDriver().findElement(by).sendKeys(value);
            log.info("Input " + value + " in element");
        }
        catch (Exception e){
            log.error("failed to input "+value+" in element: {}", e.getMessage());
            log.debug("caught {}", e);
        }
    }

    public static String getPageTitle(){
        waitForPageLoad();
        return   DriverManager.getDriver().getTitle();
    }

    public static String getTextFromElement(By by){
        return   DriverManager.getDriver().findElement(by).getText();
    }

    public static boolean isElementVisible(By by) {
        try {
            new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(waitTime))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
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
            } catch (Throwable error) {
                Assert.fail("Timeout waiting for Page Load Request to complete.");
            }
        }
    }

    public static void selectFromDropDownByValue(By by, String value)
    {
        try
        {
            WebElement element=DriverManager.getDriver().findElement(by);
            log.info("selecting from dropdown by value {}", value);
            Select select = new Select(element);
            select.selectByValue(value);
            log.info("selected from dropdown by value {}", value);
        } catch (Exception e)
        {
            log.error("failed to select from dropdown by value {} : {}", value, e.getMessage());
            log.debug("caught {}", e);
        }
    }

    public static void clickOnElementUsingJs(By by)
    {
        try
        {
            WebElement element=DriverManager.getDriver().findElement(by);
            log.info("clicking on element using javascript");
            ((JavascriptExecutor)DriverManager.getDriver()).executeScript("arguments[0].click();",element);
            log.info("clicked on element using javascript");
        } catch (Exception e)
        {
            log.error("failed to click on element using javascript: {}", e.getMessage());
            log.debug("caught {}", e);
        }
    }

    public static void switchToSucceedingWindow(Integer iterations)
    {
        try
        {
            for (int i=0; i<iterations; i++)
            {
                String handlePointer = "";
                log.info("switching to succeeding window");
                ArrayList<String> windowHandles = new ArrayList<>(DriverManager.getDriver().getWindowHandles());
                String handle = DriverManager.getDriver().getWindowHandle();
                int windowHandlesSize = windowHandles.size();
                for (int k = 0; k < windowHandlesSize; k++)
                {
                    handlePointer = windowHandles.get(k);
                    if (handlePointer.equals(handle))
                    {
                        //If the last window is selected and to loop around the window, below condition suffice
                        if (k == (windowHandlesSize - 1))
                        {
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
                log.info("switched to succeeding window");
            }

        }
        catch (Exception e)
        {
            log.error("failed to switch to succeeding window {}", e.getMessage());
            log.debug("caught {}", e);

        }
    }


}
