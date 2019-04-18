package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import static java.lang.Double.sum;

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
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        // name
        WebElement filmName = driver.findElement(By.xpath("//*[@id='title-overview-widget']//div/h1"));
        System.out.println("This film calls: "+filmName.getText());

        // year
        WebElement filmYear = driver.findElement(By.id("titleYear"));
        System.out.println("The year is: "+filmYear.getText());

        // duration
        WebElement filmDuration = driver.findElement(By.xpath("//*[@class='subtext']//*[@datetime='PT142M']"));
        System.out.println("The duration is: "+filmDuration.getText());

        // popularity
        WebElement filmPopularity = driver.findElement(By.xpath("//*[@class='ratingValue']"));
        System.out.println("The duration is: "+filmPopularity.getText());

        // genre
        WebElement filmGenre = driver.findElement(By.cssSelector("div.title_wrapper > div > a:nth-child(4)"));
        System.out.println("The genre is: "+filmGenre.getText());

        // trailer
        WebElement filmTrailer = driver.findElement(By.xpath("//*[@id='title-overview-widget']/div[1]/div[3]/div[2]/a"));
       // filmTrailer.click();
       // (new WebDriverWait(driver, 8)).until(ExpectedConditions.visibilityOfElementLocated(By.className("scrollable-area")));
        System.out.println("The trailer is here: "+filmTrailer.getAttribute("href"));
      //  driver.navigate().back();
       // (new WebDriverWait(driver, 8)).until(ExpectedConditions.textToBe(By.id("titleYear"), "(1994)"));

        // poster
        WebElement filmPoster = driver.findElement(By.className("poster"));
      //  filmPoster.click();
        System.out.println("The poster is here: "+filmPoster.getAttribute("href"));
      //  driver.navigate().back();

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

        // calculate total review
        String criticReviewPre = criticReviews.getText();
        String criticReview = criticReviewPre.substring(0,4);
        String userReviewPre = userReviews.getText();
        String userReview = userReviewPre.substring(0,6);
        String userRevievPoint = userReview.replace(",","");

        double critic = Double.parseDouble(criticReview);
        double user = Double.parseDouble(userRevievPoint);
        System.out.println("Total reviews: "+(critic+user));

        // three similar cinemas
        WebElement firstSimilarFilm =driver.findElement(By.xpath("//*[@class='rec_item'][1]/a/img"));
        WebElement secondSimilarFilm =driver.findElement(By.xpath("//*[@class='rec_item'][2]/a/img"));
        WebElement thirdSimilarFilm =driver.findElement(By.xpath("//*[@class='rec_item'][3]/a/img"));
        System.out.println("First similar film is: "+firstSimilarFilm.getAttribute("title"));
        System.out.println("Second similar film is: "+secondSimilarFilm.getAttribute("title"));
        System.out.println("Third similar film is: "+thirdSimilarFilm.getAttribute("title"));

    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
