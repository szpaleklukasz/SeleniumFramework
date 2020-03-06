package selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    private final String url = "https://example.com";

    @BeforeSuite
    public void setChromedriverPath() {
        ClassLoader classLoader = getClass().getClassLoader();
        String driverPath = classLoader.getResource("chromedriver.exe").getPath().toString();

        System.setProperty("webdriver.chrome.driver", driverPath);
    }

    @BeforeTest
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(url);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
