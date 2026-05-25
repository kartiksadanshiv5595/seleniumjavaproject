package Basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class constructer {
	protected  WebDriver driver;
	
	public constructer(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	

}
