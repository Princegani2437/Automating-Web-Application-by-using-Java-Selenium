package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class viewcatProd {

	
	@FindBy(xpath = "//h2[text()='Category']")
	private WebElement categorylink;
	
	@FindBy(xpath = "//h2[text()='Category']/../..//a[@href='#Women']")
	private WebElement womencatlink;
	
	@FindBy(xpath = "//a[@href='/category_products/1']")
	private WebElement dresscatlink;
	
	@FindBy(xpath = "//h2[text()='Category']/../..//a[@href='#Men']")
	private WebElement mencatlink;
	
	@FindBy(xpath = "//a[text()='Tshirts ']")
	private WebElement tshirtlink;
	
	public viewcatProd(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCategorylink() {
		return categorylink;
	}

	public WebElement getWomencatlink() {
		return womencatlink;
	}

	public WebElement getDresscatlink() {
		return dresscatlink;
	}

	public WebElement getMencatlink() {
		return mencatlink;
	}

	public WebElement getTshirtlink() {
		return tshirtlink;
	}
	
	
	
}
