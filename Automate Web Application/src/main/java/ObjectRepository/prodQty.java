package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class prodQty {

	@FindBy(xpath = "//p[text()='Blue Top']/../../..//a[text()='View Product']")
	private WebElement viewProductlink;
	
	@FindBy(xpath = "//input[@id='quantity']")
	private WebElement qtylink;
	
	@FindBy(xpath = "//button[@class='btn btn-default cart']")
	private WebElement addtocartbtnlink;
	
	@FindBy(xpath = "//u[text()='View Cart']")
	private WebElement viewcartlink;
	
	public prodQty(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getViewProductlink() {
		return viewProductlink;
	}

	public WebElement getQtylink() {
		return qtylink;
	}

	public WebElement getAddtocartbtnlink() {
		return addtocartbtnlink;
	}

	public WebElement getViewcartlink() {
		return viewcartlink;
	}
	
	
}
