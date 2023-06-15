import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverHelper {

    public static AndroidDriver driver;

    @BeforeClass
    public void configureAppium() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel6");
        options.setApp("/Users/valentingavrilov/IdeaProjects/AppiumPetProject/src/main/java/app/ApiDemos-debug.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
    }


    @AfterClass
    public void quitDriver() {
        driver.quit();
    }
}
