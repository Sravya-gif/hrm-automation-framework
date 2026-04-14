package com.srm.utils;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    public static ExtentReports getReport() {

        String path = System.getProperty("user.dir") + "/reports/report.html";

        ExtentSparkReporter reporter = new ExtentSparkReporter(path);

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        return extent;
    }
}