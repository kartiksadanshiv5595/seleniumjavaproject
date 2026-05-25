package testcases;


import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.loginpage;

public class logintest extends Baseclass {
	
	@Test
	public  void login() {
		
		loginpage lp= new loginpage(driver);
		lp.appoint_btn();
		lp.email("John Doe");
		lp.password("ThisIsNotAPassword");
		lp.login_btn();
	 
		String act =lp.varifylogin();
       Assert.assertEquals(act,"Make Appointment");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	
	
}
