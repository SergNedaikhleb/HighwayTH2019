package lesson3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToDoCinemaSeats {

    private WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    public void myTest(){

        // go on the page
        driver.get("http://liniakino.com/showtimes/aladdin/");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
