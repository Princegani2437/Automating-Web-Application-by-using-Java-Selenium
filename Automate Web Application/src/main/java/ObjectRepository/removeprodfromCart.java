package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class removeprodfromCart {

	
	@FindBy(xpath = " //a[contains(text(),'Logged in as ')]")
	private WebElement lgnusrnamelink;
	
	@FindBy(xpath = "(//p[text()='Blue Top']/../../..//a[text()='Add to cart'])[1]")
	private WebElement addtocartlinktop;
	
	@FindBy(xpath = "//u[text()='View Cart']")
	private WebElement viewcart2;
	
	@FindBy(xpath = "//a[@class='cart_quantity_delete']")
	private WebElement deletebtnlink;
	
	@FindBy(xpath = "//b[text()='Cart is empty!']")
	private WebElement itemremovedmsglink;
	
	
	public removeprodfromCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getLgnusrnamelink() {
		return lgnusrnamelink;
	}


	public WebElement getAddtocartlinktop() {
		return addtocartlinktop;
	}


	public WebElement getViewcart2() {
		return viewcart2;
	}


	public WebElement getDeletebtnlink() {
		return deletebtnlink;
	}


	public WebElement getItemremovedlink() {
		return itemremovedmsglink;
	}
	
	
}
