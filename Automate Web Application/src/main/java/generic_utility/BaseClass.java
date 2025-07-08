package generic_utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import ObjectRepository.Homepage;
import ObjectRepository.Loginpage;
import ObjectRepository.Productpage;
import generic_utility.File_utility;
import generic_utility.Java_utility;
import generic_utility.Webdriver_utility;

public class BaseClass {

	public Java_utility jUtil = new Java_utility();
	public static ExtentReports ereport;
	public Webdriver_utility wUtil= new Webdriver_utility();
	public static WebDriver driver;
	public File_utility fUtil = new File_utility();
	public static ExtentTest test;
	
	
	@BeforeSuite
	public void reportconfig() {
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_Report/ExtentReport_"+jUtil.getSystemtime()+".html");
		ereport=new ExtentReports();
		ereport.attachReporter(spark);
	}
	
	@BeforeClass
	public void openBrowser() throws Exception {
		driver = new ChromeDriver();
		wUtil.maximize(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(fUtil.getDataFromproperty("url"));
	}
//	@BeforeMethod
//	public void login() throws Exception {
//		Welcomepage wp = new Welcomepage(driver);
//		wp.getSignupLoginlink().click();
//		
//		Loginpage lp = new Loginpage(driver);
//		lp.getUsernameTF().sendKeys(fUtil.getDataFromproperty("username"));
//		lp.getPasswordTF().sendKeys(fUtil.getDataFromproperty("password"));
//	}
//	@AfterMethod
//	public void logout() {
//		Homepage hp = new Homepage(driver);
//		hp.getLogoutlink().click();
//	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	
	
	@AfterSuite
	public void reportBackup() {
		ereport.flush();
		ereport.flush();
	}
}
