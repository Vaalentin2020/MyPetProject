import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class ActionHelper extends DriverHelper {


    //Using JavaScript to implement long press
    public void longPressAction(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(), "duration", 1000));
    }

    public void scrollToElement(String element) {
        driver.findElement(AppiumBy.
                androidUIAutomator("new UiScrollable(new UiSelector())" +
                        ".scrollIntoView(text(\"" + element + "\"));"));
    }
}
