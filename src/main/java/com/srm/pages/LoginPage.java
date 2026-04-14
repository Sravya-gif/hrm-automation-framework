package com.srm.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import com.srm.base.BasePage;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginBtn;

    @FindBy(xpath = "//p[contains(@class,'oxd-alert-content-text')]")
    WebElement errorMsg;

    @FindBy(xpath = "//span[text()='Required']")
    List<WebElement> requiredMsgs;

    public void login(String user, String pass) {

        waitForElement(username);

        username.clear();
        username.sendKeys(user);

        password.clear();
        password.sendKeys(pass);

        loginBtn.click();
    }

    public String getErrorMessage() {
        waitForElement(errorMsg);
        return errorMsg.getText();
    }

    public int getRequiredMessageCount() {
        return requiredMsgs.size();
    }
}