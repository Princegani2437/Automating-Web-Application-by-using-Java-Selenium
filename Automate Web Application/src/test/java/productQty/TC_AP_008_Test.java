package productQty;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepository.prodQty;
import generic_utility.BaseClass;
import generic_utility.ListenerUtility;

@Listeners(ListenerUtility.class)
public class TC_AP_008_Test extends BaseClass {

	@Test
	
	public void checkaddqty() {
		
		prodQty pq = new prodQty(driver);
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/","Home page is not displayed");
		Reporter.log("Home page displayed");
		wUtil.scrolling(driver, pq.getViewProductlink());
		pq.getViewProductlink().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/product_details/1","Product Deatails page is not displayed");
		Reporter.log("Product Deatails page is displayed");
		 
		pq.getQtylink().clear();
		pq.getQtylink().sendKeys("4");
		pq.getAddtocartbtnlink().click();
		pq.getViewcartlink().click();
		 
		
	}
}
