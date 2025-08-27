package removeproductcart;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepository.removeprodfromCart;
import generic_utility.BaseClass;
import generic_utility.ListenerUtility;

@Listeners(ListenerUtility.class)
public class TC_AP_012_Test extends BaseClass{
	
	@Test
	
	public void removeproduct() {
		
		removeprodfromCart rpc = new removeprodfromCart(driver);
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/","Home page is not displayed");
		Reporter.log("Home page displayed",true);
		
		rpc.getAddtocartlinktop().click();
		rpc.getViewcart2().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/view_cart","Cart page is not displayed");
		Reporter.log("Cart page is displayed",true);
		
		rpc.getDeletebtnlink().click();
		Assert.assertEquals(rpc.getItemremovedlink().getText(), "Cart is empty!", "Cart is empty! messege is not displayed");
		Reporter.log("Cart is empty! messege is displayed",true);
		
		
		
	}

}
//Cart is empty! messege is not displayed expected [Cart is empty!] but found []
