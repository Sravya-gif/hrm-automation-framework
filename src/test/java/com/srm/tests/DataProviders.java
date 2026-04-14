package com.srm.tests;

import org.testng.annotations.DataProvider;
import com.srm.utils.ExcelUtils;

public class DataProviders {

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {

        String path = System.getProperty("user.dir") + "/src/main/resources/testdata2.xlsx";

        return ExcelUtils.getData(path, "Sheet1");
    }
}