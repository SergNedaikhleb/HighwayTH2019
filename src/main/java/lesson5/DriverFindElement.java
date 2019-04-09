package lesson5;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DriverFindElement extends BrowserFactory {

    @Test
    public void tryFindElement(){
        driver.get("https://www.imdb.com/char/top");
        driver.findElement((By.xpath("//noSuchElement")));

//
//        @Test
//        public void tryFindElement(){
//            driver.get("https://www.imdb.com/char/top");
//      //  int size = elements.size();
    //    System.out.println("FOUND ELEMENTS: "+size);

        // driver.manage().timeouts().pageLoadTimeout -- works only with driver.get
        // if page would load earlier - OK
        // inplicitlyWait() - wait for element, not page
        // FOR SYNCHRONOUS JS: driver.manage().timeouts().setScriptTimeout


    }
}
