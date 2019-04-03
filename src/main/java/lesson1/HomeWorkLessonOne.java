package lesson1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomeWorkLessonOne {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // first of all, create negative test case
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("neeshloshad@gmail.com");
        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys("***********"); //sorry, but I can't write you my password
        WebElement loginButton = driver.findElement(By.id("u_0_3"));
        loginButton.submit();

        WebElement waitFor = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("u_0_c")));

        WebElement messages = driver.findElement(By.id("js_55"));
        messages.click();

        WebElement waitForMenu = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("messagesContent")));

        System.out.println("My last Message is: " + driver.findElement(By.className("messagesContent")).getText());

        driver.quit();
    }
}