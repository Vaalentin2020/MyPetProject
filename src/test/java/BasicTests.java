import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.net.MalformedURLException;

import static org.assertj.core.api.Assertions.*;


public class BasicTests extends DriverHelper {

    ActionHelper actionHelper = new ActionHelper();

    @Test(enabled = false)
    public void firstTest() throws MalformedURLException {

        String wifiText = "new wifi";
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
        driver.findElement(By.id("android:id/checkbox")).click();
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();

        String wifiPopUp = driver.findElement(By.id("android:id/alertTitle")).getText();
        assertThat(wifiPopUp).isEqualTo("WiFi settings");

        driver.findElement(By.id("android:id/edit")).sendKeys(wifiText);
        driver.findElement(By.id("android:id/button1")).click();

        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        assertThat(wifiText).isEqualTo(driver.findElement(By.id("android:id/edit")).getText());

    }

    @Test(enabled = false)
    public void checkLongPress() {
        driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
        driver.findElement(AppiumBy
                .xpath("//android.widget.TextView[@text='1. Custom Adapter']")).click();
        WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
        actionHelper.longPressAction(element);

        //Check that the element contains the certain text
        assertThat(driver.findElement(By
                .xpath("//android.widget.TextView[@resource-id='android:id/title']")).isDisplayed());
    }

    @Test
    public void checkScrolling() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        actionHelper.scrollToElement("Spinner");
        WebElement spinner = driver.findElement(AppiumBy.accessibilityId("Spinner"));
        assertThat(spinner.isDisplayed());
    }
}
