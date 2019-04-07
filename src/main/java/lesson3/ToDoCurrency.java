package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToDoCurrency {
    private WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    public void myTest(){

        // go to the page
        driver.get("https://www.privat24.ua");

        // explicit wait for privatbank
        WebDriverWait waitForPrivatbank = (new WebDriverWait(driver, 8));
        waitForPrivatbank.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@class,'header-module')]")));

        // write privatbank currence exchange
        WebElement buyDollarPrivatbank = driver.findElement(By.className("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[2]"));
        System.out.println("Privatbank buy currency: "+buyDollarPrivatbank.getText());

    }


    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
