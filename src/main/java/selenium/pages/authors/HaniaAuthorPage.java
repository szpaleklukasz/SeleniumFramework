package selenium.pages.authors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.pages.SpecificAuthorPage;

public class HaniaAuthorPage extends SpecificAuthorPage {

    @FindBy(css = "")
    public WebElement name;

    @FindBy(css = "")
    public WebElement github;

    @FindBy(css = "")
    public WebElement avatar;

    public HaniaAuthorPage(WebDriver driver) {
        super(driver);
        setUp(name, github, avatar);
    }

    public void goTo() {
        goTo("/authors/2");
    }
}
