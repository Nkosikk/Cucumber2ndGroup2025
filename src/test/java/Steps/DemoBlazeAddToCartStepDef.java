package Steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlazeAddToCartStepDef {


    @Given("I click {string} under categories")
    public void i_click_under_categories(String string) {
        // Write code here that turns the phrase above into concrete actions
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();
        driver.findElement(By.linkText(string)).click();
    }
    @When("I click on any laptop of my choice")
    public void i_click_on_any_laptop_of_my_choice() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I add the laptop to the cart")
    public void i_add_the_laptop_to_the_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I verify the message on the popup {string}")
    public void i_verify_the_message_on_the_popup(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I click the OK button")
    public void i_click_the_ok_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
