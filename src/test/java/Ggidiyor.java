import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Ggidiyor extends testPage{
   //https://www.vogella.com/tutorials/Logging/article.html
    static Logger log = Logger.getLogger(Ggidiyor.class.getName());

    public By giris=By.xpath("//div[@class=\"gekhq4-4 egoSnI\"]");
    public By girisYap=By.xpath("//span[text()=\"Giriş Yap\"]");
    private By Email=By.id("L-UserNameField");
    private By sifre=By.id("L-PasswordField");
    public By enter=By.id("gg-login-enter");
    public By ara=By.xpath("//input[@placeholder=\"Keşfetmeye Bak\"]");
    public By bul=By.xpath("//span[text()=\"BUL\"]");


    @Test
    public void TestSearch() throws InterruptedException {
        element(giris).click();
        element(girisYap).click();
        element(Email).sendKeys("denemeeednm528@gmail.com");
        element(sifre).sendKeys("123456.a");
        element(enter).click();
        element(ara).sendKeys("bilgisayar");
        element(bul).click();
        selectRandomProduct();
        WebElement basket = driver.findElement(By.xpath("//button[@id='add-to-basket']"));
        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", basket);

        /*
        WebElement adet=driver.findElement(By.xpath("//select[class='amount']"));
        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", adet);
        driver.findElement(By.cssSelector("select[class='amount']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.cssSelector("select[class='amount']")).sendKeys(Keys.ENTER);
        */


    }



    public void selectRandomProduct(){

        int ProducSize= driver.findElements(By.xpath("//*[@class=\"image-container product-hslider-container\"]")).size();
        Random rand = new Random();
        int RandSelect= rand.nextInt(ProducSize);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement deneme= driver.findElement(By.xpath("(//*[@class=\"image-container product-hslider-container\"])[" + RandSelect + "]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", deneme);


    }

    public static void main(String[] args) {


    }

}