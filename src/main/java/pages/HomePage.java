package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    private By petsImage = By.className("img-responsive");
    public HomePage (WebDriver driver) {
        this.driver =driver;
    }

    public WebElement getPetsImage() {
        return driver.findElement(petsImage);
    }

    public VeterinariansPage clickVeterinarians () {
        clickTapByClassName("glyphicon-th-list");
        return new VeterinariansPage(driver);
    }

    public FindOwnersPage clickFindOwner () {
        clickTapByClassName("glyphicon-search");
        return new FindOwnersPage(driver);
    }
    private void clickTapByClassName (String tabClass) {
        driver.findElement(By.className(tabClass)).click();
    }
}
