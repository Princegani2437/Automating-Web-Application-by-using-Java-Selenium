package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactuspage {

	@FindBy(xpath = "//h2[text()='Get In Touch']")
	private WebElement getintouch;
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement namelTF;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailTF;
	
	@FindBy(xpath = "//input[@name='subject']")
	private WebElement subjectTF;
	
	@FindBy(xpath = "//textarea[@id='message']")
	private WebElement messageTF;
	
	@FindBy(xpath = "//input[@type='file']")
	private WebElement filetypetobechoosen;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submitbutton;
	
	@FindBy(xpath = "//div[text()='Success! Your details have been submitted successfully.']")
	private WebElement successmessage;
	
	@FindBy(xpath = "//span[text()=' Home']")
	private WebElement homebutton;
	
	public contactuspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getGetintouch() {
		return getintouch;
	}

	public WebElement getNamelTF() {
		return namelTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getSubjectTF() {
		return subjectTF;
	}

	public WebElement getMessageTF() {
		return messageTF;
	}

	public WebElement getFiletypetobechoosen() {
		return filetypetobechoosen;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}

	public WebElement getSuccessmessage() {
		return successmessage;
	}

	public WebElement getHomebutton() {
		return homebutton;
	}
	
	
}
