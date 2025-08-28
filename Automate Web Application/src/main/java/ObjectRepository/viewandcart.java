package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class viewandcart {

	@FindBy(xpath = "//a[text()=' Products']")
	private WebElement productlink;
	
	@FindBy(xpath = "//h2[text()='Brands']")
	private WebElement brandlink;
	
	@FindBy(xpath = "//a[text()='Polo']")
	private WebElement pololink;
	
	public viewandcart(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getProductlink() {
		return productlink;
	}

	public WebElement getPololink() {
		return pololink;
	}

	public WebElement getBrandlink() {
		return brandlink;
	}
	
	
}
