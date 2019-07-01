package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class UpdateBUPage extends BasePage {

	public UpdateBUPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//********************Web Elements***************************
	
		By viewbuBy = By.partialLinkText("View list of Business Units");
		By updatebulinkBy = By.partialLinkText("Test");
		By companynameBy = By.id("companyName");
		By btncreatebuBy = By.xpath("//*[contains(concat( \" \", @class, \" \" ), concat( \" \", \"btn-primary\", \" \" ))]");
		//***********************Page Methods*****************************
		
		public UpdateBUPage updatebu(String text) {

			click(viewbuBy);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			click(updatebulinkBy);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			writeText(companynameBy,text);
			WebElement scroll = driver.findElement(By.tagName("html"));
			scroll.sendKeys(Keys.END);
			
			waitVisibility(btncreatebuBy);
			click(btncreatebuBy);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL,"http://35.232.136.118.xip.io/ma/list-bu");
			return this;
		}
		

}
