
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorScreen {
    @FindBy(id = "com.google.android.calculator:id/digit_9")
    AndroidElement btn9;
    @FindBy(id = "com.google.android.calculator:id/op_add")
    AndroidElement plus;
    @FindBy(id = "com.google.android.calculator:id/digit_5")
    AndroidElement btn5;

    @FindBy(id = "com.google.android.calculator:id/op_div")
    AndroidElement btnDiv;
    @FindBy(id = "com.google.android.calculator:id/op_mul")
    AndroidElement btnMul;
    @FindBy(id = "com.google.android.calculator:id/result_preview")
    AndroidElement previewRes;
    @FindBy(id = "com.google.android.calculator:id/clr")
    AndroidElement clearScrn;

    public CalculatorScreen(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String Mul (){
        btn5.click();
        btnMul.click();
        btn9.click();
        return previewRes.getText();
    }
}