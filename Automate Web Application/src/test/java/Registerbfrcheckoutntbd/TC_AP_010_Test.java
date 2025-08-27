package Registerbfrcheckoutntbd;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import ObjectRepository.regbfrcheckout;
import generic_utility.BaseClass;

public class TC_AP_010_Test extends BaseClass{

	@Test
	
	public void refbfrCheckout() throws Exception {
		regbfrcheckout rbc = new regbfrcheckout(driver);
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/","Home page is not displayed");
		Reporter.log("Home page displayed",true);
		
		rbc.getSignupLoginlink().click();
		rbc.getSignupnamelink().sendKeys(fUtil.getDataFromproperty("username"));
		rbc.getSignupemaillink().sendKeys("gbqw1@gmail.com");
		rbc.getSignupbtnlink().click();
		rbc.getPasswordlink().sendKeys(fUtil.getDataFromproperty("password"));
		rbc.getFirstnamelink().sendKeys(fUtil.getDataFromproperty("firstname"));
		rbc.getLastnamelink().sendKeys(fUtil.getDataFromproperty("lastname"));
		rbc.getAddresslink().sendKeys(fUtil.getDataFromproperty("address"));
		rbc.getStatelink().sendKeys(fUtil.getDataFromproperty("state"));
		rbc.getCitylink().sendKeys(fUtil.getDataFromproperty("city"));
		rbc.getZipcodelink().sendKeys(fUtil.getDataFromproperty("zipcode"));
		rbc.getMobilenumberlink().sendKeys(fUtil.getDataFromproperty("Ph.No"));
		rbc.getCreateaccbtnlink().click();
		
		Assert.assertEquals(rbc.getAcccreatedmsglink().getText(), "ACCOUNT CREATED!"," 'ACCOUNT CREATED!'msg is not displayed");
		Reporter.log("ACCOUNT CREATED! msg is displayed",true);
		rbc.getContinuelink().click();
		
		Assert.assertEquals(rbc.getLgnusrnamelink().getText(), "Logged in as ganesh"," Logged in as ganesh msg is not displayed");
		Reporter.log("Logged in as ganesh msg is displayed",true);
		
		wUtil.mousehover(driver, rbc.getAddtocartlinktop());
		rbc.getAddtocartlinktop().click();	
		Thread.sleep(5000);
		rbc.getViewcart2().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/view_cart","Cart page is not displayed");
		Reporter.log("Cart page is displayed",true);
		
		rbc.getProceedToCheckoutlink2().click();
		rbc.getDescriptionlink().sendKeys(fUtil.getDataFromproperty("description"));
		rbc.getPlaceorderlink().click();
//		rbc.getNameoncardlink().sendKeys(fUtil.getDataFromproperty("username"));
//		rbc.getCardnolink().sendKeys(fUtil.getDataFromproperty("cardno"));
//		rbc.getCvclink().sendKeys(fUtil.getDataFromproperty("cvc"));
//		rbc.getExpmntlink().sendKeys(fUtil.getDataFromproperty("mntexp"));
//		rbc.getExpyearlink().sendKeys(fUtil.getDataFromproperty("yrexp"));
		//rbc.getOrdercnflink().click();
		
		
		
		

		
		
		rbc.getDltacntlink().click();
		rbc.getDltacctcntlink().click();
		Thread.sleep(5000);
	}
}

//8217695152 2402
