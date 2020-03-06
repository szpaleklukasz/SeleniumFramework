package selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class TestCommons {

    public TestCommons(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    protected void sendKeysToElement(WebElement element, String text) {
        element.sendKeys(text);
    }

    protected void clickElement(WebElement element) {
        element.click();
    }

    protected String getElementAttribute(WebElement element, String attributeName) {
        return element.getAttribute(attributeName);
    }
}
