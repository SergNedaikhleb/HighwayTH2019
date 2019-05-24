package trello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JustForFun {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //driver.manage().window().setPosition(new Point(1920,0));
        //driver.manage().window().setSize(new Dimension(1920/2,1080));
        driver.get("http://unsplash.com/");
        driver.findElement(By.className("_3q0cO _3FYu1")).click();
        for(int i=0;i<30;i++)
        {
            driver.findElement(By.tagName("body")).sendKeys("123");

        }
        //driver.getPageSource();
        Pattern p = Pattern.compile("/?photo=(.*?)");
        Matcher m = p.matcher(driver.getPageSource());
        while(m.find())
        {

            driver.get("https://unsplash.com"+m.group());
            System.out.println(m.group());
        }

        driver.quit();
    }

}
