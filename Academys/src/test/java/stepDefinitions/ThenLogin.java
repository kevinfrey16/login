package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Then;

public class ThenLogin {

	WebDriver driver = SetUpClass.driver;
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	@Then("User should be in profile page")
	public void user_should_be_in_profile_page() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=my-account", "Error");
	    driver.quit();
	}

	@Then("Error message should be displayed")
	public void invalid_email_address_message_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='alert alert-danger']")));
		boolean Actualboolean = driver.findElement(By.xpath("//*[@class='alert alert-danger']")).isDisplayed();
		Assert.assertEquals(Actualboolean, true, "Error");
		driver.quit();
	}

	@Then("User receives email with new password")
	public void user_receives_email_with_new_password() {
	    // Write code here that turns the phrase above into concrete actions
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='alert alert-success']")));
		boolean Actualboolean = driver.findElement(By.xpath("//*[@class='alert alert-success']")).isDisplayed();
		Assert.assertEquals(Actualboolean, true, "Error");
		driver.quit();
	}


}
