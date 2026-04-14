package com.srm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

import com.srm.utils.ConfigReader;

public class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;

        wait = new WebDriverWait(driver,
                Duration.ofSeconds(Integer.parseInt(ConfigReader.getProperty("timeout"))));
    }

    public void waitForElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}