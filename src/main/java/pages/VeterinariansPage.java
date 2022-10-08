package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class VeterinariansPage {
    private WebDriver driver;
    private By veterinarians = By.cssSelector("#vets td:first-child");
    public VeterinariansPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<String> getAllVeterinarians () {
        List<WebElement> veterinariansElementsList = driver.findElements(veterinarians);
        List<String> veterinariansNamesList = veterinariansElementsList.stream().map(e->e.getText()).collect(Collectors.toList());
        veterinariansNamesList.forEach(System.out::println);
        return veterinariansNamesList;
    }
}
