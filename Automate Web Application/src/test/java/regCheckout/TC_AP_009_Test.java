package regCheckout;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepository.checkoutReg;
import generic_utility.BaseClass;
import generic_utility.ListenerUtility;

@Listeners(ListenerUtility.class)
public class TC_AP_009_Test extends BaseClass{

	@Test
	
	public void regchkot() throws Exception {
		
		checkoutReg cr = new checkoutReg(driver);
		Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/","Home page is not displayed");
		Reporter.log("Home page displayed");
		
		cr.getAddtocartlinktop().click();
		cr.getViewcartlink().click();
		cr.getCartlink().click();
		cr.getProceedToCheckoutlink().click();
		cr.getRegisterLoginlink().click();
		cr.getSignupnamelink().sendKeys(fUtil.getDataFromproperty("username"));
		cr.getSignupemaillink().sendKeys("gb123456@gmail.com");
		cr.getSignupbtnlink().click();
		cr.getGenderlink().click();
		cr.getPasswordlink().sendKeys("Gb@1234");
		cr.getFirstnamelink().sendKeys("gb");
		cr.getLastnamelink().sendKeys("bg");
		cr.getCompanylink().sendKeys("ggg");
		cr.getAddresslink().sendKeys("jpn");
		cr.getStatelink().sendKeys("ka");
		cr.getCitylink().sendKeys("bng");
		cr.getZipcodelink().sendKeys("000000");
		cr.getMobilenumberlink().sendKeys("0000000000");
		cr.getCreateaccbtnlink().click();
		wUtil.notificationpopup(driver);
		Assert.assertEquals(cr.getAcccreatedmsglink().getText(), " ACCOUNT CREATED!"," 'ACCOUNT CREATED!'msg is not displayed");
		Reporter.log(" 'ACCOUNT CREATED!'msg is displayed");
		
		Assert.assertEquals(cr.getLgnusrnamelink().getText(), "' Logged in as username' ","' Logged in as username' msg is not displayed");
		Reporter.log(" ' Logged in as username'msg is displayed");
		
		cr.getCartlink2().click();
		cr.getProceedToCheckoutlink2();
		cr.getPlaceorderlink().click();
		cr.getNameoncardlink().sendKeys("gggb");
		cr.getCardnolink().sendKeys("1234567890");
		cr.getCvclink().sendKeys("123");
		cr.getExpmntlink().sendKeys("22");
		cr.getExpyearlink().sendKeys("2222");
		cr.getOrdercnflink().click();
		Assert.assertEquals(driver.getTitle(), "'Your order has been placed successfully!'","order placed msg is not displayed");
		Reporter.log("order placed msg is displayed");
		
		cr.getDltacctcntlink().click();
		Assert.assertEquals(cr.getAcntdltmsg().getText(), "ACCOUNT DELETED!","ACCOUNT DELETED! msg displayed");
		Reporter.log("ACCOUNT DELETED! msg displayed");
		
		cr.getDltacctcntlink().click();
		
	}
			
}
