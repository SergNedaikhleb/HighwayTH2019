package lesson4.HomeTaskLesson4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class LetsPlayAkinator {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ru.akinator.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        WebElement welcomeSign = driver.findElement(By.xpath("//*[@class='bubble-left bubble-home bubble']/p"));
        System.out.println("Now I'm gonna play the game " + welcomeSign.getText());
        System.out.println("================================================");

        // define some locators for this game
        WebElement startButton = driver.findElement(By.xpath("//*[@class='btn-play']"));

        if (startButton.isEnabled()) {
            startButton.click();
        }else{
            WebDriverWait wait  = (new WebDriverWait(driver, 6));
                    wait.until(ExpectedConditions.elementToBeClickable(startButton));
        }

        while (5 == driver.findElements(By.xpath("//div[@class='database-selection selector dialog-box']/ul/li")).size()) {
            WebElement question = driver.findElement(By.xpath("//p[@class='question-text']"));
            System.out.println("???  "+question.getText()+"   ???");
            List<WebElement> answrsElems = driver.findElements(By.xpath("//div[@class='database-selection selector dialog-box']/ul/li"));
            int answrNumber = 0;
            for(WebElement answrsElem : answrsElems){
                answrNumber++;
                System.out.println("----------------" + "\n" +answrNumber + "." + answrsElem.getText());
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("==================" + "\n"+"My answer is: ");
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1: answrsElems.get(0).click();
                    break;
                case 2: answrsElems.get(1).click();
                    break;
                case 3: answrsElems.get(2).click();
                    break;
                case 4: answrsElems.get(3).click();
                    break;
                case 5: answrsElems.get(4).click();
                    break;
                default:  System.out.println("Please, try again");
                    break;
            }
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@id='div-overlay']/img"))));

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("And the result is: ");
        System.out.println("=============="+ "\n"+driver.findElement(By.xpath("//span[@class='proposal-title']")).getText()+ "\n"+"============");
        System.out.println("Is it your subject??");
        System.out.println(" 1 - YES,"+ "\n"+" 2 - NO");
        int userInput2 = scanner.nextInt();

        if (userInput2 == 1) {
            System.out.println("Congratulations and goodbye!");
            driver.quit();
        }
        else if (userInput2 == 2) {
            System.out.println("Oh, it's a pity. Try again later");
                    driver.quit();
        }
        else {
            System.out.println("I don't know what you want, good bye.");
            driver.quit();
        }
    }}
