package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.When;
import pageObject.Login;
import pageObject.MyAccountPage;
import pageObject.WomenArticles;

public class WhenLogin {

	WebDriver driver = SetUpClass.driver;
	Login lg;
	WomenArticles wn;
	MyAccountPage ma;
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	@When("User enters valid email address {string}")
	public void user_enters_valid_email_address(String email) {
	    // Write code here that turns the phrase above into concrete actions
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
		lg = new Login(driver);
		lg.sendEmail(email);
	   
	}

	@When("User enters valid password {string}")
	public void user_enters_valid_password(String pass) {
	    // Write code here that turns the phrase above into concrete actions
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("passwd")));
		lg.sendPass(pass);
	}

	@When("User clicks Sign In button")
	public void user_clicks_Sign_In_button() {
	    // Write code here that turns the phrase above into concrete actions
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("passwd")));
		lg.clickSignIn();
	}
	
	@When("User enters invalid email address {string}")
	public void user_enters_invalid_email_address(String email) {
	    // Write code here that turns the phrase above into concrete actions
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
		driver.findElement(By.id("email")).sendKeys(email);
	}
	
	@When("User enters invalid password {string}")
	public void user_enters_invalid_password(String password) {
	    // Write code here that turns the phrase above into concrete actions
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("passwd")));
		driver.findElement(By.id("passwd")).sendKeys(password);
	}
	
	@When("User clicks Retrieve password button")
	public void user_clicks_Retrieve_password_button() {
	    // Write code here that turns the phrase above into concrete actions
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='form_forgotpassword']/fieldset/p/button/span")));
		driver.findElement(By.xpath("//*[@id='form_forgotpassword']/fieldset/p/button/span")).click();
	}
	
	@When("User should click on Women")
	public void user_should_click_on_Women() {
	    // Write code here that turns the phrase above into concrete actions
	    ma = new MyAccountPage(driver);
		ma.selectNavBarOption(0);
	}
	
	@When("User add an article")
	public void user_add_an_article() {
	    // Write code here that turns the phrase above into concrete actions
	    wn = new WomenArticles(driver);
		wn.selectArticle(0);
	}

	@When("User should proceed to checkout")
	public void user_should_proceed_to_checkout() {
	    // Write code here that turns the phrase above into concrete actions
	    wn.clickProceedTo();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    wn.clickProceedTo1();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    wn.clickProceedTo2();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    wn.clickCheckBox();
	    wn.clickProceedTo3();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    wn.PayCheck();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    wn.clickConfOrder();
	}
}
