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

    @Test
    public void myTest(){
        // go on the page

        driver.get("https://www.imdb.com/title/tt0111161/");
        // name
        WebElement filmName = driver.findElement(By.xpath("//*[@id='title-overview-widget']//div/h1"));
        System.out.println("This film calls: "+filmName.getText());
        // year
        WebElement filmYear = driver.findElement(By.id("titleYear"));
        System.out.println("The year is: "+filmYear.getText());
        // duration
        WebElement filmDuration = driver.findElement(By.cssSelector("div.titleBar > div.title_wrapper > div > span:nth-child(1)"));
        System.out.println("The duration is: "+filmDuration.getText());
        // popularity
        WebElement filmPopularity = driver.findElement(By.xpath("//*[@class='titleReviewBarSubItem']//*[@class='popularityUpOrFlat']"));
        System.out.println("The duration is: "+filmPopularity.getText());
        // genre
        WebElement filmGenre = driver.findElement(By.cssSelector("div.title_wrapper > div > a:nth-child(4)"));
        System.out.println("The genre is: "+filmGenre.getText());
        // trailer
        WebElement filmTrailer = driver.findElement(By.xpath("//*[@id='title-overview-widget']//*[@title='Trailer']"));
        filmTrailer.click();
        System.out.println("The trailer is here: "+driver.getCurrentUrl());
        driver.navigate().back();
        // poster
        WebElement filmPoster = driver.findElement(By.xpath("//*[@id='title-overview-widget']//*[@class='poster']"));
        filmPoster.click();
        System.out.println("The poster is here: "+driver.getCurrentUrl());
        driver.navigate().back();
        // director
        WebElement filmDirector = driver.findElement(By.xpath("//*[@id='title-overview-widget']//*[@class='credit_summary_item'][1]"));
        System.out.println(filmDirector.getText());
        // Cast
        WebElement filmCast = driver.findElement(By.xpath("//*[@id='titleCast']/table//tr[position()<7]"));
        System.out.println(filmCast.getText());
        // metascope rating
        WebElement filmRating =driver.findElement(By.xpath("//*[@id='title-overview-widget']//*[@class='metacriticScore score_favorable titleReviewBarSubItem']/span"));
        System.out.println("The Metascope rating is: "+filmRating.getText());
        // reviews
        WebElement userReviews =driver.findElement(By.xpath("//*[@class='titleReviewBarItem titleReviewbarItemBorder']//*[@class='subText']/a[1]"));
        WebElement criticReviews =driver.findElement(By.xpath("//*[@class='titleReviewBarItem titleReviewbarItemBorder']//*[@class='subText']/a[2]"));
        System.out.println("User Reviews amount: "+userReviews.getText());
        System.out.println("Critic Reviews amount: "+criticReviews.getText());
        // similar films
        WebElement similarFilms =driver.findElement(By.xpath("//*[@id='title_recs']/div[2]/div[12]//a/b"));
        WebElement nextSimilarFilmButton =driver.findElement((By.cssSelector(" div.rec_overviews > didiv.rec_actions > div.rec_next_btn > span > a")));
        System.out.println("First similar film "+similarFilms.getText());
        nextSimilarFilmButton.click();
        System.out.println("Second similar film "+similarFilms.getText());
        nextSimilarFilmButton.click();
        System.out.println("Third similar film "+similarFilms.getText());
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
