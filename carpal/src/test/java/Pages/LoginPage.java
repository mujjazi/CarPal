package Pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//********************Web Elements***************************
	
	By usernameBy = By.name("userName");
	By passwordBy = By.name("userName");
	By loginbtnBy = By.className("btn-primary");
	By forgotpwdbtnBy = By.partialLinkText("Forgot");
	By forgotemailBy = By.id("email");
	By resetBy = By.className("btn-primary");
	By toastBy = By.className("toast-close-button");
	
	//***********************Page Methods*****************************
	
	public LoginPage logintocarpal(String username, String password) {

		writeText(usernameBy,username);
		writeText(passwordBy,password);
		return this;
	}
	
	public LoginPage forgotpassword(String username) {

		click(forgotpwdbtnBy);
		writeText(forgotemailBy,username);
		click(resetBy);
		//writeText(passwordBy,password);
		//assertEquals(toastBy,"Notification");
		System.out.print(isElementVisible(toastBy));
		System.out.print(isElementPresent(toastBy));
	//	assertTrue(driver.findElement(toastBy).isDisplayed());
		return this;
	}

}
