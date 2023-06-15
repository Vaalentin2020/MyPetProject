import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class GestureTests extends DriverHelper {
    LocatorHelper locatorHelper = new LocatorHelper();
    ActionHelper actionHelper = new ActionHelper();

    @Test
    public void checkSwipeGesture() {
        locatorHelper.findByAccessId("Views").click();
        locatorHelper.findByAccessId("Gallery").click();
        locatorHelper.findByAccessId("1. Photos").click();
        WebElement firstImage = locatorHelper.findByXPath("//(android.widget.ImageView)[1]");
        //Check if the element is on focus
        assertThat(firstImage.getAttribute("focusable")).isEqualTo("true");
        //Perform swiping
        actionHelper.swipe(firstImage, "left");
        //Check the element isn't in focus after swipe
        assertThat(firstImage.getAttribute("focusable")).isEqualTo("false");
    }
}
