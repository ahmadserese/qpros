package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class FindOwnersPage {
    private WebDriver driver;
    private By findOwnerButton = By.cssSelector("#search-owner-form button");
    private By owners = By.cssSelector("#owners a");
    private By addOwnerButton = By.linkText("Add Owner");

    public FindOwnersPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFindOwnerButton(){
        driver.findElement(findOwnerButton).click();
    }

    public List<String> getAllOwners () {
        List<WebElement> ownersElementsList = driver.findElements(owners);
        List<String> ownersNamesList = ownersElementsList.stream().map(e->e.getText()).collect(Collectors.toList());
        ownersNamesList.forEach(System.out::println);
        return ownersNamesList;
    }

    public AddOwnerPage clickAddOwner() {
        driver.findElement(addOwnerButton).click();
        return new AddOwnerPage(driver);
    }
}
