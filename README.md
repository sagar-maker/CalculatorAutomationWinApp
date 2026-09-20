# Calculator Automation WinApp

This project provides automated testing and interaction scripts for the Windows Calculator application using WinAppDriver (Windows Application Driver) and Selenium/Appium frameworks.

---

## Prerequisites

Before running or setting up this project, ensure you have the following installed and configured on your Windows machine:

1. **Windows 10 / 11** (Developer Mode must be enabled).
* Go to **Settings** > **Privacy & Security** > **For developers** > Turn **Developer Mode** to **ON**.


2. **WinAppDriver (Windows Application Driver)**:
* Download and install from the official [WinAppDriver GitHub Releases](https://www.google.com/search?q=https://github.com/microsoft/WinAppDriver/releases&utm_source=gemini).
* Default installation path: `C:\Program Files (x86)\Windows Application Driver\WinAppDriver.exe`


3. **Development Environment**:
* **Visual Studio** (2019 or later) or **VS Code** with [.NET SDK](https://dotnet.microsoft.com/download?utm_source=gemini) installed.


4. **Windows Calculator**:
* Ensure the native Windows Calculator app (`calc.exe`) is installed and accessible.



---

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/sagar-maker/CalculatorAutomationWinApp.git
cd CalculatorAutomationWinApp

```

### 2. Start WinAppDriver

Run WinAppDriver with administrative privileges:

1. Open Command Prompt or PowerShell as **Administrator**.
2. Run the executable:
```cmd
"C:\Program Files (x86)\Windows Application Driver\WinAppDriver.exe"

```


3. Ensure it starts listening at default URL: `[http://127.0.0.1:4723/](http://127.0.0.1:4723/)`.

---

## Running the Tests / Automation

### Using Visual Studio

1. Open `CalculatorAutomationWinApp.sln` in Visual Studio.
2. Restore NuGet packages if prompted (**Build** > **Restore NuGet Packages**).
3. Open **Test Explorer** (**Test** > **Test Explorer**).
4. Select **Run All Tests**.

### Using .NET CLI

```bash
dotnet restore
dotnet build
dotnet test

```

---

## Project Structure & Setup Details

* **Desired Capabilities Setup**:
* **App ID**: `Microsoft.WindowsCalculator_8wekyb3d8bbwe!App`
* **WinAppDriver URL**: `[http://127.0.0.1:4723/](http://127.0.0.1:4723/)`


* **Inspecting UI Elements**:
* Use tools like **Accessibility Insights for Windows** or **Inspect.exe** (included in Windows SDK) to inspect UI automation IDs, accessibility names, and class names for Calculator controls.



---

## Troubleshooting

* **`WebDriverException: OpenQA.Selenium.WebDriverException` / Connection Refused**:
* Verify `WinAppDriver.exe` is actively running in the background.


* **`UnauthorizedAccessException` or permission errors**:
* Ensure **Developer Mode** is turned ON in Windows Settings.
* Ensure WinAppDriver is launched as an Administrator.



---

## Contributing

Contributions, issues, and feature requests are welcome! Feel free to check the issues page or submit a pull request.
