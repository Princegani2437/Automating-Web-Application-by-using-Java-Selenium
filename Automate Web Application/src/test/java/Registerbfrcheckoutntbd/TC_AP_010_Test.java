package Registerbfrcheckoutntbd;

import org.testng.annotations.Test;

import ObjectRepository.regbfrcheckout;
import generic_utility.BaseClass;

public class TC_AP_010_Test extends BaseClass{

	@Test
	
	public void refbfrCheckout() {
		regbfrcheckout rbc = new regbfrcheckout(driver);
	}
}
