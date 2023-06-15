import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorHelper extends DriverHelper{

    public WebElement findByAccessId(String accessId){
        WebElement element = driver.findElement(AppiumBy.accessibilityId(accessId));
        return element;
    }

    public WebElement findByXPath(String xPath){
        WebElement element = driver.findElement(By.xpath(xPath));
        return element;
    }

    public WebElement findById(String id){
        WebElement element = driver.findElement(By.id(id));
        return element;
    }
}
