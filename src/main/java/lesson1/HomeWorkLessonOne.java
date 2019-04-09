package lesson1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class HomeWorkLessonOne {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("neeshloshad@gmail.com");
        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys("********"); //sorry, but I can't write you my password
        WebElement loginButton = driver.findElement(By.id("u_0_3"));
        loginButton.submit();

        WebElement waitFor = (new WebDriverWait(driver, 8))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("u_0_c")));

        WebElement messages = driver.findElement(By.xpath("//*[@id='u_0_d']/a/div"));
        messages.click();

        WebElement waitForMenu = (new WebDriverWait(driver, 5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("messagesContent")));

        System.out.println("My last Message is: " + driver.findElement(By.className("messagesContent")).getText());

        driver.quit();
    }
}