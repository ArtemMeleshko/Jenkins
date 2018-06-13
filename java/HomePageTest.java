

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.w3c.dom.html.HTMLInputElement;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;



public class HomePageTest extends BaseTest{
    Alert alert;
    @BeforeMethod
    public void openPage() throws InterruptedException {
        String siteurl = "lbaydatgap04.enterprise.nbty.global:8080/dyn/admin/nucleus/com/nbty/commerce/integration/ordergroove/HBOrderGrooveConfig/";
        String URL = "http://" + "admin" +":" + "admin321" + "@" + siteurl;

        //initial values of the HBOG properties
        String AllSubscriptionURL = "https://staging.restapi.ordergroove.com/subscriptions/";

        getDriver().get(URL);
        driver.findElement(By.xpath("//*[text()='allSubscriptionsUrl']")).click();
        WebElement NewValue_allsubcritpionurl = driver.findElement(By.name("newValue"));

        NewValue_allsubcritpionurl.sendKeys(AllSubscriptionURL + "Iwannabreakyou");
        WebElement click_change = driver.findElement(By.name("change"));
        click_change.click();

        NewValue_allsubcritpionurl = driver.findElement(By.name("newValue"));
        NewValue_allsubcritpionurl.sendKeys(AllSubscriptionURL);
        click_change = driver.findElement(By.name("change"));
        click_change.click();

        driver.findElement(By.xpath("//*[text()='HBOrderGrooveConfig/']")).click();

        Thread.sleep(100111);


    }


    @Test
    public void ChangeValue()  {













    }

    @AfterMethod
    public void quitDriver(){
        tearDown();
    }

    }



