package TNG_Test;

import managers.DriverMgr;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import PageObject.DatepickerPage;
import PageObject.JQueryHPage;

public class DatePickerBonigarcia_Test {

    WebDriver driver;
    String baseUrl;
    JQueryHPage jQueryHPage;
    DatepickerPage datepickerPage;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver","E:\\Dropbox\\Google Drive\\NAU Boot Camp\\Selenium Course\\selenium-java-3.141.59\\drivers\\chromedriver.exe"); //web driver location
        baseUrl = "https://jqueryui.com/";
       // WebDriverManager.firefoxdriver().setup();

       // driver = new FirefoxDriver();
        driver = DriverMgr.getDriver();
        jQueryHPage = new JQueryHPage(driver);
        datepickerPage = new DatepickerPage(driver);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void selectDateTest() throws InterruptedException {
        jQueryHPage.clickDatePicker();
        jQueryHPage.switchFrame();
        datepickerPage.clickDatePick();
//        System.setProperty("date","5");
       // datepickerPage.getAllDates("4");
        datepickerPage.getAllDates(System.getProperty("date"));
        Thread.sleep(5000);
    }

}
