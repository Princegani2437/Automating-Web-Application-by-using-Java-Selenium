package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cart {

	@FindBy(xpath = "//a[text()=' Cart']")
	private WebElement cartlink;
	
	@FindBy(xpath = "//h2[text()='Subscription']")
	private WebElement Subscriptionlink;
	@FindBy(xpath = "//input[@id='susbscribe_email']")
	private WebElement susbscribeemaillink;
	
	@FindBy(xpath = "//button[@id='subscribe']")
	private WebElement subscribebtnlink;
	
	public cart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCartlink() {
		return cartlink;
	}

	public WebElement getSubscriptionlink() {
		return Subscriptionlink;
	}

	public WebElement getSusbscribeemaillink() {
		return susbscribeemaillink;
	}

	public WebElement getSubscribebtnlink() {
		return subscribebtnlink;
	}
	
	
}
