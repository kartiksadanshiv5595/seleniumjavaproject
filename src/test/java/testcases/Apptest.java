package testcases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.appointmentpage;
import pages.loginpage;

public class Apptest extends Baseclass {
 
	 @Test
	 public void appointment_book() {
		 
		 loginpage lp= new loginpage(driver);
			lp.appoint_btn();
			lp.email("John Doe");
			lp.password("ThisIsNotAPassword");
			lp.login_btn();
		 
			String act =lp.varifylogin();
	       Assert.assertEquals(act,"Make Appointment");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		 appointmentpage ap = new appointmentpage(driver);
		 ap.commentadd("this is the appointment book from here...");
		 ap.radio_btn();
		 ap.selectcheckbox();
		 ap.dateselect("30/07/2026");
		 ap.book_btn();
		 
		 String acts = ap.App_varify();
		 Assert.assertEquals(acts, "Appointment Confirmation" );
	 
	 }
}
