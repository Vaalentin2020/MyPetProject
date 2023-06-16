import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class LocatorHelper extends DriverHelper {

    public WebElement findByAccessId(String accessId) {
        WebElement element = driver.findElement(AppiumBy.accessibilityId(accessId));
        return element;
    }

    public WebElement findByXPath(String xPath) {
        WebElement element = driver.findElement(By.xpath(xPath));
        return element;
    }

    public WebElement findByXPathIndex(String xPath, int index) {
        List<WebElement> elementsList = driver.findElements(By.xpath(xPath));
        WebElement element = elementsList.get(index);
        return element;
    }

    public WebElement findById(String id) {
        WebElement element = driver.findElement(By.id(id));
        return element;
    }
}
