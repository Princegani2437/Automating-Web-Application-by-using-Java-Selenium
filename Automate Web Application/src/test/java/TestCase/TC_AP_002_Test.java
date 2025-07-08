package TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import ObjectRepository.Homepage;
import ObjectRepository.testcase;
import generic_utility.BaseClass;
import generic_utility.ListenerUtility;

@Listeners(ListenerUtility.class)
public class TC_AP_002_Test extends BaseClass {

	@Test
	
	public void clickonTestcase() {
	
		Homepage hp = new Homepage(driver);

		Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/","Home page is not displayed");
		test.log(Status.INFO, "Home page displayed");
		hp.getTestcasebutton().click();
		
		testcase ts = new testcase(driver);
		
		
		Assert.assertEquals(ts.getSuccessmsg().getText(), "Below is the list of test Cases for you to practice the Automation. Click on the scenario for detailed Test Steps:","testcase page is not loaded");
		test.log(Status.PASS, "Test case page is loaded");
	}
}
