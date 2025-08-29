package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class reviewonprod {

	@FindBy(xpath = "//a[text()=' Products']")
	private WebElement productlink;
	
	@FindBy(xpath = "//p[text()='Blue Top']/../../..//a[text()='View Product']")
	private WebElement viewprodlink;
	
	@FindBy(xpath = "//a[text()='Write Your Review']")
	private WebElement reviewtxtlink;
	
	@FindBy(id = "name")
	private WebElement namelink;
	
	@FindBy(id = "email")
	private WebElement emaillink;
	
	@FindBy(id = "review")
	private WebElement reviewlink;
	
	@FindBy(id = "button-review")
	private WebElement reviewbtnlink;
	
	
	public reviewonprod(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
				
	}


	public WebElement getProductlink() {
		return productlink;
	}


	public WebElement getViewprodlink() {
		return viewprodlink;
	}


	public WebElement getReviewtxtlink() {
		return reviewtxtlink;
	}


	public WebElement getNamelink() {
		return namelink;
	}


	public WebElement getEmaillink() {
		return emaillink;
	}


	public WebElement getReviewlink() {
		return reviewlink;
	}


	public WebElement getReviewbtnlink() {
		return reviewbtnlink;
	}
	
	
}
