package lesson11.homeTaskLesson11;

import core.BrowserFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import trello.pages.LoginPage;
import java.util.concurrent.TimeUnit;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class TrelloPublicPrivate extends BrowserFactory {


    @Test(priority=1)
    public void trelloLogin() {

        LoginPage loginPage = new LoginPage();
        loginPage.open();
        assertNotNull(loginPage);
        assertEquals(driver.getCurrentUrl(), "https://trello.com/login");
        assertEquals("Log in to Trello", driver.findElement(By.tagName("h1")).getText());
        loginPage.login("sergey.nedaikhleb@gmail.com", "******");
    }

    @Test(priority=2)
    public void createPrivateBoard() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertEquals("Personal Boards", driver.findElement(By.xpath("//*[@id='content']//h3")).getText());
        driver.findElement(By.xpath("//*[@id='header']/div[5]/a[1]/span")).click();
        assertEquals("Create", driver.findElement(By.className("pop-over-header-title")).getText());
        driver.findElement(By.xpath("//*[@class='js-new-board']")).click();
        find(By.xpath("//*[@class='subtle-chooser-trigger unstyled-button vis-chooser-trigger']"));
        type((By.xpath("//*[@class='subtle-input']")), "PrivBoard");
        driver.findElement(By.xpath("//span[contains(text(),'Create Board')]")).click();
        click(By.xpath("//*[@class='js-board-editing-target board-header-btn-text']"));
        driver.navigate().back();

    }

    @Test(priority=3)
    public void createPublicBoard() {
        driver.navigate().refresh();
        find(By.xpath("//*[@id='content']//h3"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertEquals("Personal Boards", driver.findElement(By.xpath("//*[@id='content']//h3")).getText());
        driver.findElement(By.xpath("//*[@id='header']/div[5]/a[1]/span")).click();
       // assertEquals("Create", driver.findElement(By.className("pop-over-header-title")).getText());
        driver.findElement(By.xpath("//*[@class='js-new-board']")).click();
        find(By.xpath("//*[@class='subtle-chooser-trigger unstyled-button vis-chooser-trigger']"));
        type((By.xpath("//*[@class='subtle-input']")), "PublBoard");
        driver.findElement(By.xpath("//*[@class='subtle-chooser-trigger unstyled-button vis-chooser-trigger']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Public')]")).click();
        click(By.xpath("//*[@class='js-confirm full primary']"));
        driver.findElement(By.xpath("//span[contains(text(),'Create Board')]")).click();
        find(By.xpath("//*[@class='js-board-editing-target board-header-btn-text']"));
        driver.navigate().back();
    }

    @Test(priority=4)
    public void compareTwoBoard() {
        driver.navigate().refresh();
        assertEquals("Recently Viewed", driver.findElement(By.xpath("//h3[contains(text(),'Recently Viewed')]")).getText());
        driver.findElement(By.xpath("//div[@title='PrivBoard']")).click();
        find(By.xpath("//*[@id='permission-level']//span[2]"));
        assertEquals("Private", driver.findElement(By.xpath("//*[@id='permission-level']//span[2]")).getText());
        driver.navigate().back();
        find(By.xpath("//h3[contains(text(),'Recently Viewed')]"));
        driver.findElement(By.xpath("//div[@title='PublBoard']")).click();
        find(By.xpath("//*[@id='permission-level']//span[2]"));
        assertEquals("Public", driver.findElement(By.xpath("//*[@id='permission-level']//span[2]")).getText());
    }
}
