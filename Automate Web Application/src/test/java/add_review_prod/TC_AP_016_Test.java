package add_review_prod;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepository.reviewonprod;
import generic_utility.BaseClass;
import generic_utility.ListenerUtility;

@Listeners(ListenerUtility.class)
public class TC_AP_016_Test extends BaseClass{

	@Test
	
	public void Addreview() throws Exception {
		
		reviewonprod rop = new reviewonprod(driver);
		
		rop.getProductlink().click();
		Assert.assertEquals(driver.getTitle(), "Automation Exercise - All Products","All product is not visible");
		Reporter.log("ll product is visible",true);
		
		rop.getViewprodlink().click();
		
		wUtil.mousehover(driver, rop.getReviewtxtlink());
		
		Assert.assertEquals(rop.getReviewtxtlink().getText(), "WRITE YOUR REVIEW","Write Your Review is not visible");
		Reporter.log("Write Your Review is visible",true);
		
		rop.getNamelink().sendKeys(fUtil.getDataFromproperty("username"));
		rop.getEmaillink().sendKeys("gbqw1@gmail.com");
		rop.getReviewlink().sendKeys(fUtil.getDataFromproperty("description"));
		rop.getReviewbtnlink().click();
		
	}
	
}
