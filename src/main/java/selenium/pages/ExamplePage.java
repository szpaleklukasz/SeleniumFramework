package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import selenium.base.TestCommons;

public class ExamplePage extends TestCommons {

	@FindBy(tagName = "h1")
	public WebElement header;

	public ExamplePage(WebDriver driver) {
		super(driver);
	}
	
	public void goTo() {
		goTo("/");
	}

	public String getHeaderText() {
		return getElementAttribute(header, "innerHTML");
	}
}
