package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchprodandverify {

	@FindBy(xpath = "//a[text()=' Products']")
	private WebElement productlink;
	
	@FindBy(xpath = "//input[@id='search_product']")
	private WebElement txtfieldlink;
	
	@FindBy(xpath = "//i[@class='fa fa-search']")
	private WebElement searchbtnlink;
	
	@FindBy(xpath = "(//p[text()='Men Tshirt']/../..//a[text()='Add to cart'])[1]")
	private WebElement addtocartlink;
	
	@FindBy(xpath = "//button[text()='Continue Shopping']")
	private WebElement cntshpnglink;
	
	@FindBy(xpath = "(//a[@href='/view_cart'])[1]")
	private WebElement cartlink;
	
	@FindBy(xpath = "//a[@href='/login']")
	private WebElement signuploginlink;
	
	@FindBy(xpath = "//h2[text()='Searched Products']")
	private WebElement searchprodlink;
	
	@FindBy(xpath = "//input[@data-qa='login-email']")
	private WebElement loginemaillink;
	
	@FindBy(xpath = "//input[@data-qa='login-password']")
	private WebElement lgnpswdlink;
	
	@FindBy(xpath = "//button[@data-qa='login-button']")
	private WebElement lgnbtnlink;
	
	
	public searchprodandverify(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getProductlink() {
		return productlink;
	}

	public WebElement getTxtfieldlink() {
		return txtfieldlink;
	}

	public WebElement getSearchbtnlink() {
		return searchbtnlink;
	}

	public WebElement getAddtocartlink() {
		return addtocartlink;
	}

	public WebElement getCntshpnglink() {
		return cntshpnglink;
	}

	public WebElement getCartlink() {
		return cartlink;
	}

	public WebElement getSignuploginlink() {
		return signuploginlink;
	}

	public WebElement getSearchprodlink() {
		return searchprodlink;
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
	
	
	
}
