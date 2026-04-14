package com.srm.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.srm.base.BasePage;

public class EmployeePage extends BasePage {

    public EmployeePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()=' Add ']")
    WebElement addBtn;

    @FindBy(name = "firstName")
    WebElement firstName;

    @FindBy(name = "lastName")
    WebElement lastName;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement saveBtn;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchBtn;

    public void clickAddEmployee() {
        waitForElement(addBtn);
        addBtn.click();
    }

    public void addEmployee(String fName, String lName) {
        waitForElement(firstName);
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        saveBtn.click();
    }

    public void searchEmployee(String name) {
        waitForElement(searchBox);
        searchBox.sendKeys(name);
        searchBtn.click();
    }
}