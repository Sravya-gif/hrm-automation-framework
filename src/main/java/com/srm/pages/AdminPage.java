package com.srm.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.srm.base.BasePage;

public class AdminPage extends BasePage {

    public AdminPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()=' Add ']")
    WebElement addUserBtn;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement username;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    WebElement password;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    WebElement confirmPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement saveBtn;

    public void addUser(String user, String pass) {
        waitForElement(addUserBtn);
        addUserBtn.click();

        waitForElement(username);
        username.sendKeys(user);
        password.sendKeys(pass);
        confirmPassword.sendKeys(pass);

        saveBtn.click();
    }
}