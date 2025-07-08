package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testcase {

	@FindBy(xpath = "//a[text()=' Test Cases']")
	private WebElement testcaselink;
	
	@FindBy(xpath = "//span[text()='Below is the list of test Cases for you to practice the Automation. Click on the scenario for detailed Test Steps:']")
	private WebElement successmsg;
	
	public testcase(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTestcaselink() {
		return testcaselink;
	}

	public WebElement getSuccessmsg() {
		return successmsg;
	}
	
}
