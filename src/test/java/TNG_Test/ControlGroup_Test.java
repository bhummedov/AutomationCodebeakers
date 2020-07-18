package TNG_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import PageObject.ControlGroupPage;
import PageObject.JQueryHPage;

public class ControlGroup_Test {

    WebDriver driver;
    String baseUrl;
    JQueryHPage jQueryHPage;
    ControlGroupPage controlGroupPage; //change

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver","E:\\Dropbox\\Google Drive\\NAU Boot Camp\\Selenium Course\\selenium-java-3.141.59\\drivers\\chromedriver.exe");
        baseUrl = "https://jqueryui.com/";  //change
        driver = new ChromeDriver();
        jQueryHPage = new JQueryHPage(driver);
        controlGroupPage = new ControlGroupPage(driver);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void clickControlGroup() {
        jQueryHPage.clickCtrlGroup();
        jQueryHPage.switchFrame();
        Assert.assertEquals(controlGroupPage.headerText(), "Controlgroup");
    }

}
