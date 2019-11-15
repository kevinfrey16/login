package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "email")
	WebElement lblEmail;
	
	@FindBy(name = "passwd")
	WebElement lblPass;
	
	@FindBy(name = "SubmitLogin")
	WebElement btnSignIn;
	
	public void sendEmail(String email) {
		lblEmail.sendKeys(email);
	}
	
	public void sendPass(String pass) {
		lblPass.sendKeys(pass);
	}
	
	public void clickSignIn() {
		btnSignIn.click();
	}
	
	public void logInToPage() {
		lblEmail.sendKeys("test800@hotmail.com");
		lblPass.sendKeys("test123");
		btnSignIn.click();
	}
}
