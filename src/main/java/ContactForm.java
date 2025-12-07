import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class ContactForm {
    WebDriver driver;

    //Constructor
    ContactForm(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    By FirstNameInputField = By.cssSelector("#input_comp-kl6whwp8");
    By LastNameInputField = By.cssSelector("#input_comp-kl6whwpi");
    By EmailInputField = By.cssSelector("#input_comp-kl6whwpq");
    By MessageTextareaField = By.cssSelector("#textarea_comp-kl6whwpx");
    By SendButton = By.xpath("//*[@id=\"comp-kl6whwq4\"]/button");


    //Action Methods
    public void firstNameInputFieldPlaceholderTextDisplayed() {
        String firstNamePlaceholderText = driver.findElement(FirstNameInputField).getAttribute("placeholder");
        System.out.println("First Name input field placeholder is : " + firstNamePlaceholderText);
    }

    public void lastNameInputFieldPlaceholderTextDisplayed() {
        String lastNamePlaceholderText = driver.findElement(LastNameInputField).getAttribute("placeholder");
        System.out.println("Last Name input field placeholder is : " + lastNamePlaceholderText);
    }

    public void emailInputFieldPlaceholderTextDisplayed() {
        String emailPlaceholderText = driver.findElement(EmailInputField).getAttribute("placeholder");
        System.out.println("Email input field placeholder is : " + emailPlaceholderText);
    }

    public void messageTextareaFieldPlaceholderTextDisplayed() {
        String messageTextareaPlaceholderText = driver.findElement(MessageTextareaField).getAttribute("placeholder");
        System.out.println("Message textarea field placeholder is : " + messageTextareaPlaceholderText);
    }

    public void clickContactFormSendButton() {
        driver.findElement(SendButton).click();
    }

    public void validateFirstNameInputFieldBorderColorAndBackgroundColor() {
        String FirstNameFieldBorderColor = driver.findElement(FirstNameInputField).getCssValue("border-color");
        System.out.println("First Name field border color is : " + FirstNameFieldBorderColor);
        String FirstNameFieldBackgroundColor = driver.findElement(FirstNameInputField).getCssValue("background-color");
        System.out.println("First Name field background color is : " + FirstNameFieldBackgroundColor);
    }

    public void validateLastNameInputFieldBorderColorAndBackgroundColor() {
        String LastNameFieldBorderColor = driver.findElement(LastNameInputField).getCssValue("border-color");
        System.out.println("First Name field border color is : " + LastNameFieldBorderColor);
        String LastNameFieldBackgroundColor = driver.findElement(LastNameInputField).getCssValue("background-color");
        System.out.println("First Name field background color is : " + LastNameFieldBackgroundColor);
    }

    public void validateEmailInputFieldBorderColorAndBackgroundColor() {
        String EmailFieldBorderColor = driver.findElement(EmailInputField).getCssValue("border-color");
        System.out.println("Email field border color is : " + EmailFieldBorderColor);
        String EmailFieldBackgroundColor = driver.findElement(EmailInputField).getCssValue("background-color");
        System.out.println("Email field background color is : " + EmailFieldBackgroundColor);
    }

    public void validateMessageTextareaFieldBorderColorAndBackgroundColor() {
        String MessageTextareaFieldBorderColor = driver.findElement(MessageTextareaField).getCssValue("border-color");
        System.out.println("Message textarea field border color is : " + MessageTextareaFieldBorderColor);
        String MessageTextareaFieldBackgroundColor = driver.findElement(MessageTextareaField).getCssValue("background-color");
        System.out.println("Message textarea field background color is " + MessageTextareaFieldBackgroundColor);
    }

    public void explicitWaitForContactFormFieldsToBeProperlyLoadedAfterSendButtonClick() {
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#input_comp-kl6whwpq")));
    }
}











