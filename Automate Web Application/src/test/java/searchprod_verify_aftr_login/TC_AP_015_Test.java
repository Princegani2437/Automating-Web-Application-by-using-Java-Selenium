package searchprod_verify_aftr_login;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepository.searchprodandverify;
import generic_utility.BaseClass;
import generic_utility.ListenerUtility;

@Listeners(ListenerUtility.class)
public class TC_AP_015_Test extends BaseClass{

	@Test
	
	public void searchproductafterlogin() throws Exception {
		
		searchprodandverify spv = new searchprodandverify(driver);
		
		//wUtil.mousehover(driver, spv.getProductlink());
		spv.getProductlink().click();
		
		spv.getTxtfieldlink().sendKeys("tshirt");
		spv.getSearchbtnlink().click();
		
				
		Assert.assertEquals(spv.getSearchprodlink().getText(), "SEARCHED PRODUCTS","Searched Product is not visible");
		Reporter.log("Searched Product page is visible",true);
		
		wUtil.mousehover(driver, spv.getAddtocartlink());
		spv.getAddtocartlink().click();
		spv.getCntshpnglink().click();
		spv.getCartlink().click();
		spv.getSignuploginlink().click();
		
		spv.getLoginemaillink().sendKeys("gbqw1@gmail.com");
		spv.getLgnpswdlink().sendKeys(fUtil.getDataFromproperty("password"));
		spv.getLgnbtnlink().click();
		spv.getCartlink().click();
		
	//Verify that those products are visible in cart after login as well	
	}
}
