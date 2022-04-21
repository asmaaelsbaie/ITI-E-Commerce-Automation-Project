package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage {
    private WebDriver driver;
    private By contactEmail =By.id("recipient-email");
    private By contactName =By.id("recipient-name");
    private By contactMassage =By.id("message-text");
    private By sendButton =By.xpath(".//button[text() ='Send message']");

    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setContactEmail(String Email){
        driver.findElement(contactEmail).sendKeys(Email);
    }
    public void setContactName(String userName){
        driver.findElement(contactName).sendKeys(userName);
    }
    public void setMassage(String massage){
        driver.findElement(contactMassage).sendKeys(massage);
    }
    public void clickSendButton(){
        driver.findElement(sendButton).click();
        WebDriverWait wait = new WebDriverWait(driver , 20);
    }
    public String informAlert(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.alertIsPresent());
        return driver.switchTo().alert().getText();
    }

    public void AcceptInformAlert(){
        driver.switchTo().alert().accept();}
}
