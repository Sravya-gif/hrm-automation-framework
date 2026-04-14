package com.srm.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.srm.base.BasePage;

public class DashboardPage extends BasePage {

    public DashboardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h6[text()='Dashboard']")
    WebElement dashboardText;

    @FindBy(xpath = "//span[text()='PIM']")
    WebElement pimMenu;

    @FindBy(xpath = "//span[text()='Leave']")
    WebElement leaveMenu;

    @FindBy(xpath = "//span[text()='Admin']")
    WebElement adminMenu;

    public boolean isDashboardDisplayed() {
        waitForElement(dashboardText);
        return dashboardText.isDisplayed();
    }

    public void goToPIM() {
        waitForElement(pimMenu);
        pimMenu.click();
    }

    public void goToLeave() {
        waitForElement(leaveMenu);
        leaveMenu.click();
    }

    public void goToAdmin() {
        waitForElement(adminMenu);
        adminMenu.click();
    }
}