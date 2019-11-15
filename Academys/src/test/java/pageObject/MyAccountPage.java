package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

	public MyAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul[@class = 'sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li")
	List<WebElement> navBarOptions;
	
	public void selectNavBarOption(int index) {
		if(index <= navBarOptions.size()-1) {
			navBarOptions.get(index).click();
		}
		else {
			System.out.println("Error");
		}
	}
}
