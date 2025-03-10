package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class RegistrationSteps {
    WebDriver driver;

    @Given("User is on the signup page")
    public void user_is_on_the_signup_page() {
       driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
    }

    @When("User enters a unique username and password")
    public void user_enters_a_unique_username_and_password() {
        WebElement signupButton = driver.findElement(By.id("signin2"));
        signupButton.click();

        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }

        driver.findElement(By.id("sign-username")).sendKeys("testuser" + System.currentTimeMillis());
        driver.findElement(By.id("sign-password")).sendKeys("password123");
    }

    @When("User clicks on the Sign-up button")
    public void user_clicks_on_the_sign_up_button() {
        driver.findElement(By.xpath("//button[text()='Sign up']")).click();
    }

    @Then("User should see a successful registration message")
    public void user_should_see_a_successful_registration_message() {
        try {
            Thread.sleep(2000); 
            String alertText = driver.switchTo().alert().getText();
            System.out.println("Alert Message: " + alertText);
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
