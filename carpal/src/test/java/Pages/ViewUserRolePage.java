package Pages;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ViewUserRolePage extends BasePage {

	public ViewUserRolePage(WebDriver driver) {
		super(driver);
	}

	//********************Web Elements***************************
	
	By listuserBy = By.partialLinkText("List of User Roles");
	By searchfieldBy = By.className("form-control");
	By userroleBy = By.partialLinkText("Role");
	By updateBy = By.className("btn");
	long millis = System.currentTimeMillis();
	

	//***********************Page Methods*****************************
	
	public ViewUserRolePage viewuserrole (String query) throws AWTException {
		
		click(listuserBy);
		ajax_wait(3000);
		click_list(searchfieldBy,0);
		driver.findElements(searchfieldBy).get(0).sendKeys("Test");
		ajax_wait(3000);
		click(userroleBy);
		ajax_wait(3000);
		Assert.assertTrue(driver.findElement(updateBy).isDisplayed());
		
	return this;
	}
}
