import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestRunner extends Setup {
    @Test
    public  void doMul(){

        CalculatorScreen calScreen = new CalculatorScreen(driver);
        String sum = calScreen.Mul();
        System.out.println(sum);
        Assert.assertEquals(sum, "45");
    }
    @AfterMethod
    public void clearScreen(){
        CalculatorScreen calScreen = new CalculatorScreen(driver);
        calScreen.clearScrn.click();
    }
}