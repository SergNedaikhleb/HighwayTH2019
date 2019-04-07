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

import java.util.ArrayList;

public class ToDoCurrency {
    private WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    public void myTest(){

        // go to privatbank currency exchange
        driver.get("https://www.privat24.ua");
        // explicit wait for privatbank
        WebDriverWait waitForPrivatbank = (new WebDriverWait(driver, 8));
        waitForPrivatbank.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@class,'header-module')]")));

        // write privatbank currency exchange
        String bankName = driver.getTitle();
        WebElement dollarPrivatbank = driver.findElement(By.xpath("//*[@class='section'][1]"));
        System.out.println("This is: "+bankName);
        System.out.println("Privatbank buy currency: "+dollarPrivatbank.getText());
        System.out.println("-------------------");
        //---------------------------------------------
        // go to ukrsibbank currency exchange
        driver.navigate().to("https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/");
        // explicit wait for ukrsibbbank
        WebDriverWait waitForUkrsibBank = (new WebDriverWait(driver, 8));
        waitForUkrsibBank.until(ExpectedConditions.presenceOfElementLocated(By.className("main__breadcrumbs")));

        // write ukrsibbank currency exchange
        WebElement buyDollarInUkrsib = driver.findElement(By.xpath("//*[@class='banking-link']/b"));
        String ukrSib = buyDollarInUkrsib.getText();
        System.out.println("This is: "+ukrSib);
        WebElement dollarUkrsibbank = driver.findElement(By.xpath("//*[@class='currency__table']/tbody/tr[1]"));
        System.out.println("Ukrsibbank buy currency: "+dollarUkrsibbank.getText());
        System.out.println("-------------------");
        //---------------------------------------------
        // go to universalbank currency exchange
        driver.navigate().to("https://www.universalbank.com.ua/");
        // explicit wait for universalbank
        WebDriverWait waitForUniversalbank = (new WebDriverWait(driver, 8));
        waitForUniversalbank.until(ExpectedConditions.presenceOfElementLocated(By.className("content-wrapper")));

        // write universalbank currency exchange
        String universalbankName = driver.getTitle();
        WebElement dollarUniversalbank = driver.findElement(By.xpath("//*[@class='cell col-xs-12 col-sm-6 col-lg-6 rate-table'][1]//tbody/tr[2]"));
        System.out.println("This is: "+universalbankName);
        System.out.println("Universalbank buy currency: "+dollarUniversalbank.getText());
        System.out.println("-------------------");
        //---------------------------------------------
        // go to oschadbank currency exchange
        driver.navigate().to("https://www.oschadbank.ua");
        // explicit wait for ukrsibbbank
        WebDriverWait waitForOschadbank = (new WebDriverWait(driver, 8));
        waitForOschadbank.until(ExpectedConditions.presenceOfElementLocated(By.className("tabs-container-select")));

        // write oschadbank currency exchange
        String oschadbankName = driver.getTitle();
        WebElement dollarOschadbank = driver.findElement(By.xpath("//*[@class='views-row pane selected']//*[@class='paragraph paragraph--type--exchange-rates paragraph--view-mode--default currency-item'][1]"));
        System.out.println("This is: "+oschadbankName);
        System.out.println("Oschadbank buy currency: "+dollarOschadbank.getText());
        System.out.println("-------------------");
        //---------------------------------------------
        // go to NUB currency exchange
        driver.navigate().to("https://www.bank.gov.ua/control/uk/curmetal/detail/currency?period=daily");
        // explicit wait for NUB
        WebDriverWait waitForNUB = (new WebDriverWait(driver, 8));
        waitForNUB.until(ExpectedConditions.presenceOfElementLocated(By.className("secondColl")));
        // write NUB currency exchange
        WebElement buyDollarInNUB = driver.findElement(By.xpath("//*[@class='secondColl']//*[@class='content']//tbody//tr[9]"));
        WebElement NUBName = driver.findElement(By.xpath("//*[@class='title_info']"));
        String NUB = NUBName.getText();
        System.out.println("This is: "+NUB);
        System.out.println("NUB buy currency: "+buyDollarInNUB.getText());
        System.out.println("-------------------");

        // Calculate values
//        ArrayList<Integer>currencyValue = new ArrayList<>();
//        currencyValue.add((double) buyDollarInNUB.getText());


       // System.out.println(Math.max(double max((double) buyDollarInNUB.getText(), double arg2)));
    }


    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
