package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

public class BaseTest {

	WebDriver driver;
	String baseURL = "http://35.232.136.118.xip.io";
	
	@BeforeClass
	public void driver() {
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Mujtaba.m\\Desktop\\Drivers\\geckodriver.exe");
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\Mujtaba.m\\Desktop\\Drivers\\chromedriver.exe");
	
	driver = new FirefoxDriver();
	FirefoxOptions firefoxoptions = new FirefoxOptions();
	firefoxoptions.addArguments("start-maximized");
	driver.get(baseURL +"/login");
	
	}

	
	@AfterClass
	public void CloseBrowser() {
		driver.quit();
	}
}