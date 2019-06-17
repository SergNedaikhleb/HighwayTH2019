package lesson3;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import java.text.DecimalFormat;
import java.util.List;

public class CinemaSeatsAmount {
    WebDriver driver;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/home/ilyasemenov/Chromedriver/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void printFilmAttributes() throws InterruptedException {
        driver.get("http://liniakino.com/showtimes/aladdin/");

        driver.findElement(By.xpath("//h1/a[contains(@href, '7531')]/../..//li/a")).click();

        //Pause
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'arcticmodal-close')]")));

        driver.switchTo().frame(0);
        wait = new WebDriverWait(driver, 5);

        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@class,'arcticmodal-close')]")));
            ((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);

            List<WebElement> seats = driver.findElements(By.xpath("//*[contains(@id, 'hseat')]"));
            List<WebElement> occupiedSeats = driver.findElements(By.xpath("//*[contains(@class, 'occupied')]"));

            int totalSeats = seats.size();
            int totalOccupiedSeats = occupiedSeats.size();

            System.out.println("Total seats: " + totalSeats);
            System.out.println("Occupied seats: " + totalOccupiedSeats);
            System.out.println("Total free seats: " + (totalSeats - totalOccupiedSeats));

            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("Occupied seats percent: " + df.format(100.0*(totalOccupiedSeats)/totalSeats) + "%");
            System.out.println("Free seats percent: " + df.format(100.0*(totalSeats - totalOccupiedSeats)/totalSeats) + "%");
        }
        catch (TimeoutException e) {
            System.out.println("Try again in 5 minutes.");
        }
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}