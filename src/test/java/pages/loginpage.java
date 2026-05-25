package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Basepage.constructer;

public class loginpage extends constructer {

	@FindBy(xpath = "//input[@id='txt-username']") WebElement email_fld;
	@FindBy(xpath = "//input[@id='txt-password']") WebElement password_fld;
	@FindBy(xpath = "//button[@id='btn-login']") WebElement sub_btn;
	@FindBy(xpath = "//a[@id='btn-make-appointment']") WebElement App_btn;
	@FindBy (xpath = "//h2[normalize-space()='Make Appointment']") WebElement varify_login;

	public loginpage(WebDriver driver) {
		super(driver);
	}
	
    public void email(String email) {
    	email_fld.sendKeys(email);
    	
    } 
    
    public void password(String password) {
    	password_fld.sendKeys(password);
    	
    }
    
    public void login_btn() {
    	sub_btn.submit();
    }
    
    public void appoint_btn() {
    	App_btn.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }
    
    public String varifylogin() {
       return varify_login.getText();
    	
    }
}
