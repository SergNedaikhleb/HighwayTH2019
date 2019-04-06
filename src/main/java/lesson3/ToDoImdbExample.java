package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToDoImdbExample {

    private WebDriver driver;

    @BeforeTest
    public void setUp(){
         driver = new ChromeDriver();
    }

//    public static void main(String[] args) {
//
//        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
//
//        WebDriver driver = new ChromeDriver();

    @Test
    public void myTest(){
        driver.get("https://www.imdb.com/title/tt0111161/");
        WebElement filmName = driver.findElement(By.xpath("//*[@id='title-overview-widget']//div/h1"));
        System.out.println("This film calls: "+filmName.getText());
        WebElement filmYear = driver.findElement(By.id("titleYear"));
        System.out.println("The year is: "+filmYear.getText());
        WebElement filmDuration = driver.findElement(By.cssSelector("div.titleBar > div.title_wrapper > div > span:nth-child(1)"));
        System.out.println("The duration is: "+filmDuration.getText());
        WebElement filmPopularity = driver.findElement(By.xpath("//*[@class='titleReviewBarSubItem']//*[@class='popularityUpOrFlat']"));
        System.out.println("The duration is: "+filmPopularity.getText());
        WebElement filmGenre = driver.findElement(By.cssSelector("div.title_wrapper > div > a:nth-child(4)"));
        System.out.println("The genre is: "+filmGenre.getText());
        driver.close();
        WebElement filmTrailer = driver.findElement(By.xpath("//*[@id='title-overview-widget']//*[@title='Trailer']"));
        filmTrailer.click();
        System.out.println("The trailer is here: "+driver.getCurrentUrl());
        driver.navigate().back();


    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
