package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    WebDriver driver;

    // Locators
    private By usernameField = By.id("sign-username");
    private By passwordField = By.id("sign-password");
    private By signupButton = By.xpath("//button[text()='Sign up']");

    // Constructor
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSignup() {
        driver.findElement(signupButton).click();
    }

    public String getAlertMessage() {
        Alert alert = driver.switchTo().alert();
        String message = alert.getText();
        alert.accept();  // Close the alert
        return message;
    }
}
