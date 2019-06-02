package lesson8.homeTaskLesson8;

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

public class FacebookZeRoshenRemind {

    private WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
    }


    @Test
    public void loginFacebook() {
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebDriverWait waitForFBPage = (new WebDriverWait(driver, 8));
        waitForFBPage.until(ExpectedConditions.presenceOfElementLocated(By.className("mbs _3ma _6n _6s _6v")));

        driver.findElement(By.id("email")).sendKeys("neeshloshad@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("********"); //sorry, but I can't write you my password
        WebElement loginButton = driver.findElement(By.id("u_0_3"));
        loginButton.submit();
        WebDriverWait waitForMyPage = (new WebDriverWait(driver, 8));
        waitForMyPage.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='u_0_c']")));
    }
    @Test(dependsOnMethods = {"loginFacebook"})
    public void scrollAndFind() {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)"); //Scroll vertically down by 1000 pixels


    }


    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}


