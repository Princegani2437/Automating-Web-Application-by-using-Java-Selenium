package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchproduct {

	@FindBy(xpath = " //a[text()=' Products']")
	private WebElement productlink;
	
	@FindBy(xpath = "//input[@id='search_product']")
	private WebElement searchproductlink;
	
	@FindBy(id = "submit_search")
	private WebElement submitsearch;
	
	public searchproduct(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getProductlink() {
		return productlink;
	}

	public WebElement getSearchproductlink() {
		return searchproductlink;
	}

	public WebElement getSubmitsearch() {
		return submitsearch;
	}
	
}
