package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CinemaSeatsAmount {
    public static void main(String [] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://liniakino.com/showtimes/aladdin/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // scroll to necessary block
        WebElement curseLaJorona = driver.findElement(By.cssSelector("#content-inner > div > ul > li:nth-child(3) > h1"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", curseLaJorona);

        driver.findElement(By.xpath("//h1/a[text()='Прокляття Ла Йорони']")).click();
        driver.findElement(By.xpath("//div[@class='buttons']")).click();
        driver.findElement(By.xpath("//div[@class='day-block showtime-day'][1]/div[@class='showtime-theater'][1]/ul[@class='showtime-time'][1]/li[1]/a[1]")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));

        driver.findElement(By.xpath("//div[@class='widget-window-close arcticmodal-close']")).click();
        List<WebElement> freePlaceList = driver.findElements(By.xpath("//div[@id='hall-scheme-container']//div[@class='seat seat-color1']"));
        List<WebElement> occupiedList = driver.findElements(By.xpath("//div[@class='seat seat-occupied']"));
        driver.quit();
        float notOccupied = (float) freePlaceList.size();
        float occupied = (float) occupiedList.size();
        float total = notOccupied + occupied;
        float freePlacePerc = (notOccupied * 100) / total;
        float occupiedPerc = (occupied * 100) / total;

        System.out.println("Total number of seats: " + total);
        System.out.println("Not occupied seats: " + freePlacePerc + "%");
        System.out.println("Occupied seats: " + occupiedPerc+ "%");
    }
}
