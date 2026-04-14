\# HRM Automation Framework - Design Document



\## 1. Objective



To design and develop a Selenium-based automation framework for testing the OrangeHRM application using Java, TestNG, and Page Object Model (POM).



\---



\## 2. Tools Used



\* Java

\* Selenium WebDriver

\* TestNG

\* Maven

\* WebDriverManager

\* Extent Reports



\---



\## 3. Framework Structure (POM)



The framework follows Page Object Model for better maintainability:



\* \*\*Base Layer\*\*



&#x20; \* BaseTest

&#x20; \* BasePage



\* \*\*Driver Layer\*\*



&#x20; \* DriverFactory



\* \*\*Page Layer\*\*



&#x20; \* LoginPage

&#x20; \* DashboardPage

&#x20; \* EmployeePage

&#x20; \* LeavePage

&#x20; \* AdminPage



\* \*\*Test Layer\*\*



&#x20; \* LoginTest

&#x20; \* EmployeeTest

&#x20; \* LeaveTest

&#x20; \* AdminTest

&#x20; \* ValidationTest



\* \*\*Utility Layer\*\*



&#x20; \* ConfigReader

&#x20; \* ScreenshotUtil

&#x20; \* ExtentManager



\---



\## 4. Test Scenarios



\### Authentication



\* Login with valid credentials

\* Login with invalid credentials

\* Login with empty fields



\### Employee Management



\* Add employee

\* Search employee



\### Leave Management



\* Apply leave



\### Admin Module



\* Create user



\### Validation



\* Empty field validation



\---



\## 5. Flow Diagram (Simple Flow)



Login → Dashboard → Navigate Module → Perform Action → Validate Result



\---



\## 6. Features



\* Page Object Model (POM)

\* FluentWait \& Explicit Wait

\* Screenshot on failure

\* Extent Reports

\* Clean reusable code



