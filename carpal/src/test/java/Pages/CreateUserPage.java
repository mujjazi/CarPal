package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CreateUserPage extends BasePage {

	public CreateUserPage(WebDriver driver) {
		super(driver);
	}

	//********************Web Elements***************************
	
			By createuserroleBy = By.linkText("Create a User");
			By radiobtnBy = By.className("custom-control-label");
			By arrowdropdownBy = By.cssSelector("span.ng-arrow-wrapper");
			By nameBy = By.name("userName");
			By phonenumberBy = By.name("phonenumber");
			By emailBy = By.name("email");
			By checkboxBy = By.className("custom-control-label");
			By createuserbtnBy = By.name("createUser");
			
			long millis = System.currentTimeMillis();

			//***********************Page Methods*****************************
			
			public CreateUserPage loggedinusercreate(String uname) throws AWTException {
			
				click(createuserroleBy);
				ajax_wait(3000);
				click_list(radiobtnBy, 1);
				click_list(arrowdropdownBy,0);
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				writeText(phonenumberBy,"3322575892");
				writeText(nameBy, uname);
				writeText(emailBy,"uname" + "@mailinator.com");
				click(createuserbtnBy);
				
				ajax_wait(5000);
				String URL = driver.getCurrentUrl();
				Assert.assertEquals(URL,"http://35.232.136.118.xip.io/ma/list-user");
				return this;
			}
}


