package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddOwnerPage {
    private WebDriver driver;
    private By firstNameField = By.id("firstName");
    private By lastNameField = By.id("lastName");
    private By addressField = By.id("address");
    private By cityField = By.id("city");
    private By telephoneField = By.id("telephone");
    private By addOwnerSubmitButton = By.cssSelector("#add-owner-form button");
    private By ownerName = By.xpath("/html/body/div/div/table[1]/tbody/tr[1]/td/b");
    private By ownerAddress = By.xpath("/html/body/div/div/table[1]/tbody/tr[2]/td");
    private By ownerCity = By.xpath("/html/body/div/div/table[1]/tbody/tr[3]/td");
    private By ownerTelephone = By.xpath("/html/body/div/div/table[1]/tbody/tr[4]/td");
    private By addNewPetButton = By.cssSelector("body > div > div > a:nth-child(4)");
    private By petNameField = By.id("name");
    private By petBirthDateField = By.id("birthDate");
    private By petTypeDropDown = By.id("type");
    private By petName = By.xpath("/html/body/div/div/table[2]/tbody/tr/td[1]/dl/dd[1]");
    private By petBirthDate = By.xpath("/html/body/div/div/table[2]/tbody/tr/td[1]/dl/dd[2]");
    private By petType = By.xpath("/html/body/div/div/table[2]/tbody/tr/td[1]/dl/dd[3]");
    private By addPetButton = By.cssSelector(".form-horizontal button");
    public AddOwnerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void setAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public void setCity(String city) {
        driver.findElement(cityField).sendKeys(city); ;
    }

    public void setTelephone(String telephone) {
        driver.findElement(telephoneField).sendKeys(telephone); ;
    }

    public void clickAddOwnerSubmitButton () {
        driver.findElement(addOwnerSubmitButton).click();
    }

    public String getAddedOwnerName () {
        return driver.findElement(ownerName).getText();
    }

    public String getAddedOwnerAddress () {
        return driver.findElement(ownerAddress).getText();
    }

    public String getAddedOwnerCity () {
        return driver.findElement(ownerCity).getText();
    }

    public String getAddedOwnerTelePhone () {
        return driver.findElement(ownerTelephone).getText();
    }

    public void clickAddNewPet () {
        driver.findElement(addNewPetButton).click();
    }

    public void setPetName (String petName) {
        driver.findElement(petNameField).sendKeys(petName);
    }

    public void setPetBirthDate (String petBirthDate) {
        driver.findElement(petBirthDateField).sendKeys(petBirthDate);
    }

    public void setPetType (String petType) {
        Select dropDownElement = new Select(driver.findElement(petTypeDropDown));
        dropDownElement.selectByVisibleText(petType);
    }

    public String getPetName () {
        return driver.findElement(petName).getText();
    }

    public String getPetBirthDate () {
        return driver.findElement(petBirthDate).getText();
    }

    public String getPetType () {
        return driver.findElement(petType).getText();
    }

    public void clickAddPetButton () {
        driver.findElement(addPetButton).click();
    }

    public void addNewOwner( String firstName, String lastName ,String address, String city,String telephone){
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setCity(city);
        setTelephone(telephone);
        clickAddOwnerSubmitButton();
    }
}
