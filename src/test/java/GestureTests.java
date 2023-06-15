import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;
public class GestureTests extends DriverHelper {
    LocatorHelper locatorHelper = new LocatorHelper();
    @Test
    public void checkSwipeGesture() {
        locatorHelper.findByAccessId("Views");
        locatorHelper.findByAccessId("Gallery");
        locatorHelper.findByAccessId("1. Photos");
        assertThat(locatorHelper.findByXPath("//(android.widget.ImageView)[1]").
                getAttribute("focusable")).
                    isEqualTo("true");



    }
}
