package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SignUpPage {
    private WebDriver driver;
    private By UsernameField = By.id("sign-username");
    private By PasswordField = By.id("sign-password");
    private By SignpButton = By.xpath("//button[@onclick='register()']");

    public SignUpPage(WebDriver driver){this.driver = driver;}

    public void EnterUsername(String username){driver.findElement(UsernameField).sendKeys(username);}
    public void EnterPassword(String password){driver.findElement(PasswordField).sendKeys(password);}
    public void ClickSignUpButton(){
        driver.findElement(SignpButton).click();
        WebDriverWait wait = new WebDriverWait(driver , 10);
        wait.until(ExpectedConditions.alertIsPresent());
    }
    public String SignUpAlert(){return driver.switchTo().alert().getText();}

    public void AcceptSuccessfulSignUp(){driver.switchTo().alert().accept();}
}
