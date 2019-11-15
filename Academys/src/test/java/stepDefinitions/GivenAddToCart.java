package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;

public class GivenAddToCart {

	WebDriver driver = GivenLogin.driver;
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	@Given("User clicks on T-shirt tab")
	public void user_clicks_on_T_shirt_tab() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement TshirtTab = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[3]/a"));
		TshirtTab.click();
	}
}
