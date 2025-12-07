import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HorizontalNavBarItemsTest {
    WebDriver driver;

    @BeforeClass
    void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.kafeville.com/");
        driver.manage().window().maximize();
    }

    @Test
    void OnClickHomeNavBarItemNavigateToHomepage(){
        HorizontalNavBarItems homeNavBarItem = new HorizontalNavBarItems(driver);
        homeNavBarItem.clickAboutUsHorizontalNavBarItem();
        homeNavBarItem.validateAboutUsPageDisplayed();
        homeNavBarItem.clickHomeNavBarItem();
        homeNavBarItem.validateHomePageDisplayed();
    }
    @Test
    void OnClickAboutUsNavBarItemNavigateToAboutUsPage(){
        HorizontalNavBarItems aboutUsNavBarItem = new HorizontalNavBarItems(driver);
        aboutUsNavBarItem.clickAboutUsHorizontalNavBarItem();
        aboutUsNavBarItem.validateAboutUsPageDisplayed();
        aboutUsNavBarItem.clickKafevilleTopLogo();
    }
    @Test
    void OnClickOurTeamNavBarItemNavigateToOurTeamPage(){
        HorizontalNavBarItems ourTeamNavBarItem = new HorizontalNavBarItems(driver);
        ourTeamNavBarItem.clickOurTeamHorizontalNavBarItem();
        ourTeamNavBarItem.validateOurTeamPageDisplayed();
        ourTeamNavBarItem.clickKafevilleTopLogo();
    }
    @Test
    void OnClickOurBrothersNavBarItemNavigateToOurBrothersPage(){
        HorizontalNavBarItems ourBrothersNavBarItem = new HorizontalNavBarItems(driver);
        ourBrothersNavBarItem.clickOurBrothersHorizontalNavBarItem();
        ourBrothersNavBarItem.validateOurBrothersPageDisplayed();
        ourBrothersNavBarItem.clickKafevilleTopLogo();
    }
    @Test
    void OnClickMenuNavBarItemNavigateToMenuPage(){
        HorizontalNavBarItems menuNavBarItem = new HorizontalNavBarItems(driver);
        menuNavBarItem.clickMenuHorizontalNavBarItem();
        menuNavBarItem.validateMenuPageDisplayed();
        menuNavBarItem.clickKafevilleTopLogo();
    }
    @Test
    void OnClickBlogNavBarItemNavigateToBlogPage(){
        HorizontalNavBarItems blogNavBarItem = new HorizontalNavBarItems(driver);
        blogNavBarItem.clickBlogHorizontalNavBarItem();
        blogNavBarItem.validateBlogPageDisplayed();
        blogNavBarItem.clickKafevilleTopLogo();
    }
    @Test
    void OnClickShopNavBarItemNavigateToShopPage(){
        HorizontalNavBarItems shopNavBarItem = new HorizontalNavBarItems(driver);
        shopNavBarItem.clickShopHorizontalNavBarItem();
        shopNavBarItem.validateShopPageDisplayed();
        shopNavBarItem.clickKafevilleTopLogo();
    }
    @AfterClass
    void closeWebPage(){
        driver.quit();
    }

}

