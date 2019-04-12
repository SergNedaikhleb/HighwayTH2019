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
        WebElement nextLevel = driver.findElement(By.xpath("//*[@class='checkmark']"));
    //    WebElement succes = driver.findElement(())

        // define an explicit wait
        WebDriverWait waitBeforeInputAnswer = (new WebDriverWait(driver, 6));
        WebDriverWait waitAfterInputAnswer = (new WebDriverWait(driver, 6));

        // let's play
        System.out.println("I am on "+gameLevel.getText());
        System.out.println("My task is: "+currentGameTask.getText());
        waitBeforeInputAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("plate"); // CANNOT !!!!!!!!!!!
        enterButton.click();
        waitAfterInputAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 2 of 32"));
        if (gameLevel.getText().equals("Level 2 of 32")) {
            System.out.println("OK");
        }else{
            System.out.println("I loose");

        }

        System.out.println("I am on "+gameLevel.getText());
        System.out.println("My task is: "+currentGameTask.getText());
        waitBeforeInputAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("bento");
        enterButton.click();
        waitAfterInputAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 3 of 32"));
        if (gameLevel.getText().equals("Level 3 of 32")) {
            System.out.println("OK");
        }else {
            System.out.println("I loose");
        }

        System.out.println("I am on "+gameLevel.getText());
        System.out.println("My task is: "+currentGameTask.getText());
        waitBeforeInputAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("#fancy");
        enterButton.click();
        waitAfterInputAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 4 of 32"));
            if (gameLevel.getText().equals("Level 4 of 32")) {
                System.out.println("OK");
            }else {
                System.out.println("I loose");
            }

        System.out.println("I am on "+gameLevel.getText());
        System.out.println("My task is: "+currentGameTask.getText());
        waitBeforeInputAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("plate apple");
        enterButton.click();
        waitAfterInputAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 5 of 32"));
                if (gameLevel.getText().equals("Level 5 of 32")) {
                    System.out.println("OK");
                }else {
                    System.out.println("I loose");
                }

        System.out.println("I am on "+gameLevel.getText());
        System.out.println("My task is: "+currentGameTask.getText());
        waitBeforeInputAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("#fancy pickle");
        enterButton.click();
        waitAfterInputAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 6 of 32"));
                    if (gameLevel.getText().equals("Level 6 of 32")) {
                        System.out.println("OK");
                    }else {
                        System.out.println("I loose");
                    }

        System.out.println("I am on "+gameLevel.getText());
        System.out.println("My task is: "+currentGameTask.getText());
        waitBeforeInputAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys(".small");
        enterButton.click();
        waitAfterInputAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 7 of 32"));
        if (gameLevel.getText().equals("Level 7 of 32")) {
            System.out.println("OK");
        }else {
            System.out.println("I loose");
        }

        System.out.println("I am on "+gameLevel.getText());
        System.out.println("My task is: "+currentGameTask.getText());
        waitBeforeInputAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("orange.small");
        enterButton.click();
        waitAfterInputAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 8 of 32"));
        if (gameLevel.getText().equals("Level 8 of 32")) {
            System.out.println("OK");
        }else {
            System.out.println("I loose");
        }

        System.out.println("I am on "+gameLevel.getText());
        System.out.println("My task is: "+currentGameTask.getText());
        waitBeforeInputAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("bento orange.small");
        enterButton.click();
        waitAfterInputAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 9 of 32"));
        if (gameLevel.getText().equals("Level 9 of 32")) {
            System.out.println("OK");
        }else {
            System.out.println("I loose");
        }

        System.out.println("I am on "+gameLevel.getText());
        System.out.println("My task is: "+currentGameTask.getText());
        waitBeforeInputAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("plate, bento");
        enterButton.click();
        waitAfterInputAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 10 of 32"));
        if (gameLevel.getText().equals("Level 10 of 32")) {
            System.out.println("OK");
        }else {
            System.out.println("I loose");
        }

        System.out.println("I am on "+gameLevel.getText());
        System.out.println("My task is: "+currentGameTask.getText());
        waitBeforeInputAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("*");
        enterButton.click();
        waitAfterInputAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 11 of 32"));
        if (gameLevel.getText().equals("Level 11 of 32")) {
            System.out.println("OK");
        }else {
            System.out.println("I loose");
        }

        System.out.println("I am on "+gameLevel.getText());
        System.out.println("My task is: "+currentGameTask.getText());
        waitBeforeInputAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("plate *");
        enterButton.click();
        waitAfterInputAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 12 of 32"));
        if (gameLevel.getText().equals("Level 12 of 32")) {
            System.out.println("OK");
        }else {
            System.out.println("I loose");
        }

        System.out.println("I am on "+gameLevel.getText());
        System.out.println("My task is: "+currentGameTask.getText());
        waitBeforeInputAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("plate + apple");
        enterButton.click();
        waitAfterInputAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 13 of 32"));
        if (gameLevel.getText().equals("Level 13 of 32")) {
            System.out.println("OK");
        }else {
            System.out.println("I loose");
        }

        System.out.println("I am on "+gameLevel.getText());
        System.out.println("My task is: "+currentGameTask.getText());
        waitBeforeInputAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("bento ~ pickle");
        enterButton.click();
        waitAfterInputAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 14 of 32"));
        if (gameLevel.getText().equals("Level 14 of 32")) {
            System.out.println("OK");
        }else {
            System.out.println("I loose");
        }

        System.out.println("I am on "+gameLevel.getText());
        System.out.println("My task is: "+currentGameTask.getText());
        waitBeforeInputAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("plate > apple");
        enterButton.click();
        waitAfterInputAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 15 of 32"));
        if (gameLevel.getText().equals("Level 15 of 32")) {
            System.out.println("OK");
        }else {
            System.out.println("I loose");
        }

        System.out.println("I am on "+gameLevel.getText());
        System.out.println("My task is: "+currentGameTask.getText());
        waitBeforeInputAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("plate orange:first-child");
        enterButton.click();
        waitAfterInputAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 16 of 32"));
        if (gameLevel.getText().equals("Level 16 of 32")) {
            System.out.println("OK");
        }else {
            System.out.println("I loose");
        }

        System.out.println("I am on "+gameLevel.getText());
        System.out.println("My task is: "+currentGameTask.getText());
        waitBeforeInputAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("plate apple, plate pickle");
        enterButton.click();
        waitAfterInputAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 17 of 32"));
        if (gameLevel.getText().equals("Level 17 of 32")) {
            System.out.println("OK");
        }else {
            System.out.println("I loose");
        }

        System.out.println("I am on "+gameLevel.getText());
        System.out.println("My task is: "+currentGameTask.getText());
        waitBeforeInputAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys(".small:last-child");
        enterButton.click();
        waitAfterInputAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 18 of 32"));
        if (gameLevel.getText().equals("Level 18 of 32")) {
            System.out.println("OK");
        }else {
            System.out.println("I loose");
        }

        System.out.println("I am on "+gameLevel.getText());
        System.out.println("My task is: "+currentGameTask.getText());
        waitBeforeInputAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("plate:nth-child(3)");
        enterButton.click();
        waitAfterInputAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 19 of 32"));
        if (gameLevel.getText().equals("Level 19 of 32")) {
            System.out.println("OK");
        }else {
            System.out.println("I loose");
        }

        System.out.println("I am on "+gameLevel.getText());
        System.out.println("My task is: "+currentGameTask.getText());
        waitBeforeInputAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("bento:nth-last-child(3)");
        enterButton.click();
        waitAfterInputAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 20 of 32"));
        if (gameLevel.getText().equals("Level 20 of 32")) {
            System.out.println("OK");
        }else {
            System.out.println("I loose");
        }

        System.out.println("I am on "+gameLevel.getText());
        System.out.println("My task is: "+currentGameTask.getText());
        waitBeforeInputAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("apple:first-of-type");
        enterButton.click();
        waitAfterInputAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 21 of 32"));
        if (gameLevel.getText().equals("Level 21 of 32")) {
            System.out.println("OK");
        }else {
            System.out.println("I loose");
        }

        System.out.println("I am on "+gameLevel.getText());
        System.out.println("My task is: "+currentGameTask.getText());
        waitBeforeInputAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("apple:first-of-type");
        enterButton.click();
        waitAfterInputAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 22 of 32"));
        if (gameLevel.getText().equals("Level 22 of 32")) {
            System.out.println("OK");
        }else {
            System.out.println("I loose");
        }




    }

    @AfterTest
    public void tearDown(){

       // driver.quit();
    }
}

// https://askubuntu.com/questions/870530/how-to-install-geckodriver-in-ubuntu
// https://selenium-python.com/install-geckodriver