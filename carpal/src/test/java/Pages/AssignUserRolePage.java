package Pages;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AssignUserRolePage extends BasePage {

	public AssignUserRolePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//********************Web Elements***************************
	
		By listuserroleBy = By.partialLinkText("List of User Roles");
		By rolerightsBy = By.partialLinkText("Role Rights");
		By subClientBy = By.cssSelector("div.heading");
		By subclientBy = By.className("list-group-item");
		By checkboxBy = By.className("custom-control-label");
		By savebtnBy = By.className("btn");
		
		long millis = System.currentTimeMillis();
		
		//***********************Page Methods*****************************
		
		public AssignUserRolePage loggedinuserassignRole(String urolename) throws AWTException {
		
			click(listuserroleBy);
			ajax_wait();
			click(rolerightsBy);
			ajax_wait();
			WebElement els = driver.findElements(subClientBy).get(7);
			els.click();
			ajax_wait();
			click(subclientBy);
			
			WebElement elc = driver.findElements(checkboxBy).get(1);
			elc.click();
			
			click(savebtnBy);	
			ajax_wait();
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL, "http://35.232.136.118.xip.io/ma/list-role");

			
		return this;
		
		}
		
			
}
