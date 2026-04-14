package com.srm.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.srm.base.BasePage;

public class MyInfoPage extends BasePage {

    public MyInfoPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h6[text()='Personal Details']")
    WebElement personalDetailsHeader;

    @FindBy(name = "firstName")
    WebElement firstName;

    @FindBy(name = "lastName")
    WebElement lastName;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement saveBtn;

    public boolean isPersonalDetailsVisible() {
        waitForElement(personalDetailsHeader);
        return personalDetailsHeader.isDisplayed();
    }

    public void updateName(String fName, String lName) {
        waitForElement(firstName);
        firstName.clear();
        firstName.sendKeys(fName);

        lastName.clear();
        lastName.sendKeys(lName);

        saveBtn.click();
    }
}