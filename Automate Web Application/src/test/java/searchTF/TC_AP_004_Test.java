package searchTF;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import ObjectRepository.Homepage;
import ObjectRepository.searchproduct;
import generic_utility.BaseClass;

@Test
public class TC_AP_004_Test extends BaseClass {

	public void clickonsearch() {
		Homepage hp = new Homepage(driver);
		hp.getProductslink();
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/","Home page is not displayed");
		//test.log(Status.INFO, "Home page displayed");
		
		searchproduct sp = new searchproduct(driver);
		Assert.assertEquals(driver.getTitle(), "Automation Exercise - Product Details","products list is not visible");
		//test.log(Status.INFO, "products list is visible");
		sp.getSearchproductlink().sendKeys("shirt");
		sp.getSubmitsearch().click();
	}
}
