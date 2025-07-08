package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	@FindBy(xpath = "//a[contains(text(),'Contact us')]")
	private WebElement contactuslink;
	
	@FindBy(xpath = "//a[contains(text(),' Products')]")
	private WebElement productslink;
	
	@FindBy(xpath = "//a[contains(text(),' Cart')]")
	private WebElement cartlink;
	
	@FindBy(xpath = "//a[contains(text(),' Test Cases')]")
	private WebElement testcaselink;
	
	@FindBy(xpath = "//a[contains(text(),' API Testing')]")
	private WebElement apilink;
	
	@FindBy(xpath = "//a[contains(text(),' Video Tutorials')]")
	private WebElement videotutorialslink;
	
	@FindBy(xpath = "//button[@type='button' and contains(text(),'Test Cases')]")
	private WebElement testcasebutton;
	
	@FindBy(xpath = "//button[@type='button' and contains(text(),'APIs list for practice')]")
	private WebElement apilistbutton;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getContactuslink() {
		return contactuslink;
	}

	public WebElement getProductslink() {
		return productslink;
	}

	public WebElement getCartlink() {
		return cartlink;
	}

	public WebElement getTestcaselink() {
		return testcaselink;
	}

	public WebElement getApilink() {
		return apilink;
	}

	public WebElement getVideotutorialslink() {
		return videotutorialslink;
	}

	public WebElement getTestcasebutton() {
		return testcasebutton;
	}

	public WebElement getApilistbutton() {
		return apilistbutton;
	}
	
	
}
