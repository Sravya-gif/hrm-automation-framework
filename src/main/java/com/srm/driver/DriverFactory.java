package com.srm.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import com.srm.utils.ConfigReader;

public class DriverFactory {

    public static WebDriver driver;

    public static WebDriver initDriver() {

        String browser = ConfigReader.getProperty("browser");
 
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("baseUrl"));

        return driver;
    }
    public static WebDriver getDriver() {
        return driver;
    }
}