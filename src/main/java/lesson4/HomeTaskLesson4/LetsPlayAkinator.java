package lesson4.HomeTaskLesson4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class LetsPlayAkinator {
    public WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new FirefoxDriver();

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
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Scanner scanner = new Scanner(System.in);


        WebElement welcomeSign = driver.findElement(By.xpath("//*[@class='fc-choice-dialog']//h1"));
        System.out.println("Now I'm gonna play the game "+welcomeSign.getText());
        System.out.println("================================================");

        // define some locators for this game
        WebElement firstUserAgreement = driver.findElement(By.xpath("//*[@class='fc-button fc-button-consent']"));
        WebElement startButton = driver.findElement(By.xpath("//*[@class='btn-play']"));
        WebElement numberOfQuestion = driver.findElement((By.xpath("//*[@class='bubble-tail']/p")));
        WebElement textOgQuestion = driver.findElement(By.xpath("//*[@class='question-text']"));
        WebElement availableAnswers = driver.findElement((By.xpath("//*[@class='database-selection selector dialog-box']/ul")));
        WebElement answerFirst =driver.findElement((By.cssSelector("div.database-selection.selector.dialog-box > ul > li:nth-child(1)")));
        WebElement answerSecond =driver.findElement((By.cssSelector("div.database-selection.selector.dialog-box > ul > li:nth-child(2)")));
        WebElement answerThird =driver.findElement((By.cssSelector("div.database-selection.selector.dialog-box > ul > li:nth-child(3)")));
        WebElement answerFourth =driver.findElement((By.cssSelector("div.database-selection.selector.dialog-box > ul > li:nth-child(1)")));
        WebElement answerFifth =driver.findElement((By.cssSelector("div.database-selection.selector.dialog-box > ul > li:nth-child(1)")));

        // answers
        int answ = scanner.nextInt();
        if (answ == 1) {
            System.out.println("My answer is: " + answerFirst.getText());
            answerFirst.click();
        }else if (answ == 2){
            System.out.println("My answer is: " + answerSecond.getText());
            answerSecond.click();
        }else if (answ == 3){
            System.out.println("My answer is: " + answerThird);
            answerThird.click();
        }else if (answ == 4){
            System.out.println("My answer is: " + answerFourth);
            answerFourth.click();
        }else if (answ == 5){
            System.out.println("My answer is: " + answerFifth);
            answerFifth.click();
        }

        // define an explicit wait
        WebDriverWait waitBeforeClickAnswer = (new WebDriverWait(driver, 6));
        WebDriverWait waitAfterClickAnswer = (new WebDriverWait(driver, 6));

        // let's play
        firstUserAgreement.click();
        System.out.println("I see the question number "+numberOfQuestion.getText());
        System.out.println("His question is: "+textOgQuestion.getText());
        System.out.println("Offered answers: "+availableAnswers.getText());
        if (numberOfQuestion.getText().equals("2")) {
            System.out.println("Answer next question");
        }else {
            System.out.println("Looks like you finished");
        }


    }
}
