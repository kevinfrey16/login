package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SetUpClass {

	public static WebDriver driver;
	@Before
	public void setUp() {
		 System.setProperty("webdriver.chrome.driver", "C:/Users/Academia/Downloads/chromedriver_win32/chromedriver.exe");
		    driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com");
	}
	
	@After
	public void dropDown() {
		//driver.quit();
	}
}
