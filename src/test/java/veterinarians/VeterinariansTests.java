package veterinarians;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import pages.VeterinariansPage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class VeterinariansTests extends BaseTests {

    @Test
    public void testVeterinarians() {
       String[] expectedVeterinarians = {"James Carter", "Helen Leary","Linda Douglas","Rafael Ortega","Henry Stevens","Sharon Jenkins"};
       List<String> expectedVeterinariansList = Arrays.stream(expectedVeterinarians).collect(Collectors.toList());
       VeterinariansPage veterinariansPage = homePage.clickVeterinarians();
       List<String> actualVeterinarian = veterinariansPage.getAllVeterinarians();
       assertEquals(expectedVeterinariansList,actualVeterinarian,"Veterinarians are not correct");
    }
}
