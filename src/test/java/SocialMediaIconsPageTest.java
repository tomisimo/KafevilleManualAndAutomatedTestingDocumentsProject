import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SocialMediaIconsPageTest {
    WebDriver driver;

    @BeforeClass
    void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.kafeville.com/");
        driver.manage().window().maximize();
    }

    @Test
    void ValidateGoogleMapsPinIconFacebookfIconAndInstagramIconDisplayedOnTopRightCorner(){
        SocialMediaIconsPage socialMediaIcons = new SocialMediaIconsPage(driver);
        socialMediaIcons.validateGoogleMapsPinIconTopRightDisplayed();
        socialMediaIcons.validateFacebookfIconTopRightDisplayed();
        socialMediaIcons.validateInstagramIconTopRightDisplayed();
    }
    @Test
    void ValidateGoogleMapsPinIconFacebookfIconAndInstagramIconDisplayedOnBottomRightCorner(){
        SocialMediaIconsPage socialMediaIcons = new SocialMediaIconsPage(driver);
        socialMediaIcons.validateGoogleMapsPinIconBottomRightDisplayed();
        socialMediaIcons.validateFacebookfIconBottomRightDisplayed();
        socialMediaIcons.validateInstagramIconBottomRightDisplayed();
    }
    @Test
    void ValidateTopRightGoogleMapsPinIconOnClickOpenInNewTabTheKafevilleGoogleMapsPage(){
        SocialMediaIconsPage socialMediaIcons = new SocialMediaIconsPage(driver);
        socialMediaIcons.clickGoogleMapsPinIconTopRight();
        socialMediaIcons.accessAndValidateKafevilleGoogleMapsPageDisplayed();
    }
    @Test
    void ValidateTopRightFacebookfIconOnClickOpenInNewTabTheKafevilleFacebookPage(){
        SocialMediaIconsPage socialMediaIcons = new SocialMediaIconsPage(driver);
        socialMediaIcons.clickFacebookfIconTopRight();
        socialMediaIcons.accessAndValidateKafevilleFacebookPageDisplayed();
    }
    @Test
    void ValidateTopRightInstagramIconOnClickOpenInNewTabTheKafevilleInstagramPage(){
        SocialMediaIconsPage socialMediaIcons =new SocialMediaIconsPage(driver);
        socialMediaIcons.clickInstagramIconTopRight();
        socialMediaIcons.accessAndValidateKafevilleInstagramPageDisplayed();
    }
    @Test
    void ValidateBottomRightGoogleMapsPinIconOnClickOpenInNewTabTheKafevilleGoogleMapsPage(){
        SocialMediaIconsPage socialMediaIcons = new SocialMediaIconsPage(driver);
        socialMediaIcons.clickGoogleMapsPinIconBottomRight();
        socialMediaIcons.accessAndValidateKafevilleGoogleMapsPageDisplayed();
    }
    @Test
    void ValidateBottomRightFacebookfIconOnClickOpenInNewTabTheKafevilleFacebookPage(){
        SocialMediaIconsPage socialMediaIcons = new SocialMediaIconsPage(driver);
        socialMediaIcons.clickFacebookfIconBottomRight();
        socialMediaIcons.accessAndValidateKafevilleFacebookPageDisplayed();
    }
    @Test
    void ValidateBottomRightInstagramIconOnClickOpenInNewTabTheKafevilleInstagramPage(){
        SocialMediaIconsPage socialMediaIcons =new SocialMediaIconsPage(driver);
        socialMediaIcons.clickInstagramIconBottomRight();
        socialMediaIcons.accessAndValidateKafevilleInstagramPageDisplayed();
    }
    @AfterClass
    void closeWebPage(){
        driver.quit();
    }
}
