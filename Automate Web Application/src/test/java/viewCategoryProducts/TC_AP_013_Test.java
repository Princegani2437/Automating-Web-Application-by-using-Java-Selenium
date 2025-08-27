package viewCategoryProducts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepository.viewcatProd;
import generic_utility.BaseClass;
import generic_utility.ListenerUtility;

@Listeners(ListenerUtility.class)

public class TC_AP_013_Test extends BaseClass{
	
	@Test
	
	public void viewcatProduct() {
		
		viewcatProd vcp = new viewcatProd(driver);
		
		wUtil.mousehover(driver, vcp.getCategorylink());
		
		Assert.assertEquals(vcp.getCategorylink().getText(), "CATEGORY", "Categories text is not visible");
		Reporter.log("Categories text is visible",true);
		
		vcp.getWomencatlink().click();
		vcp.getDresscatlink().click();
		
		Assert.assertEquals(driver.getTitle(), "Automation Exercise - Dress Products", "Dress product is not visible");
		Reporter.log("Dress product is visible",true);
		
		vcp.getMencatlink().click();
		vcp.getTshirtlink().click();
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/category_products/3", "Tshirt page is not visible");
		Reporter.log("Tshirt page is visible",true);
		
		
	}

}
