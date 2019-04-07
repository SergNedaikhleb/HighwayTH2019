package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PersonalExample {

    private WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
    }


    @Test
    public void myTest(){

        // go on the page

        driver.get("https://codeception.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait waitFor = (new WebDriverWait(driver, 5));
        waitFor.until(ExpectedConditions.presenceOfElementLocated(By.id("home-hero")));

        WebElement table = driver.findElement(By.className("mission-text"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", table);
        WebDriverWait waitFor1 = (new WebDriverWait(driver, 10));
        waitFor1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/a")));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement codeception = driver.findElement(By.xpath("/html/body/div[3]/a"));
        codeception.click();
        WebDriverWait waitForText = (new WebDriverWait(driver, 5));
        waitForText.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'Install via Composer')]")));
    }

    @AfterTest
    public void tearDown(){
     //   driver.quit();
    }
}
