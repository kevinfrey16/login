package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;

public class ThenAddToCart {

	WebDriver driver = GivenLogin.driver;
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	@Then("There should be {int} item in the cart")
	public void there_should_be_item_in_the_cart(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
