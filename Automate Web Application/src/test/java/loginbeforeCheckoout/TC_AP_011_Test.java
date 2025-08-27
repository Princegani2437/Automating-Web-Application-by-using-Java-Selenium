package loginbeforeCheckoout;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepository.loginbfrchkout;
import generic_utility.BaseClass;
import generic_utility.ListenerUtility;

@Listeners(ListenerUtility.class)

public class TC_AP_011_Test extends BaseClass {

	@Test
	
	public void loginbfrckout() throws Exception {
		loginbfrchkout lbc = new loginbfrchkout(driver);
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/","Home page is not displayed");
		Reporter.log("Home page displayed",true);
		lbc.getSignupLoginlink().click();
		lbc.getLoginemaillink().sendKeys("gbqw1@gmail.com");
		lbc.getLgnpswdlink().sendKeys(fUtil.getDataFromproperty("password"));
		lbc.getLgnbtnlink().click();
		Assert.assertEquals(lbc.getLgnusrnamelink().getText(), "Logged in as ganesh"," Logged in as ganesh msg is not displayed");
		Reporter.log("Logged in as ganesh msg is displayed",true);
		
		wUtil.mousehover(driver, lbc.getAddtocartlinktop());
		lbc.getAddtocartlinktop().click();	
		
		lbc.getViewcart2().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/view_cart","Cart page is not displayed");
		Reporter.log("Cart page is displayed",true);
	
		lbc.getProceedToCheckoutlink2().click();
		lbc.getDescriptionlink().sendKeys(fUtil.getDataFromproperty("description"));
		lbc.getPlaceorderlink().click();
		
	}
	
}
