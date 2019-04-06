package lesson3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationExample {

    public WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    public void myTest(){

        driver.get("https://google.com");
        System.out.println("We are on: "+ driver.getCurrentUrl());
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
