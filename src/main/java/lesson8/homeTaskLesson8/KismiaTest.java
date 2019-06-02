package lesson8.homeTaskLesson8;

import core.BrowserFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import trello.pages.LoginPage;

import static org.testng.AssertJUnit.*;
import static org.testng.AssertJUnit.assertEquals;

public class KismiaTest extends BrowserFactory {

    @Test(priority= 1)
    public void checkLogin() {

        LoginPage loginPage = new LoginPage();
        loginPage.open();
        assertNotNull(loginPage);
        assertEquals(driver.getCurrentUrl(), "https://kismia.com");
        assertEquals("Добро пожаловать!", driver.findElement(By.tagName("h1")).getText());
        loginPage.login("sergey.nedaikhleb@gmail.com", "****");
    }

    @Test(priority=2)
    public void checkBoard() {
        assertEquals("Personal Boards", driver.findElement(By.xpath("//*[@id='content']//h3")).getText());
        driver.findElement(By.className("member-initials")).click();
        assertEquals("SergNedaikhleb (sergnedaikhleb)", driver.findElement(By.className("pop-over-header-title")).getText());
        assertNotSame("Recently Viewed", driver.findElement(By.className("boards-page-board-section-header-name")).getText());
    }

    @Test(priority=3)
    public void Logout() {
        assertEquals("Log Out", driver.findElement(By.className("js-logout")).getText());
        driver.findElement(By.xpath("//*[@class='pop-over-list'][3]")).click();
        assertEquals("Logged out of Trello", driver.getTitle());
        assertEquals("Thanks for using Trello.", driver.findElement(By.tagName("h1")).getText());

    }
}


