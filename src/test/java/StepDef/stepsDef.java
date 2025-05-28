package Steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepsDef {

    WebDriver driver;

    @Given("Iam on the login page")
    public void iam_on_the_login_page() {
        driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }
    @And("i enter username (.*)$")
    public void i_enter_username_standard_user(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }
    @And("I enter password (.*)$")
    public void i_enter_password_secret_sauce(String password) {
    driver.findElement(By.id("password")).sendKeys(password);
    }
    @When("i click login button")
    public void i_click_login_button() {
        driver.findElement(By.id("login-button")).click();
    }
    @Then("I should be on the home page")
    public void i_should_be_on_the_home_page() {
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Login successful, on the home page.");
            assert true;
        } else {
            System.out.println("Login failed, not on the home page.");
            assert false;
        }
        driver.quit();

    }

}
