package com.clipboardhealth.amazon.utils;

import com.clipboardhealth.amazon.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class ScrollHelper {

    private ScrollHelper(){}


    public static void scrollToElement(WebElement element)
    {
        try
        {
            ((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView();", element);
        } catch (Exception e)
        {
           e.printStackTrace();
        }
    }

    public static void scrollToElementBy(By by)
    {
        try
        {
            WebElement element=DriverManager.getDriver().findElement(by);
            ((JavascriptExecutor)DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView();", element);
        } catch (Exception e)
        {
           e.printStackTrace();
        }
    }

    public static void scrollToCoordinates(String x, String y)
    {
        try
        {
            ((JavascriptExecutor)DriverManager.getDriver()).executeScript("window.scrollBy(" + x + "," + y + ")");
        } catch (Exception e)
        {
         e.printStackTrace();
        }

    }

    public static void scrollVertically(String pixelOffset)
    {
        try
        {
            ((JavascriptExecutor)DriverManager.getDriver()).executeScript("window.scrollBy(0,"+pixelOffset+")");
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public static void scrollToBottomPage()
    {
        try
        {
            ((JavascriptExecutor)DriverManager.getDriver()).executeScript("window.scrollBy(0,document.body.scrollHeight");
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
