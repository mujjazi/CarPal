package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	String baseURL = "http://35.232.136.118.xip.io";
	
	//********************Web Elements***************************
	
	By createbuBy = By.partialLinkText("Create a New Business Unit");
	By viewbuBy = By.partialLinkText("View list of Business Units");
		
		//***********************Page Methods*****************************
		
		public HomePage createBUlink(String url) throws InterruptedException {
			click(createbuBy);
			Thread.sleep(4000);
			String currURL = driver.getCurrentUrl();
			Assert.assertEquals(currURL, url);
			driver.navigate().back();
			return this;
		}
		
		public HomePage viewBUlink(String url) throws InterruptedException {
			click(viewbuBy);
			Thread.sleep(4000);
			String currURL = driver.getCurrentUrl();
			Assert.assertEquals(currURL, url);
			
			return this;
		}
	
}
