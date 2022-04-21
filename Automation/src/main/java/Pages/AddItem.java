package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddItem {
    private WebDriver driver;

    public AddItem() {
        this.driver = driver;
    }
    public void clickCATEGORIES(){
        driver.findElement(By.linkText("CATEGORIES")).click();

    }
    public void addTocart(){
        driver.findElement(By.linkText("Samsung galaxy s6")).click();
         driver.findElement(By.linkText("Add to cart")).click();
    }

}
