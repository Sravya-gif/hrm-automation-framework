package com.srm.tests;

import org.testng.annotations.Test;

import com.srm.base.BaseTest;
import com.srm.pages.*;

public class AdminTest extends BaseTest {

    @Test
    public void addUserTest() {

        LoginPage lp = new LoginPage(driver);
        lp.login("Admin", "admin123");

        DashboardPage dp = new DashboardPage(driver);
        dp.goToAdmin();

        AdminPage ap = new AdminPage(driver);
        ap.addUser("testuser123", "Test@123");
    }
}