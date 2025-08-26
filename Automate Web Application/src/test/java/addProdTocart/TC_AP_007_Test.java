package addProdTocart;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import ObjectRepository.addToCart;
import generic_utility.BaseClass;
import generic_utility.ListenerUtility;

@Listeners(ListenerUtility.class)
public class TC_AP_007_Test extends BaseClass{

	@Test
	
	public void clickoncart() {
		
		addToCart apc = new addToCart(driver);
		Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/","Home page is not displayed");
		Reporter.log("Home page displayed",true);
		
		apc.getProductsclicklink().click();
		
		wUtil.mousehover(driver, apc.getAddtocartlinktop());
		
		apc.getAddtocartlinktop().click();
		apc.getContinueShoppinglink().click();
		apc.getAddtocartlinktshirt().click();
		apc.getViewcartlink().click();
		
		Assert.assertEquals(apc.getShoppingCartlink().getSize(), "2","Expected 2 products is not in the cart");
		Reporter.log("Expected 2 products in the cart",true);
		
		//wUtil.switchtowindow(driver, null)
		
	}
}
