package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class UpdateUserRolePage extends BasePage {

	public UpdateUserRolePage(WebDriver driver) {
		super(driver);
	}

	//********************Web Elements***************************
	
	By listuserroleBy = By.partialLinkText("List of User Roles");
	By listuserroletestBy = By.partialLinkText("TESTROL");
	By userRolewhoBy = By.className("custom-control-label");
	By dropdownBy = By.cssSelector("span.ng-arrow-wrapper");
	By userrolenameBy = By.id("userrolename");
	By updatebtnBy = By.className("btn");
	
	long millis = System.currentTimeMillis();
	
	//***********************Page Methods*****************************
	
	public UpdateUserRolePage loggedinuserupdateRole(String urolename) throws AWTException {
	
		
	click(listuserroleBy);
	ajax_wait(3000);
		
	click(listuserroletestBy);
	ajax_wait(3000);
	click(userrolenameBy);
	writeText(userrolenameBy,urolename);
	click(updatebtnBy);
	ajax_wait(5000);
	String URL = driver.getCurrentUrl();
	Assert.assertEquals(URL, "http://35.232.136.118.xip.io/ma/list-role");

	return this;
	}
	
}
