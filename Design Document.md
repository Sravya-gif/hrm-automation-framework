\# HRM Automation Framework - Design Document


1. Introduction
```
This project is an automation testing framework built using Selenium and Java for the OrangeHRM web application.
The framework automates important features like login, employee management, leave management, admin user management, and form validations.
```

2. Tools & Technologies
```
Java
Selenium WebDriver
TestNG
Maven
WebDriverManager
Extent Reports
Apache POI (for Excel data)
```

4. Key Features

```
Page Object Model (POM)
Data-driven testing using Excel
Screenshot capture on failure
Extent report generation
Config file usage (no hardcoding)
FluentWait for dynamic elements
TestNG for test execution
```

* Project Structure
```
HRM-Automation-Framework
│
├── src/main/java
│   ├── com.srm.base
│   │   ├── BasePage.java
│   │   └── BaseTest.java
│   │
│   ├── com.srm.driver
│   │   └── DriverFactory.java
│   │
│   ├── com.srm.pages
│   │   ├── LoginPage.java
│   │   ├── DashboardPage.java
│   │   ├── EmployeePage.java
│   │   ├── LeavePage.java
│   │   ├── AdminPage.java
│   │   └── MyInfoPage.java
│   │
│   ├── com.srm.utils
│   │   ├── ConfigReader.java
│   │   ├── ExcelUtils.java
│   │   ├── ScreenshotUtil.java
│   │   └── ExtentManager.java
│
├── src/main/resources
│   ├── config.properties
│   └── testdata.xlsx
│
├── src/test/java
│   ├── com.srm.tests
│   │   ├── LoginTest.java
│   │   ├── EmployeeTest.java
│   │   ├── LeaveTest.java
│   │   ├── AdminTest.java
│   │   └── ValidationTest.java
│   │
│   ├── com.srm.listeners
│   │   ├── TestListener.java
│   │   └── RetryAnalyzer.java
│
├── screenshots
│   └── (failure screenshots stored here)
│
├── reports
│   └── (Extent HTML reports generated here)
│
├── testng.xml
├── pom.xml
```
