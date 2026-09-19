package tests;

import net.bytebuddy.build.Plugin;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pages.CalculatorPage;

public class CalculatorTest extends BaseTest {
    private CalculatorPage calcPage;

    @BeforeMethod
    public void initPage() {
        // Pass the thread-safe driver to the Page Factory constructor
        calcPage = new CalculatorPage(getDriver());
        calcPage.clickClear();
    }

    @Test (priority=1)
    public void testAddition() {

        calcPage.clickNumber("Seven");
        calcPage.clickPlus();
        calcPage.clickNumber("Five");
        calcPage.clickEquals();

        String result = calcPage.getResultText();
        Assert.assertEquals(result, "12", "Addition result is incorrect!");
    }

    @Test (priority=2)
    public void testMultiplication()
    {

        calcPage.clickNumber("Two");
        calcPage.clickMultiply();
        calcPage.clickNumber("Four");

        String result =calcPage.getResultText();

        Assert.assertEquals(result,"8","Multiplication result is incorrect!");

    }
}
