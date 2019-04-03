package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;

public class ImdbExample {

    public WebDriver driver;

    public void setUp(){
         driver = new FirefoxDriver();
    }

    @Test
    public void myTest(){
        driver.get("https://imdb.com/chart/top");
        // titles
        List<WebElement> allTitles = driver.findElements(By.xpath("title"));
        for(WebElement) element : titles){
            System.out.println(element.getAttribute("href"));

    }


    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
