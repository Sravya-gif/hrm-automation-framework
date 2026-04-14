package com.srm.utils;

import org.openqa.selenium.*;
import java.io.File;
import org.apache.commons.io.FileUtils;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {

    public static String capture(WebDriver driver, String testName) {

        String time = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String path = System.getProperty("user.dir") + "/screenshots/" + testName + "_" + time + ".png";

        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src, new File(path));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return path;
    }
}