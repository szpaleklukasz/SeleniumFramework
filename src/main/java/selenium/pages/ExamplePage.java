package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import selenium.base.TestCommons;

public class ExamplePage extends TestCommons {

    @FindBy(tagName = "h1")
    public WebElement header;

    public ExamplePage(WebDriver driver) {
        super(driver);
    }

    @Test
    public String getHeaderText(){
        return getElementAttribute(header, "innerHTML");
    }
}
