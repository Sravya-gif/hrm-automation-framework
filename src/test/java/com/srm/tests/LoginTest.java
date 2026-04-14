package com.srm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.srm.base.BaseTest;
import com.srm.pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void testLogin() {

	    try {
	        LoginPage lp = new LoginPage(driver);
	        lp.login("Admin", "admin123");

	        if (driver.getCurrentUrl().contains("dashboard")) {
	            System.out.println("Login Successful");
	        } else {
	            System.out.println("Login Failed");
	            Assert.fail();
	        }

	    } catch (Exception e) {
	        System.out.println("Login Failed");
	        Assert.fail();
	    }
	}
}