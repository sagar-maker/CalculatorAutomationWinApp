 **Java + Appium / WinAppDriver + Page Object Model (POM)** desktop automation framework:

```markdown
# Windows Desktop App Automation using Appium & Java (Page Object Model)

This repository contains automated UI test scripts for the native Windows Calculator application (`calc.exe`). The test automation framework is built using **Java**, **Appium (WinAppDriver)**, **TestNG**, and follows the **Page Object Model (POM)** architectural pattern.

---

## 🏗️ Architecture & Framework Overview

* **Programming Language:** Java (JDK 11+)
* **Driver / Server:** Appium Server / WinAppDriver (Windows Application Driver)
* **Automation Library:** Appium Java Client (`io.appium:java-client`)
* **Test Runner & Assertions:** TestNG
* **Design Pattern:** Page Object Model (POM) — Encapsulates UI elements and actions into reusable Page classes.

---

## 📋 Prerequisites

Before running the tests, verify that your Windows environment meets the following requirements:

1. **Windows 10 or 11** with **Developer Mode** enabled:
   * Open **Settings** > **Privacy & Security** > **For developers**
   * Switch **Developer Mode** to **ON**.
2. **WinAppDriver (Windows Application Driver)**:
   * Download and install the latest release from the official [WinAppDriver Releases](https://github.com/microsoft/WinAppDriver/releases).
   * Default path: `C:\Program Files (x86)\Windows Application Driver\WinAppDriver.exe`
3. **Java Development Kit (JDK 11 or higher)** installed and `JAVA_HOME` environment variable configured.
4. **Maven** installed and configured in system `PATH`.
5. **UI Inspection Tool**: Use **Accessibility Insights for Windows** or `Inspect.exe` (Windows SDK) to inspect UI element IDs and accessibility attributes.

---

## 🚀 Getting Started

### 1. Clone the Repository
```bash
git clone [https://github.com/sagar-maker/CalculatorAutomationWinApp.git](https://github.com/sagar-maker/CalculatorAutomationWinApp.git)
cd CalculatorAutomationWinApp

```

### 2. Start WinAppDriver

WinAppDriver must be active before running test execution:

1. Open PowerShell or Command Prompt as **Administrator**.
2. Run the executable:
```cmd
"C:\Program Files (x86)\Windows Application Driver\WinAppDriver.exe"

```


3. Ensure it starts listening on default endpoint: `http://127.0.0.1:4723/`

---

## 🧪 Running Tests

### Option 1: Via Command Line (Maven)

```bash
mvn clean test

```

### Option 2: Via IDE (IntelliJ IDEA / Eclipse)

1. Import the project as a **Maven Project**.
2. Navigate to `src/test/java/...`
3. Right-click on the TestNG test suite or test class and select **Run**.

---

## 📐 Page Object Model (POM) Structure

```text
src/
├── main/java/pages/
│   ├── BasePage.java         # Common driver methods and element interactions
│   └── CalculatorPage.java   # Page object defining Calculator UI elements and operational methods
└── test/java/tests/
    ├── BaseTest.java         # Driver setup (DesiredCapabilities), teardown, and session lifecycle
    └── CalculatorTest.java   # TestNG test scripts verifying calculator operations

```

---

## ⚙️ Desired Capabilities Setup

```java
DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
capabilities.setCapability("platformName", "Windows");
capabilities.setCapability("deviceName", "WindowsPC");

WindowsDriver<WindowsElement> driver = new WindowsDriver<>(
    new URL("[http://127.0.0.1:4723/](http://127.0.0.1:4723/)"), capabilities
);

```

---

## ❓ Troubleshooting

* **`SessionNotCreatedException: Could not start a new session`**
* Confirm that `WinAppDriver.exe` is actively running.
* Verify that **Developer Mode** is enabled on Windows.


* **`NoSuchElementException`**
* Verify Automation IDs or Accessibility Names using *Accessibility Insights for Windows*. Ensure the calculator window is completely rendered before interacting with controls.



```

---

### How to Add this File to Your GitHub Repository

Run these commands in your project directory to push the `README.md` to GitHub:

```bash
git add README.md
git commit -m "Add Appium Java POM documentation to README"
git push origin main

```
