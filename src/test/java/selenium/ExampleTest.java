package selenium;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.ExamplePage;

public class ExampleTest extends TestBase {

    @BeforeTest
    public void before(){
        System.out.println("Test is about to start");
    }

    @AfterTest
    public void after(){
        System.out.println("Test has been completed");
    }

    @Test
    public void testMethod(){
        ExamplePage examplePage = new ExamplePage(driver);
        Assert.assertEquals(examplePage.getHeaderText(), "Example Domain");
    }
}
