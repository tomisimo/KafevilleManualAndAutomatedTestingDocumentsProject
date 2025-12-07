import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HorizontalNavBarItems {
    WebDriver driver;
    //Constructor
    HorizontalNavBarItems(WebDriver driver){
        this.driver = driver;
    }
    //Locators
    By AboutUsNavBarItem = By.xpath("//*[@id=\"comp-kl7gppk51\"]/a");
    By OurTeamNavBarItem = By.xpath("//*[@id=\"comp-kl7gppk52\"]/a") ;
    By OurBrothersNavBarItem = By.xpath("//*[@id=\"comp-kl7gppk53\"]/a");
    By MenuNavBarItem = By.xpath("//*[@id=\"comp-kl7gppk54\"]/a");
    By BlogNavBarItem = By.xpath("//*[@id=\"comp-kl7gppk55\"]/a");
    By ShopNavBarItem = By.xpath("//*[@id=\"comp-kl7gppk56\"]/a");
    By HomeNavBarItem = By.xpath("//*[@id=\"comp-kl7gppk50\"]/a");
    By KafevilleTopLogo = By.xpath("//*[@id=\"comp-kl7gp3po2\"]/a");

    //Action Methods
    public void clickAboutUsHorizontalNavBarItem(){
        driver.findElement(AboutUsNavBarItem).click();
    }
    public void validateAboutUsPageDisplayed(){
        String AboutUsPageTitle = driver.getTitle();
        System.out.println("About Us page title is : " + AboutUsPageTitle);
    }
    public void clickHomeNavBarItem(){
        driver.findElement(HomeNavBarItem).click();
    }
    public void validateHomePageDisplayed(){
        String HomePageTitle = driver.getTitle();
        System.out.println("Home page title is : " + HomePageTitle);
    }
    public void clickKafevilleTopLogo(){
        driver.findElement(KafevilleTopLogo).click();
    }
    public void clickOurTeamHorizontalNavBarItem(){
        driver.findElement(OurTeamNavBarItem).click();
    }
    public void validateOurTeamPageDisplayed(){
        String OurTeamPageTitle = driver.getTitle();
        System.out.println("Our Team page title is : " + OurTeamPageTitle);
    }
    public void clickOurBrothersHorizontalNavBarItem(){
        driver.findElement(OurBrothersNavBarItem).click();
    }
    public void validateOurBrothersPageDisplayed(){
        String OurBrothersPageTitle = driver.getTitle();
        System.out.println("Our Brothers page title is : " + OurBrothersPageTitle);
    }
    public void clickMenuHorizontalNavBarItem(){
        driver.findElement(MenuNavBarItem).click();
    }
    public void validateMenuPageDisplayed(){
        String MenuPageTitle = driver.getTitle();
        System.out.println("Menu page title is : " + MenuPageTitle);
    }
    public void clickBlogHorizontalNavBarItem(){
        driver.findElement(BlogNavBarItem).click();
    }
    public void validateBlogPageDisplayed(){
        String BlogPageTitle = driver.getTitle();
        System.out.println("Blog page title is : " + BlogPageTitle);
    }
    public void clickShopHorizontalNavBarItem(){
        driver.findElement(ShopNavBarItem).click();
    }
    public void validateShopPageDisplayed(){
        String ShopPageTitle = driver.getTitle();
        System.out.println("Shop page title is : " + ShopPageTitle);
    }

}
