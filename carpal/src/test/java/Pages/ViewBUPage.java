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
	
			By searchbuBy = By.partialLinkText("Create a New Business Unit");
			By companynameBy = By.id("companyName");
	
			long millis = System.currentTimeMillis();
			

			//***********************Page Methods*****************************
			
			public ViewBUPage searchBU (String query) throws AWTException {
				
				click(searchbuBy);
				writeText(searchbuBy,query);
				//Click on searched BU
				//Verify searched BU is appearing and correct
				
				return this;
			}
}
