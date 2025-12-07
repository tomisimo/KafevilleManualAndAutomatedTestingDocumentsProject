import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class SocialMediaIconsPage {
    WebDriver driver;
    //Constructor
    SocialMediaIconsPage(WebDriver driver){
        this.driver = driver;
    }
    //Locators
    By GoogleMapsPinIconTopRight = By.xpath("//*[@id=\"dataItem-kl7gppbf1-comp-kl7gppa43\"]/a");
    By FacebookfIconTopRight = By.xpath("//*[@id=\"dataItem-kl7gppbf3-comp-kl7gppa43\"]/a");
    By InstagramIconTopRight = By.xpath("//*[@id=\"dataItem-kl7gppbf5-comp-kl7gppa43\"]/a");
    By GoogleMapsPinIconBottomRight = By.xpath("//*[@id=\"dataItem-kl6p88tn-comp-k316eoz71\"]/a");
    By FacebookfIconBottomRight = By.xpath("//*[@id=\"dataItem-kl6p88tn2-comp-k316eoz71\"]/a");
    By InstagramIconBottomRight = By.xpath("//*[@id=\"dataItem-kl6p88to-comp-k316eoz71\"]/a");

    // Action methods
    public void validateGoogleMapsPinIconTopRightDisplayed(){
        boolean GoogleMapsPinTopRightDisplayed = driver.findElement(GoogleMapsPinIconTopRight).isDisplayed();
        System.out.println("Google Maps Pin icon is displayed on top right corner: "+ GoogleMapsPinTopRightDisplayed);
    }
    public void validateFacebookfIconTopRightDisplayed(){
        boolean FacebookfTopRightDisplayed = driver.findElement(FacebookfIconTopRight).isDisplayed();
        System.out.println("Facebook f icon is displayed on top right corner: "+ FacebookfTopRightDisplayed);
    }
    public void validateInstagramIconTopRightDisplayed(){
        boolean InstagramIconTopRightDisplayed = driver.findElement(InstagramIconTopRight).isDisplayed();
        System.out.println("Instagram icon is displayed on top right corner: "+ InstagramIconTopRightDisplayed);
    }
    public void validateGoogleMapsPinIconBottomRightDisplayed(){
        boolean GoogleMapsPinBottomRightDisplayed = driver.findElement(GoogleMapsPinIconBottomRight).isDisplayed();
        System.out.println("Google Maps Pin icon is displayed on bottom right corner: "+ GoogleMapsPinBottomRightDisplayed);
    }
    public void validateFacebookfIconBottomRightDisplayed(){
        boolean FacebookfBottomRightDisplayed = driver.findElement(FacebookfIconBottomRight).isDisplayed();
        System.out.println("Facebook f icon is displayed on bottom right corner: "+ FacebookfBottomRightDisplayed);
    }
    public void validateInstagramIconBottomRightDisplayed(){
        boolean InstagramIconBottomRightDisplayed = driver.findElement(InstagramIconBottomRight).isDisplayed();
        System.out.println("Instagram icon is displayed on bottom right corner: "+ InstagramIconBottomRightDisplayed);
    }
    public void clickGoogleMapsPinIconTopRight(){
        driver.findElement(GoogleMapsPinIconTopRight).click();
    }
    public void accessAndValidateKafevilleGoogleMapsPageDisplayed(){
        String kafevilleHomepageWindow = driver.getWindowHandle();
        Set<String>kafevilleAllOpenWindows = driver.getWindowHandles();
        Iterator<String> allWindows = kafevilleAllOpenWindows.iterator();
        while (allWindows.hasNext())
        {
            String googleMapsPageWindow = allWindows.next();
            if(!kafevilleHomepageWindow.equals(googleMapsPageWindow)){
                driver.switchTo().window(googleMapsPageWindow);
                System.out.println("Kafeville Google Maps page title is : "+ driver.switchTo().window(googleMapsPageWindow).getTitle());
            }
        }
    }
    public void clickFacebookfIconTopRight(){
        driver.findElement(FacebookfIconTopRight).click();
    }
    public void accessAndValidateKafevilleFacebookPageDisplayed() {
        String kafevilleHomepageWindow = driver.getWindowHandle();
        Set<String> kafevilleAllOpenWindows = driver.getWindowHandles();
        Iterator<String> allWindows = kafevilleAllOpenWindows.iterator();
        while (allWindows.hasNext()) {
            String facebookPageWindow = allWindows.next();
            if (!kafevilleHomepageWindow.equals(facebookPageWindow)) {
                driver.switchTo().window(facebookPageWindow);
                System.out.println("Kafeville Facebook page title is : "+ driver.switchTo().window(facebookPageWindow).getTitle());
            }
        }
    }
    public void clickInstagramIconTopRight(){
        driver.findElement(InstagramIconTopRight).click();
    }
    public void accessAndValidateKafevilleInstagramPageDisplayed() {
        String kafevilleHomepageWindow = driver.getWindowHandle();
        Set<String> kafevilleAllOpenWindows = driver.getWindowHandles();
        Iterator<String> allWindows = kafevilleAllOpenWindows.iterator();
        while (allWindows.hasNext()) {
            String InstagramPageWindow = allWindows.next();
            if (!kafevilleHomepageWindow.equals(InstagramPageWindow)) {
                driver.switchTo().window(InstagramPageWindow);
                System.out.println("Kafeville Instagram page title is : "+ driver.switchTo().window(InstagramPageWindow).getTitle());
            }
        }
    }
    public void clickGoogleMapsPinIconBottomRight(){
        driver.findElement(GoogleMapsPinIconBottomRight).click();
    }
    public void clickFacebookfIconBottomRight(){
        driver.findElement(FacebookfIconBottomRight).click();
    }
    public void clickInstagramIconBottomRight(){
        driver.findElement(InstagramIconBottomRight).click();
    }
}




