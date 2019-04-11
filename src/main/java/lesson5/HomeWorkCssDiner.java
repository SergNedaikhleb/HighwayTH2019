package lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomeWorkCssDiner {

    public WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new FirefoxDriver();
    }

    @Test
            public void myCssDinerTest() {

        // go to the page and set the implicit wait
        driver.get("https://flukeout.github.io/");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);


        System.out.println("Now I'm gonna play the game "+driver.getTitle());
        System.out.println("================================================");



        // define some locators for this game
        WebElement currentGameTask = driver.findElement(By.className("order"));
        WebElement gameLevel = driver.findElement(By.className("level-header"));
        WebElement rowForAnswer = driver.findElement((By.xpath("//*[@class='input-strobe' and @type='text']")));
        WebElement inputAnswer = driver.findElement((By.xpath("//*[@class='plus' and contains(text(),'+')]")));
        WebElement enterButton = driver.findElement(By.xpath("//*[@class='enter-button' and contains(text() , 'enter')]"));

        // define an explicit wait
        WebDriverWait waitBeforeInputAnswer = (new WebDriverWait(driver, 3));

        // let's play
        System.out.println("I am on "+gameLevel.getText());
        System.out.println("My task is: "+currentGameTask.getText());
        waitBeforeInputAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("plate"); // CANNOT !!!!!!!!!!!
        enterButton.click();
    }

    @AfterTest
    public void tearDown(){

        driver.quit();
    }
}
