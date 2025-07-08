package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addToCart {

	@FindBy(xpath = "//a[text()=' Products']")
	private WebElement Productsclicklink;
	
	@FindBy(xpath = "//p[text()='Blue Top']/../../..//a[text()='Add to cart']")
	private WebElement addtocartlinktop;
	
	@FindBy(xpath = "//button[text()='Continue Shopping']")
	private WebElement ContinueShoppinglink;
	
	@FindBy(xpath = "//p[text()='Men Tshirt']/../../..//a[text()='Add to cart']")
	private WebElement addtocartlinktshirt;
	
	@FindBy(xpath = "//u[text()='View Cart']")
	private WebElement viewcartlink;
	
	@FindBy(xpath = "//li[text()='Shopping Cart']")
	private WebElement ShoppingCartlink;
	
	public addToCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getProductsclicklink() {
		return Productsclicklink;
	}

	public WebElement getAddtocartlinktop() {
		return addtocartlinktop;
	}

	public WebElement getContinueShoppinglink() {
		return ContinueShoppinglink;
	}

	public WebElement getAddtocartlinktshirt() {
		return addtocartlinktshirt;
	}

	public WebElement getViewcartlink() {
		return viewcartlink;
	}

	public WebElement getShoppingCartlink() {
		return ShoppingCartlink;
	}
	
	
}
