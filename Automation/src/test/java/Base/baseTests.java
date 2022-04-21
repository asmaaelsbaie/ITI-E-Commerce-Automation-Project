package Base;

import Pages.HomePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class baseTests {
    private EventFiringWebDriver driver;
    protected HomePage homePage;
   @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",
                "recources/chromedriver.exe");
        driver=new EventFiringWebDriver(new ChromeDriver(getChromeOption()));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        goHome();
         homePage=new HomePage(driver);



    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://www.demoblaze.com/");
   }
    @AfterClass
    public  void tearDown(){
     driver.quit();
    }


   public ChromeOptions getChromeOption() {
       ChromeOptions options = new ChromeOptions();
      options.addArguments("disable-infobars");

return options;
   }

}
