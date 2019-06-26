package Pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	//URL
	
	String baseURL = "http://35.232.136.118.xip.io/login";
	
	//********************Web Elements***************************
	
	By usernameBy = By.name("userName");
	By passwordBy = By.name("password");
	By loginbtnBy = By.className("btn-primary");
	By forgotpwdbtnBy = By.partialLinkText("Forgot");
	By forgotemailBy = By.id("email");
	By resetBy = By.className("btn-primary");
	By toastBy = By.className("toast-close-button");
	By nextBy = By.cssSelector("span.loader");
	
	//***********************Page Methods*****************************
	
	public LoginPage logintocarpal(String username, String password) {

		writeText(usernameBy,username);
		writeText(passwordBy,password);
		click(loginbtnBy);
		
		waitVisibility(nextBy);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL,"http://35.232.136.118.xip.io/login-2fa");
		driver.navigate().back();
		return this;
	}
	
	public LoginPage forgotpassword(String username) {

		click(forgotpwdbtnBy);
		writeText(forgotemailBy,username);
		click(resetBy);
		driver.navigate().back();
		//writeText(passwordBy,password);
		//assertEquals(toastBy,"Notification");
		//System.out.print(isElementVisible(toastBy));
		//System.out.print(isElementPresent(toastBy));
	//	assertTrue(driver.findElement(toastBy).isDisplayed());
		return this;
	}

}
