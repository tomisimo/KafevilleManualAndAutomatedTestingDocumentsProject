import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class LanguagesDropdownHandlePageTest {
    WebDriver driver;

    @BeforeClass
    void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.kafeville.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
    }
    @Test
    void OnClickLanguageDropdownOptionENtheWebsiteNavigationLanguageChangeToEnglishLanguage(){
        LanguagesDropdownHandlePage languagesDropdownHandle = new LanguagesDropdownHandlePage(driver);
        languagesDropdownHandle.firstClickOnLanguageDropdownFieldEN();
        languagesDropdownHandle.firstClickOnLanguageDropdownFieldVI();
        languagesDropdownHandle.validateVietnameseHomeItemDisplayed();
        languagesDropdownHandle.validateVietnameseAboutusItemDisplayed();
        languagesDropdownHandle.validateVietnameseOurBrothersItemDisplayed();
        languagesDropdownHandle.secondClickOnLanguageDropdownFieldVI();
        languagesDropdownHandle.secondClickOnLanguageDropdownFieldEN();
        languagesDropdownHandle.validateEnglishHomeItemDisplayed();
        languagesDropdownHandle.validateEnglishAboutusItemDisplayed();
        languagesDropdownHandle.validateEnglishOurBrothersItemDisplayed();
    }
    @Test
    void OnClickLanguageDropdownOptionVItheWebsiteNavigationLanguageChangeToVietnameseLanguage(){
        LanguagesDropdownHandlePage languagesDropdownHandle = new LanguagesDropdownHandlePage(driver);
        languagesDropdownHandle.validateEnglishHomeItemDisplayed();
        languagesDropdownHandle.validateEnglishAboutusItemDisplayed();
        languagesDropdownHandle.validateEnglishOurBrothersItemDisplayed();
        languagesDropdownHandle.firstClickOnLanguageDropdownFieldEN();
        languagesDropdownHandle.firstClickOnLanguageDropdownFieldVI();
        languagesDropdownHandle.validateVietnameseHomeItemDisplayed();
        languagesDropdownHandle.validateVietnameseAboutusItemDisplayed();
        languagesDropdownHandle.validateVietnameseOurBrothersItemDisplayed();
        languagesDropdownHandle.secondClickOnLanguageDropdownFieldVI();
        languagesDropdownHandle.secondClickOnLanguageDropdownFieldEN();
    }

}
