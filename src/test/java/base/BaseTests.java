package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        // if you are using mac or linux please remove .exe after chromedriver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        String url = "https://petclincqpros.herokuapp.com/";
        driver.get(url);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
