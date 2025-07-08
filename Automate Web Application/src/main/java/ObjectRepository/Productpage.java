package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {

	@FindBy(xpath = "//p[text()='Blue Top']/../../..//a[text()='View Product']")
	private WebElement bluetopviewproduct;
	
	@FindBy(xpath = "//p[text()='Blue Top']/../../..//a[text()='Add to cart']")
	private WebElement bluetopaddtocart;
	
	public Productpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getBluetopviewproduct() {
		return bluetopviewproduct;
	}

	public WebElement getBluetopaddtocart() {
		return bluetopaddtocart;
	}
}
