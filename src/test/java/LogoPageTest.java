import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LogoPageTest {
    WebDriver driver;

    @BeforeClass
    void setup(){
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.kafeville.com/");
        driver.manage().window().maximize();
    }

    @Test
    void KAFEvilleTopLogoOnClickRedirectToHomepage (){
        LogoPage  topLogo = new LogoPage(driver);
        topLogo.clickAboutUsHorizontalNavBarItem();
        topLogo.validateAboutUsPageDisplayed();
        topLogo.clickKafevilleTopLogo();
        topLogo.validateHomePageDisplayed();
        driver.quit();
    }

    @AfterClass
    void closeWebPage(){
    }
}


