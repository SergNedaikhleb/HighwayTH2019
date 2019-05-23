package lesson11.homeTaskLesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;
import core.BrowserFactory;
import trello.pages.LoginPage;

import static org.testng.AssertJUnit.assertEquals;

public class TrelloLoginLogout extends BrowserFactory {

    @Test(priority=1)
    public void checkLogin() {

       LoginPage loginPage = new LoginPage();
       loginPage.open();
       assertEquals(driver.getCurrentUrl(), "https://trello.com/login");
       assertEquals("Log in to Trello", driver.findElement(By.tagName("h1")).getText());
       loginPage.login("sergey.nedaikhleb@gmail.com", "*****");
    }

    @Test(priority=2)
    public void checkBoard() {
      //  assertEquals("Boards", driver.findElement(By.tagName("h3")).getText());
        assertEquals("Personal Boards", driver.findElement(By.xpath("//*[@id='content']//h3")).getText());
        driver.findElement(By.className("member-initials")).click();
        assertEquals("SergNedaikhleb (sergnedaikhleb)", driver.findElement(By.className("pop-over-header-title")).getText());
    }


    @AfterTest
    public void tearDown() {

   //     driver.manage().deleteAllCookies();
    //    driver.quit();
    }

    }
