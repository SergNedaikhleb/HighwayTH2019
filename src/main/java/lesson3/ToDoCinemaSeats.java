package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ToDoCinemaSeats {

    private WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    public void myTest(){

        // go to the page
        driver.get("http://liniakino.com/showtimes/aladdin/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // explicit wait for certain element
        WebDriverWait waitFor = (new WebDriverWait(driver, 5));
        waitFor.until(ExpectedConditions.presenceOfElementLocated(By.id("menu-top")));

        // scroll to necessary block
        WebElement curseLaJorona = driver.findElement(By.cssSelector("#content-inner > div > ul > li:nth-child(3) > h1"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", curseLaJorona);

        // click on necessary session
        driver.findElement(By.xpath("//*[@id='content-inner']/div/ul/li[3]/div[2]/div[2]/div/ul/li[1]/a")).click();

       //  wait for seats visible
     //   WebDriverWait waitForSeats = (new WebDriverWait(driver, 15));
       // waitForSeats.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='hall-scheme-legend']")));

        // define popup
//        WebElement closePopup = driver.findElement(By.xpath("//*[@class='window-close arcticmodal-close']"));
//
//        // if we have popup
//        if (closePopup.isDisplayed()) {
//            closePopup.click();
//        }else{
//            driver.findElement(By.className("showtime-title")).getText();
//        }

        // let's count an all places
        List<WebElement> allPlaces = driver.findElements(By.xpath("//*[contains(@id,'seat')]"));
        int allPlacesCount = allPlaces.size();
        System.out.println("The total number of all places is: "+ allPlacesCount);

        // let's count an occupied places
        List<WebElement> occupiedPlaces = driver.findElements(By.xpath("//*[@title='Місце зайняте']"));
        int occupiedPlacesCount = occupiedPlaces.size();
        System.out.println("The number of occupied places is: "+ occupiedPlacesCount);

        // let's count a free places
       int freePlaces = driver.findElements(By.xpath("//*[@class='seat seat-color1']")).size();
     //   int freePlacesCount = freePlaces.size();
        System.out.println("The number of free places is: "+ freePlaces);

        // let's count a percent of occupied places
        float occupiedPlacesPercentage = (float)((occupiedPlacesCount*100)/allPlacesCount);
        System.out.println("The number of occupied places is: "+ occupiedPlacesPercentage+ "%");

        // let's count a percent of free places
       // float freePlacesPercentage = (float)((freePlacesCount*100)/allPlacesCount);
      //  System.out.println("The number of free places is: "+ freePlacesPercentage+ "%");
    }

    @AfterTest
    public void tearDown(){
     //   driver.quit();
    }
}
