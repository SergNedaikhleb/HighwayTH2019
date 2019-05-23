package lesson11.homeTaskLesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import trello.pages.LoginPage;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class TrelloLoginLogout {

    private static WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void checkLogin() {

        LoginPage LoginPage = new LoginPage(driver);
        LoginPage.open();
       // driver.get("https://trello.com/login");
        assertEquals("Log in to Trello", driver.findElement(By.tagName("h1")).getText());
        LoginPage.login("sergey.nedaikhleb@gmail.com", "zelenka666");
    }


    @AfterTest
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }

    }
