package com.srm.listeners;

import org.openqa.selenium.WebDriver;
import org.testng.*;

import com.aventstack.extentreports.*;
import com.srm.utils.*;
import com.srm.driver.DriverFactory;

public class TestListener implements ITestListener {

    ExtentReports extent = ExtentManager.getReport();
    ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getName());

        
        System.out.println("STARTED: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {

       
        System.out.println(result.getName() + " PASSED");

        test.pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

   
        System.out.println(result.getName() + " FAILED");

        WebDriver driver = DriverFactory.getDriver();

        String path = ScreenshotUtil.capture(driver, result.getName());

        test.fail("Test Failed");
        test.addScreenCaptureFromPath(path);
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}