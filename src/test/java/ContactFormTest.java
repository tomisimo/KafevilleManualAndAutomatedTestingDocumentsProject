import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContactFormTest {
    WebDriver driver;

    @BeforeClass
    void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.kafeville.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }
    @Test
    void ValidateContactFormFirstNameInputFieldPlaceholderTextDisplayed(){
        ContactForm FirstNameField = new ContactForm(driver);
        FirstNameField.firstNameInputFieldPlaceholderTextDisplayed();
    }
    @Test
    void ValidateContactFormLastNameInputFieldPlaceholderTextDisplayed(){
        ContactForm LastNameField = new ContactForm(driver);
        LastNameField.lastNameInputFieldPlaceholderTextDisplayed();
    }
    @Test
    void ValidateContactFormEmailInputFieldPlaceholderTextDisplayed(){
        ContactForm EmailField = new ContactForm(driver);
        EmailField.emailInputFieldPlaceholderTextDisplayed();
    }
    @Test
    void ValidateContactFormMessageTextareaFieldPlaceholderTextDisplayed(){
        ContactForm MessageTextareaField = new ContactForm(driver);
        MessageTextareaField.messageTextareaFieldPlaceholderTextDisplayed();
    }
}
