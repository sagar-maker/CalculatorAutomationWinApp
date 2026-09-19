package Pages;


import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

public class CalculatorPage {
    private final WindowsDriver driver;

    // 1. Locate elements using @FindBy annotations
    @FindBy(name = "Plus")
    private WebElement plusBtn;

    @FindBy(name = "Minus")
    private WebElement minusBtn;

    @FindBy(name = "Equals")
    private WebElement equalsBtn;

     @FindBy(id = "btn-multiply")
    private WebElement multiplyButton;

    @FindBy(name = "Clear")
    private WebElement clearBtn;

    // Appium's FieldDecorator seamlessly hooks into standard @FindBy or ID mappings
    @FindBy(id = "CalculatorResults")
    private WebElement resultResults;

    // 2. Constructor initializing elements via AppiumFieldDecorator
    // Change the constructor statement:
    public CalculatorPage(WindowsDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(2)), this);
    }


    public void clickNumber(String numberName) {
        // Dynamic elements cannot be easily hardcoded into a static @FindBy field,
        // so we still look up dynamic numbers at runtime using the driver instance.
        driver.findElement(By.name(numberName)).click();
    }

    public void clickPlus() {
        plusBtn.click();
    }

    public void clickMinus() {
        minusBtn.click();
    }

    public void clickEquals() {
        equalsBtn.click();
    }

    public void clickClear() {
        clearBtn.click();
    }

    public void clickMultiply()
    {
        multiplyButton.click();
    }

    public String getResultText() {
        String rawText = resultResults.getText();
        return rawText.replace("Display is", "").trim();
    }



}
