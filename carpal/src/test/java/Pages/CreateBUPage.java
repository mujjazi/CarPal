package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class CreateBUPage extends BasePage {

	public CreateBUPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//********************Web Elements***************************
	
		By createbuBy = By.partialLinkText("Create a New Business Unit");
		By companynameBy = By.id("companyName");
		By companydescriptionBy = By.id("companydescription");
		By countriesBy = By.className("ng-input");
		By dropdownBy = By.cssSelector(".ng-option-marked");
		By trnBy = By.id("trnNumber");
		By companyphonenumberBy = By.id("companyphonenumber");
		By cityBy = By.id("city");
		By areaBy = By.id("area");
		By addressBy = By.id("address1");
		By landmarkBy = By.id("landmark");
		By contactpersonBy = By.id("contactperson");
		By contactpersonphoneBy = By.id("contactpersonphonenumber");
		By contactpersonemailBy = By.id("contactpersonemail");
		By btnBy = By.cssSelector(".btn-primary , .btn-secondary");
		By btncreatebuBy = By.xpath("//*[contains(concat( \" \", @class, \" \" ), concat( \" \", \"btn-primary\", \" \" ))]");
		
		long millis = System.currentTimeMillis();
		
		//***********************Page Methods*****************************
		
		public CreateBUPage loggedinusercreateBU(String companyname, String companydescription) throws AWTException {
			
			
			click(createbuBy);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			click(companynameBy);
			writeText(companynameBy,companyname);
			click(companydescriptionBy);
			writeText(companydescriptionBy,companydescription);
			WebElement el = driver.findElements(countriesBy).get(1);
			el.click();
			WebElement el1 = driver.findElements(dropdownBy).get(0);
			el1.click();
			writeText(trnBy,"1231212124");
			writeText(companyphonenumberBy,"1234567");
			writeText(cityBy,"Islamabad");
			writeText(areaBy,"F-7");
			writeText(addressBy,"Islamabad");
			writeText(landmarkBy,"None");
			writeText(contactpersonBy,"Mujtaba Automated");
			writeText(contactpersonphoneBy,"12345678");
			writeText(contactpersonemailBy,"mujtaba+"+ millis + "@mailinator.com");
			
			WebElement el2 = driver.findElements(btnBy).get(0);
			el2.click();
			StringSelection ss = new StringSelection("C:\\Users\\Mujtaba.m\\Desktop\\CarPal-POM\\carpal\\src\\test\\resources\\Images\\icn.PNG");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			
			Robot robot = new Robot();

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			WebElement scroll = driver.findElement(By.tagName("html"));
			scroll.sendKeys(Keys.END);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
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
		//	driver.navigate().back();
			return this;
		}
		
}
