package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	@FindBy(xpath = "//a[contains(text(),' Signup / Login')]")
	private WebElement loginlink;
	
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	private WebElement logoutlink;
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement usernameTF;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordTF;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbutton;
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLoginlink() {
		return loginlink;
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}

	public WebElement getUsernameTF() {
		return usernameTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	
}
