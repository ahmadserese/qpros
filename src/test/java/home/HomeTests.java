package home;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class HomeTests extends BaseTests {

    @Test
    public void testPetsImage () {
       var petsImage = homePage.getPetsImage();
        assertTrue(petsImage.isDisplayed(),"pets image is not displayed");
    }
}
