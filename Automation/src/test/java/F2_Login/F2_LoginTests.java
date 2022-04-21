package F2_Login;

import Base.baseTests;
import Pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class F2_LoginTests extends baseTests {
    @Test (priority = 5)
    public  void  testLoginWithEmptyData() throws InterruptedException {
        LoginPage loginPage= homePage.clickLoginIN();
        loginPage.setUserNameField("");
        loginPage.setPasswordField("");
        loginPage.clickLoginButton();
        Assert.assertEquals(loginPage.informAlert(),"Please fill out Username and Password.");
        loginPage.AcceptInformAlert();
        Thread.sleep(5000);
    }
    @Test(priority = 6)
    public  void testLoginWithUnValidUsername() throws InterruptedException {
        LoginPage loginPage= homePage.clickLoginIN();
        loginPage.setUserNameField("asmaaAya");
        loginPage.setPasswordField("1234");
        loginPage.clickLoginButton();
        Assert.assertEquals(loginPage.informAlert(),"User does not exist.");
        loginPage.AcceptInformAlert();
        Thread.sleep(5000);

    }
    @Test(priority = 7)
    public  void  testLoginWithUnValidPassword() throws InterruptedException {
        LoginPage loginPage= homePage.clickLoginIN();
        loginPage.setUserNameField("asmaa123");
        loginPage.setPasswordField("000");
        loginPage.clickLoginButton();
        Assert.assertEquals(loginPage.informAlert(),"Wrong password.");
        loginPage.AcceptInformAlert();
        Thread.sleep(5000);

    }
   @Test (priority = 8)
    public  void  testSuccessfulLogin() throws InterruptedException {
      LoginPage loginPage= homePage.clickLoginIN();
      loginPage.setUserNameField("asmaa123");
      loginPage.setPasswordField("123456");
      loginPage.clickLoginButton();
    Assert.assertEquals(loginPage.SuccessfulLogin(),"Welcome asmaa123","massage not correct");
       Thread.sleep(5000);
    }


}
