package DrivMng;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverMng {

        static WebDriver driver;
        public static WebDriver getDriver() {
            if (driver == null) {
                initDriver();
            }
            return driver;
        }
        public static void initDriver(){
            String browserNm = System.getProperty("browser") == null ? "chrome" : System.getProperty("browser");
            switch (browserNm) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
            }
        }
    }
