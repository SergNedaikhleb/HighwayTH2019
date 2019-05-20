package lesson8;

import org.testng.annotations.Test;
import static org.junit.Assert.*;

public class FirstSoftAssert {

    @Test

    public void exampleSoftAssertTest() {
        FirstSoftAssert softAssert = new FirstSoftAssert();
        softAssert.assertEquals("Hello", "Hello", "First soft assert failed");
        System.out.println("First out");
        softAssert.assertTrue("Hello".equals("hello"), "Second soft assert failed");
        softAssert.assertTrue("Welcome".equals("welcomeeee"), "Third soft assert failed");
        System.out.println("*** test has finished***");
        softAssert.assertAll();
    }

}
