package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UpdateUserPage extends BasePage {

	public UpdateUserPage(WebDriver driver) {
		super(driver);
	}
	
	//********************Web Elements***************************
	
	By listusersroleBy = By.linkText("List of Users");
	By listusertestBy = By.partialLinkText("Test");
	By radiobtnBy = By.className("custom-control-label");
	By arrowdropdownBy = By.cssSelector("span.ng-arrow-wrapper");
	By nameBy = By.name("userName");
	By phonenumberBy = By.name("phonenumber");
	By emailBy = By.name("email");
	By checkboxBy = By.className("custom-control-label");
	By updateUserbtnBy = By.name("updateUser");
	
	long millis = System.currentTimeMillis();

	//***********************Page Methods*****************************
	
	public UpdateUserPage loggedinuserupdate(String uname) throws AWTException {

		
		click(listusersroleBy);
		ajax_wait(3000);
		click(listusertestBy);
		ajax_wait(3000);
		writeText(nameBy,"Updated");
		click(updateUserbtnBy);
		 ajax_wait(3000);
		 
		 String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL,"http://35.232.136.118.xip.io/ma/list-user");
		return this;
	}
	
}
