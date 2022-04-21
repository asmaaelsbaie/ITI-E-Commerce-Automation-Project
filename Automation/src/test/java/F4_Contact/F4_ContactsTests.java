package F4_Contact;

import Base.baseTests;
import Pages.ContactPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class F4_ContactsTests extends baseTests {
    @Test
    public void testSuccessfulContact() throws InterruptedException {
        ContactPage contactPage=homePage.clickContact();
        contactPage.setContactEmail("asmaa00elsbaie@gmail.com");
        contactPage.setContactName("Asmaa");
        contactPage.setMassage("Hi ,I have a problem with order code 1254");
        contactPage.clickSendButton();
        Assert.assertEquals(contactPage.informAlert(),"Thanks for the message!!");
        contactPage.AcceptInformAlert();
        Thread.sleep(5000);

    }
}
