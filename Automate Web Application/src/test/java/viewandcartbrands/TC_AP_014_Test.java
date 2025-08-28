package viewandcartbrands;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepository.viewandcart;
import generic_utility.BaseClass;
import generic_utility.ListenerUtility;

@Listeners(ListenerUtility.class)

public class TC_AP_014_Test extends BaseClass {

	
	@Test
	
	public void brandcart() {
		
		viewandcart vac = new viewandcart(driver);
		
		vac.getProductlink().click();
		
		wUtil.mousehover(driver, vac.getBrandlink());
		Assert.assertEquals(vac.getBrandlink().getText(), "BRANDS","Brands text is not visible");
		Reporter.log("Brands text is visible",true);
		
		vac.getPololink().click();
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/brand_products/Polo","POLO brand is not visible");
		Reporter.log("POLO brand is visible",true);
		
		
	}
}
