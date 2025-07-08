package productdetails;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import ObjectRepository.Homepage;
import ObjectRepository.Productpage;
import generic_utility.BaseClass;
import generic_utility.ListenerUtility;

@Listeners(ListenerUtility.class)
@Test
public class TC_AP_003_Test  extends BaseClass {
	
	public void clickonallproducts() {
	Homepage hp = new Homepage(driver);
	
	Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/","Home page is not displayed");
	test.log(Status.INFO, "Home page displayed");
	
	hp.getProductslink().click();
	
	Assert.assertEquals(driver.getTitle(), "Automation Exercise - Product Details","products list is not visible");
	test.log(Status.INFO, "products list is visible");
	
	Productpage pd = new Productpage(driver);
//	WebElement vp = pd.getBluetopviewproduct();
//	wUtil.scrolling(driver, vp);
	pd.getBluetopviewproduct().click();
	
	}
}
