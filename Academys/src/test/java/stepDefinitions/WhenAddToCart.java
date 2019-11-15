package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.When;

public class WhenAddToCart {

	WebDriver driver = GivenLogin.driver;
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	@When("User clicks on Add to cart button")
	public void user_clicks_on_Add_to_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement AddCart = driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span"));
		AddCart.click();
	}
}
