package owners;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FindOwnersPage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class FindOwnersTests extends BaseTests {
     @Test
    public void testOwners () {
         FindOwnersPage findOwnersPage = homePage.clickFindOwner();
         findOwnersPage.clickFindOwnerButton();
         findOwnersPage.getAllOwners();
     }
}
