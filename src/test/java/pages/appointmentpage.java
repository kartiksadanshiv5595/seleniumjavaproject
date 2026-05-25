package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Basepage.constructer;

public class appointmentpage extends constructer {

	public appointmentpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (id="combo_facility") WebElement Facility_dpdn;
	@FindBy (xpath= "//input[@id='chk_hospotal_readmission']") WebElement checkbox_dpdn;
	@FindBy (xpath= "//input[@value='Medicaid']") WebElement radio_btn;
	@FindBy (xpath= "//input[@id='txt_visit_date']") WebElement calenderdate;
	@FindBy (xpath= "//textarea[@id='txt_comment']") WebElement txt_area;
	@FindBy (xpath= "//button[@type='submit']") WebElement Book_btn;
	@FindBy (xpath= "//h2[normalize-space()='Appointment Confirmation']") WebElement APP_Confirm;
   	
	//Select Dropdown value 
	public void selectdrodpown(String value) {
		Select sc = new Select(Facility_dpdn);
		sc.selectByVisibleText(value);
		
	}
	
	public void selectcheckbox() {
		checkbox_dpdn.click();
	}
	
	public void radio_btn() {
		radio_btn.click();
	}
	public void dateselect(String date) {
		calenderdate.sendKeys(date);
	}
	
	public void commentadd(String comment) {
		
		txt_area.sendKeys(comment);
	}

	public void book_btn() {
		Book_btn.click();
	}
	
	public String App_varify() {
		 return APP_Confirm.getText();	
	}
	
}
