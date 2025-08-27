package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginbfrchkout {

	@FindBy(xpath = "//a[text()=' Signup / Login']")
	private WebElement SignupLoginlink;
	
	@FindBy(xpath = "//input[@data-qa='login-email']")
	private WebElement loginemaillink;
	
	@FindBy(xpath = "//input[@data-qa='login-password']")
	private WebElement lgnpswdlink;
	
	@FindBy(xpath = "//button[@data-qa='login-button']")
	private WebElement lgnbtnlink;
	
	@FindBy(xpath = " //a[contains(text(),'Logged in as ')]")
	private WebElement lgnusrnamelink;
	
	@FindBy(xpath = "(//p[text()='Blue Top']/../../..//a[text()='Add to cart'])[1]")
	private WebElement addtocartlinktop;
	
//	@FindBy(xpath = "//u[text()='View Cart']")
//	private WebElement viewcartlink;
	
	@FindBy(xpath = "//u[text()='View Cart']")
	private WebElement viewcart2;
	
	@FindBy(xpath = "//a[text()='Proceed To Checkout']")
	private WebElement ProceedToCheckoutlink;
	
	@FindBy(xpath = "//a[text()=' Cart']")
	private WebElement cartlink2;
	
	@FindBy(xpath = "//a[text()='Proceed To Checkout']")
	private WebElement ProceedToCheckoutlink2;
	
	@FindBy(xpath = "//a[text()='Place Order']")
	private WebElement placeorderlink;
	
	@FindBy (xpath = "//input[@name='name_on_card']")
	private WebElement nameoncardlink;
	
	@FindBy(xpath = "//input[@name='card_number']")
	private WebElement cardnolink;
	
	@FindBy(xpath = "//input[@name='cvc']")
	private WebElement cvclink;
	
	@FindBy(xpath = "//input[@name='expiry_month']")
	private WebElement expmntlink;
	
	@FindBy(xpath = "//input[@name='expiry_year']")
	private WebElement expyearlink;
	
	@FindBy(id = "submit")
	private WebElement ordercnflink;


	private WebElement dltacntlink;
	
	@FindBy(xpath = "//b[text()='Account Deleted!']")
	private WebElement acntdltmsg;
	
	@FindBy(xpath = "//a[text()='Continue']")
	private WebElement dltacctcntlink;
	
	public loginbfrchkout(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getSignupLoginlink() {
		return SignupLoginlink;
	}

	public WebElement getLoginemaillink() {
		return loginemaillink;
	}

	public WebElement getLgnpswdlink() {
		return lgnpswdlink;
	}

	public WebElement getLgnbtnlink() {
		return lgnbtnlink;
	}

	public WebElement getLgnusrnamelink() {
		return lgnusrnamelink;
	}

	public WebElement getAddtocartlinktop() {
		return addtocartlinktop;
	}

//	public WebElement getViewcartlink() {
//		return viewcartlink;
//	}
	
	@FindBy(xpath = "//textarea[@name='message']")
	private WebElement descriptionlink;

	public WebElement getProceedToCheckoutlink() {
		return ProceedToCheckoutlink;
	}

	public WebElement getCartlink2() {
		return cartlink2;
	}

	public WebElement getProceedToCheckoutlink2() {
		return ProceedToCheckoutlink2;
	}

	public WebElement getPlaceorderlink() {
		return placeorderlink;
	}

	public WebElement getNameoncardlink() {
		return nameoncardlink;
	}

	public WebElement getCardnolink() {
		return cardnolink;
	}

	public WebElement getCvclink() {
		return cvclink;
	}

	public WebElement getExpmntlink() {
		return expmntlink;
	}

	public WebElement getExpyearlink() {
		return expyearlink;
	}

	public WebElement getOrdercnflink() {
		return ordercnflink;
	}

	public WebElement getDltacntlink() {
		return dltacntlink;
	}

	public WebElement getAcntdltmsg() {
		return acntdltmsg;
	}

	public WebElement getDltacctcntlink() {
		return dltacctcntlink;
	}

	public WebElement getViewcart2() {
		return viewcart2;
	}

	public WebElement getDescriptionlink() {
		return descriptionlink;
	}
	
	
}
