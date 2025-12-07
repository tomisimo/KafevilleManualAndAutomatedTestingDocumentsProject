import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;

public class LogoPage {
    WebDriver driver;
    //Constructor
    LogoPage(WebDriver driver){
        this.driver = driver;
    }

    //Locators
    By AboutUsNavBarItem = By.xpath("//*[@id=\"comp-kl7gppk51\"]/a");
    By KafevilleTopLogo = By.xpath("//*[@id=\"comp-kl7gp3po2\"]/a");

    //Action Methods
    public void clickAboutUsHorizontalNavBarItem(){
        driver.findElement(AboutUsNavBarItem).click();
    }
    public void validateAboutUsPageDisplayed(){
        String AboutUsPageTitle = driver.getTitle();
        System.out.println("About Us page title is : " + AboutUsPageTitle);
    }
    public void clickKafevilleTopLogo(){
        driver.findElement(KafevilleTopLogo).click();
    }
    public void validateHomePageDisplayed(){
        String HomePageTitle = driver.getTitle();
        System.out.println("Home page title is : " + HomePageTitle);
    }
}




