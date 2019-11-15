package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenArticles {

	WebDriver driver;
	public WomenArticles(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul[@class = 'product_list grid row']/li")
	List<WebElement> articles;
	
	@FindBy(xpath = "//span[text() = 'Add to cart']")
	List<WebElement> addToCart;
	
	@FindBy(xpath = "//span[contains(text(), 'Proceed to')]")
	WebElement proceedTo;
	
	@FindBy(xpath = "//*[@id=\'center_column\']/p[2]/a[1]")
	WebElement proceedTo1;
	
	@FindBy(name = "cgv")
	WebElement checkBox;
	
	@FindBy(name = "processAddress")
	WebElement proceedTo2;
	
	@FindBy(name = "processCarrier")
	WebElement proceedTo3;
	
	@FindBy(className = "cheque")
	WebElement PayByCheck;
	
	@FindBy(xpath = "//span[contains(text(), 'I confirm')]")
	WebElement ConfOrder;
	
	public void selectArticle(int index) {
		if(index <= articles.size()-1) {
			Actions ac = new Actions(driver);
			ac.moveToElement(articles.get(index)).perform();
			addToCart.get(index).click();
		}
		else {
			System.out.println("Error");
		}
	}
	
	public void clickProceedTo() {
		proceedTo.click();
	}
	
	public void clickProceedTo1() {
		proceedTo1.click();
	}
	
	public void clickProceedTo2() {
		proceedTo2.click();
	}
	
	public void clickProceedTo3() {
		proceedTo3.click();
	}
	
	public void clickCheckBox() {
		checkBox.click();
	}
	
	public void PayCheck() {
		PayByCheck.click();
	}
	
	public void clickConfOrder() {
		ConfOrder.click();
	}
}
