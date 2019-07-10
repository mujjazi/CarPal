package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ViewBUPage extends BasePage {

	public ViewBUPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//********************Web Elements***************************
	
			By searchbuBy = By.partialLinkText("View list of Business Units");
			By searchfieldBy = By.className("form-control");
			By buBy = By.partialLinkText("Test");
			By updateBy = By.name("updateSubmit");
			long millis = System.currentTimeMillis();
			

			//***********************Page Methods*****************************
			
			public ViewBUPage searchBU (String query) throws AWTException {
				
				click(searchbuBy);
				ajax_wait(3000);
				click_list(searchfieldBy,0);
				driver.findElements(searchfieldBy).get(0).sendKeys("Test");
				ajax_wait(3000);
				click(buBy);
				ajax_wait(3000);
				Assert.assertTrue(driver.findElement(updateBy).isDisplayed());
				//Click on searched BU
				//Verify searched BU is appearing and correct
				
				return this;
			}
}
