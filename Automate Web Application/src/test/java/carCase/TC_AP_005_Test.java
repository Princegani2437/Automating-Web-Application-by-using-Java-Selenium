package carCase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import ObjectRepository.cart;
import generic_utility.BaseClass;
import generic_utility.ListenerUtility;

@Listeners(ListenerUtility.class)
public class TC_AP_005_Test extends BaseClass{

	@Test
	
	public void clickonCart() {
	
	cart cp = new cart(driver);
	Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/","Home page is not displayed");
	//test.log(Status.INFO, "Home page displayed");
	
	cp.getCartlink().click();
	wUtil.scrolling(driver, cp.getSubscriptionlink());
	
	Assert.assertEquals(cp.getSubscriptionlink().getText(), "SUBSCRIPTION","SUBSCRIPTION is not visible");
	Reporter.log("SUBSCRIPTION is  visible",true);
	cp.getSusbscribeemaillink().sendKeys("ganeshbhat462@gmal.com");
	cp.getSubscribebtnlink().click();
	
	Assert.assertEquals(cp.getSubscribebtnlink().getText(), "'You have been successfully subscribed!'","success msg is not visible");
	Reporter.log("success msg is  visible",true);
	
}
}
