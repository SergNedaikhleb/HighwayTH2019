package lesson11.homeTaskLesson11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import trello.pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class TrelloLoginLogout {

    public WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    public void checkLogin() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LoginPage LoginPage = new LoginPage();
        LoginPage.open();
        LoginPage.login("sergey.nedaikhleb@gmail.com", "zelenka666");
    }


    @AfterTest
    public void tearDown() {

        driver.manage().deleteAllCookies();
        driver.quit();
    }

    }
