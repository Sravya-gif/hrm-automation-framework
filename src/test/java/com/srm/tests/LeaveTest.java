package com.srm.tests;

import org.testng.annotations.Test;

import com.srm.base.BaseTest;
import com.srm.pages.*;

public class LeaveTest extends BaseTest {

    @Test
    public void applyLeaveTest() {

        LoginPage lp = new LoginPage(driver);
        lp.login("Admin", "admin123");

        DashboardPage dp = new DashboardPage(driver);
        dp.goToLeave();

        LeavePage leave = new LeavePage(driver);

        leave.applyLeave("2026-15-04", "2026-16-04");

        System.out.println("Leave applied");
    }
}