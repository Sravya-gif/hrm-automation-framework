package com.srm.tests;

import org.testng.annotations.Test;

import com.srm.base.BaseTest;
import com.srm.pages.*;

public class EmployeeTest extends BaseTest {

    @Test
    public void addEmployeeTest() {

        LoginPage lp = new LoginPage(driver);
        lp.login("Admin", "admin123");

        DashboardPage dp = new DashboardPage(driver);
        dp.goToPIM();

        EmployeePage ep = new EmployeePage(driver);
        ep.clickAddEmployee();
        ep.addEmployee("John", "Doe");
    }

    @Test
    public void searchEmployeeTest() {

        LoginPage lp = new LoginPage(driver);
        lp.login("Admin", "admin123");

        DashboardPage dp = new DashboardPage(driver);
        dp.goToPIM();

        EmployeePage ep = new EmployeePage(driver);
        ep.searchEmployee("John");
    }
}