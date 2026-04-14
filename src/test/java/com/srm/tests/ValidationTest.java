package com.srm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.srm.base.BaseTest;
import com.srm.pages.LoginPage;

public class ValidationTest extends BaseTest {

	@Test
	public void emptyLoginValidation() {

	    try {
	        LoginPage lp = new LoginPage(driver);
	        lp.login("", "");

	        int count = lp.getRequiredMessageCount();

	        if (count >= 1) {
	            System.out.println("Validation Successful");
	        } else {
	            System.out.println("Validation Failed");
	            Assert.fail();
	        }

	    } catch (Exception e) {
	        System.out.println("Validation Failed");
	        Assert.fail();
	    }
	}
}
