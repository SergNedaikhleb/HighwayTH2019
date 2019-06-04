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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ToDoCurrenceGetPageSource {

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
        String sourcePr = driver.getPageSource();
        String regPr = "\b[0-9]{2}[.][0-9]{3}\b";
        Pattern pr = Pattern.compile("\b[0-9]{2}[.][0-9]{3}\b");
      //  Matcher mpr = pr.matcher(sourcePr);




        String sourcePrivat = driver.getPageSource();
        String bankName = driver.getTitle();
        WebElement dollarPrivatbank = driver.findElement(By.xpath("//*[@class='section'][1]"));
        System.out.println("This is: "+bankName);
        System.out.println("Privatbank buy currency: "+dollarPrivatbank.getText());
        System.out.println("-------------------");
        System.out.println(pr);

//
//        String privMin = dollarPrivatbank.getText();
//        String privMax = dollarPrivatbank.getText();
//        String PrivMinTwo = privMin.substring(4,8);
//        String PrivMaxTwo = privMax.substring(12,18);
//
//        // Extract MIN and MAX from privatbank
//        Double dolPrivatMin = Double.parseDouble(PrivMinTwo);
//        Double dolPrivatMax = Double.parseDouble(PrivMaxTwo);
//        System.out.println("privatbank min currency: "+dolPrivatMin+"\n"+"privatbank max currency: "+dolPrivatMax);
//        System.out.println("-------------------");
//        //---------------------------------------------

//
//        // go to ukrsibbank currency exchange
//        driver.navigate().to("https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/");
//        // explicit wait for ukrsibbbank
//        WebDriverWait waitForUkrsibBank = (new WebDriverWait(driver, 8));
//        waitForUkrsibBank.until(ExpectedConditions.presenceOfElementLocated(By.className("main__breadcrumbs")));
//
//        // write ukrsibbank currency exchange
//        WebElement buyDollarInUkrsib = driver.findElement(By.xpath("//*[@class='banking-link']/b"));
//        String ukrSib = buyDollarInUkrsib.getText();
//        System.out.println("This is: "+ukrSib);
//        WebElement dollarUkrsibbank = driver.findElement(By.xpath("//*[@class='currency__table']/tbody/tr[1]"));
//        System.out.println("Ukrsibbank buy currency: "+dollarUkrsibbank.getText());
//
//        String ukrsibMin = driver.findElement(By.xpath("//*[@class='currency__table']/tbody/tr[1]/td[2]")).getText();
//        String ukrsibMax = driver.findElement(By.xpath("//*[@class='currency__table']/tbody/tr[1]/td[3]")).getText();
//        //    String fromAccount = Account.substring(1,Account.indexOf(' '));
//
//        // Extract MIN and MAX from UkrSibBank
//        Double uSibBankMin = Double.parseDouble(ukrsibMin);
//        Double uSibBankMax = Double.parseDouble(ukrsibMax);
//        System.out.println("UkrsibBank min currency: "+uSibBankMin+"\n"+"UkrsibBank max currency: "+uSibBankMax);
//        System.out.println("-------------------");
//        //---------------------------------------------
//
//
//        // go to universalbank currency exchange
//        driver.navigate().to("https://www.universalbank.com.ua/");
//        // explicit wait for universalbank
//        WebDriverWait waitForUniversalbank = (new WebDriverWait(driver, 8));
//        waitForUniversalbank.until(ExpectedConditions.presenceOfElementLocated(By.className("content-wrapper")));
//
//        // write universalbank currency exchange
//        String universalBankName = driver.getTitle();
//        WebElement dollarUniversalbank = driver.findElement(By.xpath("//*[@class='cell col-xs-12 col-sm-6 col-lg-6 rate-table'][1]//tbody/tr[2]"));
//        System.out.println("This is: "+universalBankName);
//        System.out.println("Universalbank buy currency: "+dollarUniversalbank.getText());
//
//
//        String univerMin = driver.findElement(By.xpath("//*[@class='cell col-xs-12 col-sm-6 col-lg-6 rate-table'][1]//tbody/tr[2]/td[2]")).getText();
//        String univerMax = driver.findElement(By.xpath("//*[@class='cell col-xs-12 col-sm-6 col-lg-6 rate-table'][1]//tbody/tr[2]/td[3]")).getText();
//
//        // Extract MIN and MAX from UniversalBank
//        String zz = univerMin.replaceAll("[^-?0-9]+", ".");
//        String yz = univerMax.replaceAll("[^-?0-9]+", ".");
//        Double unMin = Double.parseDouble(zz);
//        Double unMax = Double.parseDouble(yz);
//        System.out.println("Universalbank min currency: "+unMin+"\n"+"Universalbank max currency: "+unMax);
//        System.out.println("-------------------");
//        //---------------------------------------------
//
//
//        // go to oschadbank currency exchange
//        driver.navigate().to("https://www.oschadbank.ua");
//        // explicit wait for ukrsibbbank
//        WebDriverWait waitForOschadbank = (new WebDriverWait(driver, 8));
//        waitForOschadbank.until(ExpectedConditions.presenceOfElementLocated(By.className("tabs-container-select")));
//
//        // write oschadbank currency exchange
//        String oschadbankName = driver.getTitle();
//        WebElement dollarOschadbank = driver.findElement(By.xpath("//*[@class='views-row pane selected']//*[@class='paragraph paragraph--type--exchange-rates paragraph--view-mode--default currency-item'][1]"));
//        System.out.println("This is: "+oschadbankName);
//        System.out.println("Oschadbank buy currency: "+dollarOschadbank.getText()+"\n");
//
//        String osMin = driver.findElement(By.xpath("//*[@class='views-row pane selected']//*[@class='paragraph paragraph--type--exchange-rates paragraph--view-mode--default currency-item'][1]/strong[1]")).getText();
//        String osMax = driver.findElement(By.xpath("//*[@class='views-row pane selected']//*[@class='paragraph paragraph--type--exchange-rates paragraph--view-mode--default currency-item'][1]/strong[2]")).getText();
//
//        // Extract MIN and MAX from Oschadbank
//        Double oshadMin = Double.parseDouble(osMin);
//        Double oshadMax = Double.parseDouble(osMax);
//        System.out.println("Oschadbank min currency: "+oshadMin+"\n"+"Oschadbank max currency: "+oshadMax);
//        System.out.println("-------------------");
//        //---------------------------------------------
//
//
//
//        // go to NUB currency exchange
//        driver.navigate().to("https://www.bank.gov.ua/control/uk/curmetal/detail/currency?period=daily");
//        // explicit wait for NUB
//        WebDriverWait waitForNUB = (new WebDriverWait(driver, 8));
//        waitForNUB.until(ExpectedConditions.presenceOfElementLocated(By.className("secondColl")));
//        // write NUB currency exchange
//        WebElement dollarInNUB = driver.findElement(By.xpath("//*[@class='secondColl']//*[@class='content']//table[4]/tbody/tr[2]/td[5]"));
//        WebElement NUBName = driver.findElement(By.xpath("//*[@class='title_info']"));
//        String NUB = NUBName.getText();
//        System.out.println("This is: "+NUB);
//        System.out.println("NUB buy currency: "+dollarInNUB.getText());
//        System.out.println("-------------------");
//        String NUBTotal =dollarInNUB.getText();
//        Double TotalNUB = Double.parseDouble(NUBTotal);
//        Double TotalNUBPerDollar = TotalNUB/100;
//
//        // Print avarage currency between all the banks
//        System.out.println("The total average BUY currency is: "+(dolPrivatMin+uSibBankMin+unMin+oshadMin+TotalNUBPerDollar)/5);
//        System.out.println("The total average SELL currency is: "+(dolPrivatMax+uSibBankMax+unMax+oshadMax+TotalNUBPerDollar)/5);
//
//        // print the most MINIMAL BUY value between all the banks
//        double mi = Math.min(Math.min(dolPrivatMin,uSibBankMin), Math.min(unMin,oshadMin));
//        System.out.println("the most MINIMAL BUY value between all the banks is: "+Math.min(mi,TotalNUBPerDollar));
//
//        // print the most MAXIMAL SELL value between all the banks
//        double ma = Math.max(Math.max(dolPrivatMax,uSibBankMax), Math.max(unMax,oshadMax));
//        System.out.println("the most MAXIMAL SELL value between all the banks is: "+Math.max(mi,TotalNUBPerDollar));
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}


