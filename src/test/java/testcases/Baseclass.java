package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class Baseclass {
	protected WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String browser) {
		
		//FOR ONLY SINGLE BROWSER
		driver = new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
		
		
		//FOR CROSS  BROWSER
		
		
//		if (browser.equalsIgnoreCase("chrome")) {
//			driver= new ChromeDriver();
//		}
//		else if (browser.equalsIgnoreCase("Edge")) {
//			
//			driver = new EdgeDriver();
//		}
//		
//		driver.get("https://katalon-demo-cura.herokuapp.com/");
// 		driver.manage().window().maximize();
// 		
}
 
	@AfterClass
	public void teardown() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.close();
		
	}
}
