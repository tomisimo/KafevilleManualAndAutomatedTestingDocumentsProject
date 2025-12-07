import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.time.Duration.ofSeconds;



public class LanguagesDropdownHandlePage {
    WebDriver driver;
    //Constructor
    LanguagesDropdownHandlePage(WebDriver driver){
        this.driver = driver;
    }
    //Locators
    By LanguageDropdownFieldENonFirstClick = By.cssSelector(".SLABZ6");
    By LanguageDropdownFieldVIonFirstClick = By.xpath("//*[@id=\"comp-kl7gyyxf-dropdown-option-1\"]");
    By LanguageDropdownFieldVIonSecondClick = By.xpath("//*[@id=\"comp-kl7gyyxf\"]/div/div/div[1]/div[1]");
    By LanguageDropdownFieldENonSecondClick = By.xpath("//*[@id=\"comp-kl7gyyxf-dropdown-option-1\"]/div");

    //Action Methods
    public void firstClickOnLanguageDropdownFieldEN(){
        driver.findElement(LanguageDropdownFieldENonFirstClick).click();
    }
    public void firstClickOnLanguageDropdownFieldVI(){
        driver.findElement(LanguageDropdownFieldVIonFirstClick).click();
    }
    public void secondClickOnLanguageDropdownFieldVI(){
        driver.findElement(LanguageDropdownFieldVIonSecondClick).click();
    }
    public void secondClickOnLanguageDropdownFieldEN(){
        driver.findElement(LanguageDropdownFieldENonSecondClick).click();
    }


    public void validateEnglishHomeItemDisplayed(){
        WebElement EnglishHomeItem = driver.findElement(By.xpath("//*[@id=\"comp-kl7gppk50label\"]"));
        System.out.println("Home item displayed in english language is: "+ EnglishHomeItem.getText());

    }
    public void validateVietnameseHomeItemDisplayed(){
        WebElement VietnameseHomeItem = driver.findElement(By.xpath("//*[@id=\"comp-kl7gppk50label\"]"));
        System.out.println("Home item displayed in vietnamese language is: "+ VietnameseHomeItem.getText());

    }
    public void validateEnglishAboutusItemDisplayed(){
        WebElement EnglishAboutusItem = driver.findElement(By.xpath("//*[@id=\"comp-kl7gppk51label\"]"));
        System.out.println("About us item displayed in english language is: "+ EnglishAboutusItem.getText());

    }
    public void validateVietnameseAboutusItemDisplayed(){
        WebElement VietnameseAboutusItem = driver.findElement(By.xpath("//*[@id=\"comp-kl7gppk51label\"]"));
        System.out.println("About us item displayed in vietnamese language is: "+ VietnameseAboutusItem.getText());

    }
    public void validateEnglishOurBrothersItemDisplayed(){
        WebElement EnglishOurBrothersItem = driver.findElement(By.xpath("//*[@id=\"comp-kl7gppk53label\"]"));
        System.out.println("Our Brothers item displayed in english language is: "+ EnglishOurBrothersItem.getText());

    }
    public void validateVietnameseOurBrothersItemDisplayed(){
        WebElement VietnameseOurBrothersItem = driver.findElement(By.xpath("//*[@id=\"comp-kl7gppk53label\"]"));
        System.out.println("Our Brothers item displayed in vietnamese language is: "+ VietnameseOurBrothersItem.getText());

    }
}
