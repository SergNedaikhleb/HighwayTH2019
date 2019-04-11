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
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        System.out.println("Now I'm gonna play the game "+driver.getTitle());
        System.out.println("================================================");



        // define some locators for this game
        WebElement currentGameTask = driver.findElement(By.className("order"));
        WebElement gameLevel = driver.findElement(By.className("level-text"));
        WebElement rowForAnswer = driver.findElement((By.xpath("//*[@class='input-strobe' and @type='text']")));
        WebElement enterButton = driver.findElement(By.xpath("//*[@class='enter-button' and contains(text() , 'enter')]"));
        WebElement placeholder = driver.findElement(By.xpath("//*[@placeholder='Type in a CSS selector']"));
        WebElement chooseYourLevel =driver.findElement(By.xpath("//*[@class='level-menu-toggle-wrapper']"));
        WebElement nextLevel = driver.findElement(By.xpath("[@class='completed current']"));
    //    WebElement succes = driver.findElement(())

        // define an explicit wait
        WebDriverWait waitBeforeInputAnswer = (new WebDriverWait(driver, 6));
        WebDriverWait waitAfterInputAnswer = (new WebDriverWait(driver, 6));

        // let's play
        System.out.println("I am on "+gameLevel.getText());
        System.out.println("My task is: "+currentGameTask.getText());
   //     waitBeforeInputAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("plate"); // CANNOT !!!!!!!!!!!
        enterButton.click();
        chooseYourLevel.click();
        nextLevel.click();
    //    waitAfterInputAnswer.until(ExpectedConditions.textToBePresentInElementValue(gameLevel, "Level 2 of 32"));

        System.out.println("I am on "+gameLevel.getText());
        System.out.println("My task is: "+currentGameTask.getText());
 //       waitBeforeInputAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("bento"); // CANNOT !!!!!!!!!!!
        enterButton.click();
        enterButton.click();
        chooseYourLevel.click();
        nextLevel.click();
     //   waitAfterInputAnswer.until(ExpectedConditions.textToBePresentInElementValue(gameLevel, "Level 3 of 32"));


    }

    @AfterTest
    public void tearDown(){

       // driver.quit();
    }
}

// https://askubuntu.com/questions/870530/how-to-install-geckodriver-in-ubuntu
// https://selenium-python.com/install-geckodriver