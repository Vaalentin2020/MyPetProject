import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class EcommerceAppTest extends DriverHelper {

    LocatorHelper locatorHelper = new LocatorHelper();

    @Test(enabled = false)
    public void openMainScreen() {
        locatorHelper.findById("com.androidsample.generalstore:id/nameField")
                .sendKeys("qwerty");
        driver.hideKeyboard();
        locatorHelper.findById("com.androidsample.generalstore:id/btnLetsShop").click();
    }

    @Test
    public void checkToast() {
        locatorHelper.findById("com.androidsample.generalstore:id/btnLetsShop").click();
        String toastText = locatorHelper.findByXPath("//(android.widget.Toast)[1]").getText();
        assertThat(toastText.toLowerCase()).isEqualTo("please enter your name");
    }
}
