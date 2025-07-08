package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDetailspage {

	@FindBy(xpath = "//p[contains(text(),'Category:')]")
	private WebElement category;
	
	@FindBy(xpath = "//span[contains(text(),'Rs.')]")
	private WebElement price;
	
	@FindBy(id = "quantity")
	private WebElement quantity;
	
	@FindBy(xpath = "//b[contains(text(),'Availability:')]")
	private WebElement Availability;
	
	@FindBy(xpath = "//b[contains(text(),'Condition:')]")
	private WebElement Condition;
	
	@FindBy(xpath = "//b[contains(text(),'Brand:')]")
	private WebElement Brand;
	
	
	@FindBy(xpath = "//button[@type='button']")
	private WebElement addtocartbutton;
	
	public productDetailspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCategory() {
		return category;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getAvailability() {
		return Availability;
	}

	public WebElement getCondition() {
		return Condition;
	}

	public WebElement getBrand() {
		return Brand;
	}

	public WebElement getAddtocartbutton() {
		return addtocartbutton;
	}
	
	
}
