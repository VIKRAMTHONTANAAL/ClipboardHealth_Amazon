package com.clipboardhealth_amazon.utils;

import com.clipboardhealth_amazon.com.clipboardhealth_amazon.driver.DriverManager;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


@Log4j2
public class Scrollers {

    private Scrollers(){}


    public static void scrollToElement(WebElement element)
    {
        try
        {
            log.info("scrolling to element");
            ((JavascriptExecutor)DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView();", element);
            log.info("scrolled to element");
        } catch (Exception e)
        {
            log.error("failed to scroll to element {}", e.getMessage());
            log.debug("caught {}");
        }
    }

    public static void scrollToElementBy(By by)
    {
        try
        {
            WebElement element=DriverManager.getDriver().findElement(by);
            log.info("scrolling to element");
            ((JavascriptExecutor)DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView();", element);
            log.info("scrolled to element");
        } catch (Exception e)
        {
            log.error("failed to scroll to element {}", e.getMessage());
            log.debug("caught {}");
        }
    }

    public static void scrollToCoordinates(String x, String y)
    {
        try
        {
            log.info("scrolling to coordinates {}:x {}:y", x,y);
            ((JavascriptExecutor)DriverManager.getDriver()).executeScript("window.scrollBy(" + x + "," + y + ")");
            log.info("scrolled to coordinates {}:x {}:y", x,y);
        } catch (Exception e)
        {
            log.error("failed to scroll to coordinates {}:x {}:y {}", x,y,e.getMessage());
            log.debug("caught {}");
        }

    }

    public static void scrollVertically(String pixelOffset)
    {
        try
        {
            log.info("scrolling vertically");
            ((JavascriptExecutor)DriverManager.getDriver()).executeScript("window.scrollBy(0,"+pixelOffset+")");
            log.info("scrolled vertically");

        } catch (Exception e)
        {
            log.error("failed to scroll vertically {}", e.getMessage());
            log.debug("caught {}");

        }

    }

    public static void scrollToBottomPage()
    {
        try
        {
            log.info("scrolling to bottom most part of page");
            ((JavascriptExecutor)DriverManager.getDriver()).executeScript("window.scrollBy(0,document.body.scrollHeight");
            log.info("scrolled to bottom most part of page");

        } catch (Exception e)
        {
            log.error("failed to scroll to bottom most part of page {}", e.getMessage());
            log.debug("caught {}");

        }
    }


}
