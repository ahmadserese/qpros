package owners;

import base.BaseTests;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AddOwnerPage;
import pages.FindOwnersPage;
import static org.testng.Assert.*;

public class AddOwnerTests extends BaseTests {

    private String firstName = "Ahmad";
    private String lastName = "Alasa'd";
    private String address = "Swefieh";
    private String city = "Amman";
    private String telephone = "+962000000";

    private String petName = "Zoro";
    private String petBirthDate = "2022-06-01";
    private String petType = "snake";

    @Test
    public void testAddedNewOwner() {
        FindOwnersPage findOwnersPage = homePage.clickFindOwner();
        AddOwnerPage addOwnerPage = findOwnersPage.clickAddOwner();
        addOwnerPage.addNewOwner(firstName,lastName,address,city,telephone);

        assertTrue( addOwnerPage.getAddedOwnerName().contains(firstName + " " +lastName) ,"Owner name is not correct");
        assertTrue(addOwnerPage.getAddedOwnerAddress().contains(address),"Owner address is not correct");
        assertTrue(addOwnerPage.getAddedOwnerCity().contains(city),"Owner city is not correct");
        assertTrue(addOwnerPage.getAddedOwnerTelePhone().contains(telephone),"Owner telephone is not correct");
    }

    @Test
    public void testAddedPet () {
        FindOwnersPage findOwnersPage = homePage.clickFindOwner();
        AddOwnerPage addOwnerPage = findOwnersPage.clickAddOwner();
        addOwnerPage.addNewOwner(firstName,lastName,address,city,telephone);

        addOwnerPage.clickAddNewPet();

        addOwnerPage.setPetName(petName);
        addOwnerPage.setPetBirthDate(petBirthDate);
        addOwnerPage.setPetType(petType);
        addOwnerPage.clickAddPetButton();

        assertTrue(addOwnerPage.getPetName().contains(petName),"Pet name is not correct");
        assertTrue(addOwnerPage.getPetBirthDate().contains(petBirthDate),"Pet birthdate is not correct");
        assertTrue(addOwnerPage.getPetType().contains(petType),"Pet type is not correct");
    }
}
