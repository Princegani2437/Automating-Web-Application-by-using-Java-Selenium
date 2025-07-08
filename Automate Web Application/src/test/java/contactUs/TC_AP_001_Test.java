package contactUs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import ObjectRepository.Homepage;
import ObjectRepository.contactuspage;
import generic_utility.BaseClass;
import generic_utility.ListenerUtility;

@Listeners(ListenerUtility.class)
public class TC_AP_001_Test extends BaseClass {

	
	@Test
	
	public void clickonContactUs() {
		Homepage hp = new Homepage(driver);
		hp.getContactuslink().click();
		
		contactuspage cus= new contactuspage(driver);
		
		Assert.assertEquals(cus.getGetintouch().getText(), "GET IN TOUCH","GET IN TOUCH is not displayed");
		
		cus.getNamelTF().sendKeys("Ganesh");
		cus.getEmailTF().sendKeys("ganeshbhat462@gmail.com");
		cus.getSubjectTF().sendKeys("Subject Text Field is displayed");
		cus.getMessageTF().sendKeys("messege Text Field is displayed");
		cus.getFiletypetobechoosen().sendKeys("E:\\Resume\\GANESH N BHAT.pdf");
		cus.getSubmitbutton().click();
		
		wUtil.handlealert(driver);
		
		Assert.assertEquals(cus.getSuccessmessage().getText(), "Success! Your details have been submitted successfully.","Success message is not visible");
		test.log(Status.INFO, "Success message is visible");
		
//		if(cus.getSuccessmessage().getText().contains("Success! Your details have been submitted successfully.")){
//			Reporter.log("Success message is visible");
//			}else {
//				Reporter.log("Success message is not visible");
//			}
		cus.getHomebutton().click();
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/","Home page is not displayed");
		test.log(Status.PASS, "Home page displayed");
	}
	
	
}
