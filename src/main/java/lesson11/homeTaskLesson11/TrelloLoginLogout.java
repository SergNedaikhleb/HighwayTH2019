package lesson11.homeTaskLesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;
import core.BrowserFactory;
import trello.pages.LoginPage;

import static org.testng.AssertJUnit.*;

public class TrelloLoginLogout extends BrowserFactory {

    @Test(priority=1)
    public void checkLogin() {

       LoginPage loginPage = new LoginPage();
       loginPage.open();
       assertNotNull(loginPage);
       assertEquals(driver.getCurrentUrl(), "https://trello.com/login");
       assertEquals("Log in to Trello", driver.findElement(By.tagName("h1")).getText());
       loginPage.login("sergey.nedaikhleb@gmail.com", "");
    }

    @Test(priority=2)
    public void checkBoard() {
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertEquals("Personal Boards", driver.findElement(By.xpath("//*[@id='content']//h3")).getText());
        driver.findElement(By.className("member-initials")).click();
        assertEquals("SergNedaikhleb (sergnedaikhleb)", driver.findElement(By.className("pop-over-header-title")).getText());
        assertNotSame("Recently Viewed", driver.findElement(By.className("boards-page-board-section-header-name")).getText());
    }

    @Test(priority=3)
    public void checkBoardsAmount() {
        driver.findElement(By.xpath("//*[@id='content']//div[2]//div[2]//div[1]/div/ul/li")).click();
        assertEquals("Menu", driver.findElement(By.className(".board-menu-header-content")).getText());
//        driver.navigate().back();

    }


    @AfterTest
    public void tearDown() {

   //     driver.manage().deleteAllCookies();
    //    driver.quit();
    }

    }
