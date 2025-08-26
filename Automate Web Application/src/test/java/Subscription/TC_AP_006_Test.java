package Subscription;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import ObjectRepository.subpage;
import generic_utility.BaseClass;
import generic_utility.ListenerUtility;

@Listeners(ListenerUtility.class)
public class TC_AP_006_Test extends BaseClass{

	@Test
	public void clickonsubbtn() {
		
		subpage sb = new subpage(driver);
		Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/","Home page is not displayed");
		test.log(Status.INFO, "Home page displayed");
		
		wUtil.scrolling(driver, sb.getSubscriptionlink());
		
		Assert.assertEquals(sb.getSubscriptionlink().getText(), "SUBSCRIPTION","SUBSCRIPTION is not visible");
		Reporter.log("SUBSCRIPTION is  visible",true);
		sb.getSusbscribeemaillink().sendKeys("ganeshbhat462@gmail.com");
		sb.getSubscribebtnlink().click();
		
		Assert.assertEquals(sb.getSubscribebtnlink().getText(), "'You have been successfully subscribed!'","success msg is not visible");
		Reporter.log("success msg is  visible",true);
	}
}
