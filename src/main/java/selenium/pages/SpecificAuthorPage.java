package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.base.TestCommons;

public abstract class SpecificAuthorPage extends TestCommons {

    public WebElement name;
    public WebElement github;
    public WebElement avatar;

    public SpecificAuthorPage(WebDriver driver) {
        super(driver);
    }

    public void setUp(WebElement name, WebElement github, WebElement avatar) {
        this.name = name;
        this.github = github;
        this.avatar = avatar;
    }

    public void goTo() {
    }

    public String getAuthorName() {
        return name.getText().split(" ")[0];
    }

    public String getGitHubLink() {
        return github.getAttribute("href");
    }

    public String getAvatarURL() {
        return avatar.getAttribute("src");
    }

    public Boolean isImageValid() {
        return isImageValid(avatar);
    }

    public Boolean isGitHubLinkValid(){
        return getGitHubLink().contains("https://github.com/");
    }
}
