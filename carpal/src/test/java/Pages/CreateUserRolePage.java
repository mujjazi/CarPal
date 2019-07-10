package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CreateUserRolePage extends BasePage {

	public CreateUserRolePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

			//********************Web Elements***************************
	
			By createuserroleBy = By.partialLinkText("Create a User Role");
			By userRolewhoBy = By.className("custom-control-label");
			By dropdownBy = By.cssSelector("span.ng-arrow-wrapper");
			By userrolenameBy = By.id("userrolename");
			By createbtnBy = By.className("btn-primary");
			
			long millis = System.currentTimeMillis();
			
			//***********************Page Methods*****************************
			
			public CreateUserRolePage loggedinusercreateRole(String rolename) throws AWTException {
			
				click(createuserroleBy);
				ajax_wait(3000);
				
				click_list(userRolewhoBy,1);
				click(dropdownBy);
			
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				robot.keyPress(KeyEvent.VK_ESCAPE);
				robot.keyRelease(KeyEvent.VK_ESCAPE);
				click(userrolenameBy);
				writeText(userrolenameBy,rolename);
				click(createbtnBy);
				ajax_wait(3000);
			
				String URL = driver.getCurrentUrl();
				Assert.assertEquals(URL, "http://35.232.136.118.xip.io/ma/list-role");
		
			return this;
			
			}
	
}
