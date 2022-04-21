package Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.sound.midi.Soundbank;

public class LoginPage {
    private WebDriver driver;
    private By userNameField = By.id("loginusername");
    private By passwordField = By.id("loginpassword");
    private By loginButton = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
    private By nameuserAfterLogin = By.linkText("Welcome asmaa123");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserNameField(String userName) {
        driver.findElement(userNameField).sendKeys(userName);

    }

    public void setPasswordField(String password) {

        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton( ) {
        driver.findElement(loginButton).click();
        WebDriverWait wait = new WebDriverWait(driver , 20);

    }
    public String SuccessfulLogin(){
        return driver.findElement(nameuserAfterLogin).getText();
    }

    public String informAlert(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.alertIsPresent());
        return driver.switchTo().alert().getText();
    }

    public void AcceptInformAlert(){
        driver.switchTo().alert().accept();}
}
