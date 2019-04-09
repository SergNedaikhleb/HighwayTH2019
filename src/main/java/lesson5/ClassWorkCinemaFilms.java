package lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.xml.bind.Element;
import java.util.List;

public class ClassWorkCinemaFilms {

    private WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    public void myTest(){

        // go to the page
        driver.get("http://liniakino.com/showtimes/aladdin/");
        // explicit wait for certain element
        new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(By.id("menu-top")));

        List<WebElement> allCinemas = driver.findElements(By.xpath("//*[@class='showtime-movie']//h1/a")); // By.cssSelector("li.showtime-movie >h1> a")

  //      System.out.println("Here all cinemas: "+allCinemas.getText());

    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
