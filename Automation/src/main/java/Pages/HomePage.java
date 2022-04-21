package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


    private WebDriver driver;
    private By SignUpLink = By.id("signin2");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public SignUpPage ClickSignUp(){
        driver.findElement(SignUpLink).click();
        return new SignUpPage(driver);
    }

    public LoginPage clickLoginIN(){
        driver.findElement(By.id("login2")).click();
        return new LoginPage(driver);

    }
    public ContactPage clickContact(){
        clickLink("Contact");
        return new ContactPage(driver);
    }
//    public AddItem clickCATEGORIES(){
//        clickLink("CATEGORIES");
//        return new AddItem(driver);
//    }

    private void clickLink (String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}