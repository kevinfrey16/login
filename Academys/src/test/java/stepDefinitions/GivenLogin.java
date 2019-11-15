package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import pageObject.HomePage;
import pageObject.Login;

public class GivenLogin {

	public static WebDriver driver = SetUpClass.driver;
	HomePage hp;
	Login lg;

	@Given("User clicks on Sign In")
	public void user_clicks_on_Sign_In() {
	    // Write code here that turns the phrase above into concrete actions
	    hp = new HomePage(driver);
	    hp.clickSignIn();
	}
	
	@Given("User clicks on Forgot your password? link")
	public void user_clicks_on_Forgot_your_password_link() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement ForPass = driver.findElement(By.linkText("Forgot your password?"));
		ForPass.click();
	}
	
	@Given("User should be logged")
	public void user_should_be_logged() {
	    // Write code here that turns the phrase above into concrete actions
		hp = new HomePage(driver);
		hp.clickSignIn();
		lg = new Login(driver);
	    lg.logInToPage();
	}
}
