package F1_SignUp;

import Base.baseTests;
import Pages.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class F1_SignUpTests extends baseTests {
    @Test(priority = 1)
    public void TestEmptySignUpAlert() throws InterruptedException {
        SignUpPage signuppage = homePage.ClickSignUp();
        signuppage.ClickSignUpButton();
        Assert.assertTrue(signuppage.SignUpAlert().
                contains("Please fill out Username and Password.") , "Sign Up went through with empty fields");
        signuppage.AcceptSuccessfulSignUp();
        Thread.sleep(5000);
    }
    @Test(priority = 2)
    public void TestUsernameOnlySignUpAlert() throws InterruptedException {
        SignUpPage signuppage = homePage.ClickSignUp();
        signuppage.EnterUsername("ldkfjmsdfg");
        signuppage.ClickSignUpButton();
        Assert.assertTrue(signuppage.SignUpAlert().
                contains("Please fill out Username and Password.") , "Sign Up went through with empty fields");
        signuppage.AcceptSuccessfulSignUp();
        Thread.sleep(5000);
    }
    @Test (priority = 3)
    public void TestPasswordOnlySignUpAlert() throws InterruptedException {
        SignUpPage signuppage = homePage.ClickSignUp();
        signuppage.EnterPassword("84521");
        signuppage.ClickSignUpButton();
        Assert.assertTrue(signuppage.SignUpAlert().
                contains("Please fill out Username and Password.") , "Sign Up went through with empty fields");
        signuppage.AcceptSuccessfulSignUp();
        Thread.sleep(5000);
    }
    @Test(priority = 4)
    public void TestSignUpAlert() throws InterruptedException {
        SignUpPage signuppage = homePage.ClickSignUp();
        signuppage.EnterUsername("fRGEW7698007888897b");
        signuppage.EnterPassword("5600");
        signuppage.ClickSignUpButton();
       Assert.assertTrue(signuppage.SignUpAlert().
                contains("Sign up successful.") , "Sign Up failed, User already exists");
        signuppage.AcceptSuccessfulSignUp();
        Thread.sleep(5000);
    }

}
