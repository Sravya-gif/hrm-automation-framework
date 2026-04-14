package com.srm.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.srm.base.BasePage;

public class LeavePage extends BasePage {

    public LeavePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Apply']")
    WebElement applyTab;

    @FindBy(xpath = "//div[contains(@class,'oxd-select-text')]")
    WebElement leaveType;

    @FindBy(xpath = "//span[text()='US - Vacation']")
    WebElement leaveOption;

    @FindBy(xpath = "(//input[@placeholder='yyyy-dd-mm'])[1]")
    WebElement fromDate;

    @FindBy(xpath = "(//input[@placeholder='yyyy-dd-mm'])[2]")
    WebElement toDate;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement applyBtn;

    public void applyLeave(String from, String to) {

        waitForElement(applyTab);
        applyTab.click();

        waitForElement(leaveType);
        leaveType.click();

        waitForElement(leaveOption);
        leaveOption.click();

        fromDate.sendKeys(from);
        toDate.sendKeys(to);

        applyBtn.click();
    }
}