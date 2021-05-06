import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class testPage {
    protected static WebDriver driver;
    public WebElement element(By Locator){
        return driver.findElement(Locator);
    }
    @BeforeClass
    public static void before() {

        System.setProperty("webdriver.chrome.driver", "D:/selenium/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.gittigidiyor.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @AfterClass
    public static void quit() {
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        driver.quit();
    }
}
