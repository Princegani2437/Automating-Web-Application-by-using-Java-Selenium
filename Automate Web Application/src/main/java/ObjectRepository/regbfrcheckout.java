package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class regbfrcheckout {

	@FindBy(xpath = "//a[text()=' Signup / Login']")
	private WebElement SignupLoginlink;
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement Signupnamelink;
	
	@FindBy(xpath = "//input[@data-qa='signup-email']")
	private WebElement Signupemaillink;
	
	@FindBy(xpath = "//button[text()='Signup']")
	private WebElement Signupbtnlink;
	
	@FindBy(xpath = "//input[@id='id_gender1']")
	private WebElement genderlink;
	
	@FindBy(id = "name")
	private WebElement namelink;
	
	@FindBy(id = "email")
	private WebElement emaillink;
	
	@FindBy(id = "password")
	private WebElement passwordlink;
	
	@FindBy(id = "days")
	private WebElement dayslink;
	
	@FindBy(id = "months")
	private WebElement monthslink;
	
	@FindBy(id = "years")
	private WebElement yearslink;
	
	@FindBy(id = "first_name")
	private WebElement firstnamelink;
	
	@FindBy(id = "last_name")
	private WebElement lastnamelink;
	
	@FindBy(id = "company")
	private WebElement companylink;
	
	@FindBy(id = "address1")
	private WebElement addresslink;
	
	@FindBy(id = "country")
	private WebElement countrylink;
	
	@FindBy(id = "state")
	private WebElement statelink;
	
	@FindBy(id = "city")
	private WebElement citylink;
	
	@FindBy(id = "zipcode")
	private WebElement zipcodelink;
	
	@FindBy(id = "mobile_number")
	private WebElement mobilenumberlink;
	
	@FindBy(xpath = "//button[text()='Create Account']")
	private WebElement createaccbtnlink;
	
	@FindBy(xpath = "//b[text()='Account Created!']")
	private WebElement acccreatedmsglink;
	
	@FindBy(xpath = "//a[text()='Continue']")
	private WebElement continuelink;
	
	@FindBy(xpath = " //a[contains(text(),'Logged in as ')]")
	private WebElement lgnusrnamelink;
	
	@FindBy(xpath = "//a[text()=' Products']")
	private WebElement Productsclicklink;
	
	@FindBy(xpath = "//p[text()='Blue Top']/../../..//a[text()='View Product']")
	private WebElement viewProductlink;
	
	@FindBy(xpath = "//p[text()='Blue Top']/../../..//a[text()='Add to cart']")
	private WebElement addtocartlinktop;
	
	//@FindBy(xpath = "//u[text()='View Cart']")
	//private WebElement viewcartlink;
	
	@FindBy(xpath = "//u[text()='View Cart']")
	private WebElement viewcart2;
	
	@FindBy(xpath = "//a[text()=' Cart']")
	private WebElement cartlink2;
	
	@FindBy(xpath = "//button[text()='Continue Shopping']")
	private WebElement ContinueShoppinglink;
	
	@FindBy(xpath = "//a[text()='Proceed To Checkout']")
	private WebElement ProceedToCheckoutlink2;
	
	@FindBy(xpath = "//textarea[@name='message']")
	private WebElement descriptionlink;
	
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
	
	@FindBy(xpath = " //a[text()=' Delete Account']")
	private WebElement dltacntlink;
	
	@FindBy(xpath = "//b[text()='Account Deleted!']")
	private WebElement acntdltmsg;
	
	@FindBy(xpath = "//a[text()='Continue']")
	private WebElement dltacctcntlink;
	
	public regbfrcheckout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignupLoginlink() {
		return SignupLoginlink;
	}

	public WebElement getSignupnamelink() {
		return Signupnamelink;
	}

	public WebElement getSignupemaillink() {
		return Signupemaillink;
	}

	public WebElement getSignupbtnlink() {
		return Signupbtnlink;
	}

	public WebElement getGenderlink() {
		return genderlink;
	}

	public WebElement getNamelink() {
		return namelink;
	}

	public WebElement getEmaillink() {
		return emaillink;
	}

	public WebElement getPasswordlink() {
		return passwordlink;
	}

	public WebElement getDayslink() {
		return dayslink;
	}

	public WebElement getMonthslink() {
		return monthslink;
	}

	public WebElement getYearslink() {
		return yearslink;
	}

	public WebElement getFirstnamelink() {
		return firstnamelink;
	}

	public WebElement getLastnamelink() {
		return lastnamelink;
	}

	public WebElement getCompanylink() {
		return companylink;
	}

	public WebElement getAddresslink() {
		return addresslink;
	}

	public WebElement getCountrylink() {
		return countrylink;
	}

	public WebElement getStatelink() {
		return statelink;
	}

	public WebElement getCitylink() {
		return citylink;
	}

	public WebElement getZipcodelink() {
		return zipcodelink;
	}

	public WebElement getMobilenumberlink() {
		return mobilenumberlink;
	}

	public WebElement getCreateaccbtnlink() {
		return createaccbtnlink;
	}

	public WebElement getAcccreatedmsglink() {
		return acccreatedmsglink;
	}

	public WebElement getContinuelink() {
		return continuelink;
	}

	public WebElement getLgnusrnamelink() {
		return lgnusrnamelink;
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

	public WebElement getViewProductlink() {
		return viewProductlink;
	}

	public WebElement getProductsclicklink() {
		return Productsclicklink;
	}

	public WebElement getAddtocartlinktop() {
		return addtocartlinktop;
	}

//	public WebElement getViewcartlink() {
//		return viewcartlink;
//	}

	public WebElement getContinueShoppinglink() {
		return ContinueShoppinglink;
	}

	public WebElement getViewcart2() {
		return viewcart2;
	}

	public WebElement getDescriptionlink() {
		return descriptionlink;
	}
	
	
}
