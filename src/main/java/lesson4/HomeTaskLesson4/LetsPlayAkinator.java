package lesson4.HomeTaskLesson4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.*;
import java.io.Console;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class LetsPlayAkinator {
    public WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();

    }

    @Test
    public void letsGuessBillGates() {

        // disable notifications
//        Map<String, Object> prefs = new HashMap<String, Object>();
//        prefs.put("profile.default_content_setting_values.notifications", 2);
//        FirefoxOptions options = new ChromeOptions();
//        options.setExperimentalOption("prefs", prefs);
//        WebDriver driver = new FirefoxDriver(options);

        // go to the page and set the implicit wait
        driver.get("https://ru.akinator.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        WebElement welcomeSign = driver.findElement(By.xpath("//*[@class='bubble-left bubble-home bubble']/p"));
        System.out.println("Now I'm gonna play the game " + welcomeSign.getText());
        System.out.println("================================================");

        // define some locators for this game
        //       WebElement firstUserAgreement = driver.findElement(By.xpath("//*[@class='fc-button fc-button-consent']"));
        WebElement startButton = driver.findElement(By.xpath("//*[@class='btn-play']"));
        //      WebElement numberOfQuestion = driver.findElement((By.xpath("//*[@id='game_content']//div[1]/p")));
        //      WebElement textOfQuestion = driver.findElement(By.xpath("//*[@class='question-text']"));
        //      WebElement availableAnswers = driver.findElement((By.xpath("//*[@class='database-selection selector dialog-box']")));
//        WebElement answerFirst =driver.findElement((By.cssSelector("div.database-selection.selector.dialog-box > ul > li:nth-child(1)")));
//        WebElement answerSecond =driver.findElement((By.cssSelector("div.database-selection.selector.dialog-box > ul > li:nth-child(2)")));
//        WebElement answerThird =driver.findElement((By.cssSelector("div.database-selection.selector.dialog-box > ul > li:nth-child(3)")));
//        WebElement answerFourth =driver.findElement((By.cssSelector("div.database-selection.selector.dialog-box > ul > li:nth-child(1)")));
//        WebElement answerFifth =driver.findElement((By.cssSelector("div.database-selection.selector.dialog-box > ul > li:nth-child(1)")));

        // define an explicit wait
        WebDriverWait waitBeforeClickAnswer = (new WebDriverWait(driver, 6));
        //       WebDriverWait waitAfterClickAnswer = (new WebDriverWait(driver, 6));

        // let's play
        //   waitBeforeClickAnswer.until(ExpectedConditions.elementToBeClickable(startButton));
        startButton.click();
        //    waitAfterClickAnswer.until(ExpectedConditions.visibilityOf(availableAnswers));
        WebElement numberOfQuestion = driver.findElement((By.xpath("//*[@id='game_content']//div[1]/p")));
        System.out.println("I see the question number " + numberOfQuestion.getText());
        WebElement textOfQuestion = driver.findElement(By.xpath("//*[@class='question-text']"));
        System.out.println("His question is:" + "\n" + textOfQuestion.getText());
        WebElement availableAnswers = driver.findElement((By.xpath("//*[@class='database-selection selector dialog-box']")));
        System.out.println("==================" + "\n" + "Offered answers: " + "\n" + "==================" + "\n" + availableAnswers.getText() + "\n" + "==================");
//        if (numberOfQuestion.getText().equals("2")) {
//            System.out.println("Answer next question");
//        }else {
//            System.out.println("Looks like you finished");
//        }

        // answers
        WebElement answerFirst = driver.findElement((By.cssSelector("div.database-selection.selector.dialog-box > ul > li:nth-child(1)")));
        WebElement answerSecond = driver.findElement((By.cssSelector("div.database-selection.selector.dialog-box > ul > li:nth-child(2)")));
        WebElement answerThird = driver.findElement((By.cssSelector("div.database-selection.selector.dialog-box > ul > li:nth-child(3)")));
        WebElement answerFourth = driver.findElement((By.cssSelector("div.database-selection.selector.dialog-box > ul > li:nth-child(1)")));
        WebElement answerFifth = driver.findElement((By.cssSelector("div.database-selection.selector.dialog-box > ul > li:nth-child(1)")));
        waitBeforeClickAnswer.until(ExpectedConditions.elementToBeClickable(By.id("a_yes")));
//
//        private static void canner () {
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();

        System.out.println("My answer is: " + ans);
//        if (ans.equals("1")) {
//            System.out.println("My answer is: " + answerFirst.getText());
//            answerFirst.click();
//        }else if (answer.matches("2")){
//            System.out.println("My answer is: " + answerSecond.getText());
//            answerSecond.click();
//        }else if (answer.matches("3")){
//            System.out.println("My answer is: " + answerThird.getText());
//            answerThird.click();
//        }else if (answer.matches("4")){
//            System.out.println("My answer is: " + answerFourth.getText());
//            answerFourth.click();
//        }else if (answer.matches("5")){
//            System.out.println("My answer is: " + answerFifth.getText());
//            answerFifth.click();
//        }
    }
    //  }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}