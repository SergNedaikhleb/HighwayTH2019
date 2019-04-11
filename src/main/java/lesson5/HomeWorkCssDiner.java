package lesson5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomeWorkCssDiner {

    public WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
    }

    @Test
            public void myCssDinerTest() {
        // go to the page and set the implicit wait
        driver.get("https://flukeout.github.io/");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDown(){

        driver.quit();
    }
}
