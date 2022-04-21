package F3_cartItem;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class F3_cartTests {

    @Test
    public void cartItems() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "recources/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

       WebElement Phone = driver.findElement(By.xpath(".//a[text()=\"Samsung galaxy s6\"]"));
        Phone.click();
       WebElement AddCart = driver.findElement(By.xpath(".//a[text()=\"Add to cart\"]"));
       AddCart.click();
       WebDriverWait wait = new WebDriverWait(driver, 20);
       wait.until(ExpectedConditions.alertIsPresent());
       driver.switchTo().alert().accept();
       Thread.sleep(5000);

        WebElement cartLink = driver.findElement(By.id("cartur"));
        cartLink.click();
       WebElement deleteItem =driver.findElement(By.xpath("//a[contains(text(),'Delete')]"));
       deleteItem.click();
        Thread.sleep(5000);
    }
}
