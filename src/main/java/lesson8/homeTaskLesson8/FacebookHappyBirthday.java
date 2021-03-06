package lesson8.homeTaskLesson8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class FacebookHappyBirthday {
    String[] birthdayMessage = {"Congratulations", "Best regards", "I wish you all good"};

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

        driver.findElement(By.id("email")).sendKeys("********@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("********"); //sorry, but I can't write you my password
        WebElement loginButton = driver.findElement(By.id("u_0_3"));
        loginButton.submit();
        WebDriverWait waitForMyPage = (new WebDriverWait(driver, 8));
        waitForMyPage.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='u_0_c']")));
    }
    @Test
        public void findBirthday() {
        driver.findElement(By.xpath("//*[@class='linkWrap hasCount' and contains(text(), 'Мероприятия')]")).click();
        WebDriverWait waitForEvent = (new WebDriverWait(driver, 8));
        waitForEvent.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='_3d2d _3d2f']")));
        driver.findElement(By.xpath("//*[@class='_2yav' and contains(text(), 'Дни рождения')]")).click();
        WebDriverWait waitForBirth = (new WebDriverWait(driver, 8));
        waitForBirth.until(ExpectedConditions.presenceOfElementLocated(By.id("birthdays_upcoming_card")));

    }
        @AfterTest
        public void testOver() {
            driver.close();

    }
}
