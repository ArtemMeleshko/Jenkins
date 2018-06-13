import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriver getDriver(){
        System.setProperty("webdriver.chromedriver", "/SeleniumDrivers/chromedriver");
        driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }

    protected void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }
}


