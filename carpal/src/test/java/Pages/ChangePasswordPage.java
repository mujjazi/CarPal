package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ChangePasswordPage extends BasePage {

	public ChangePasswordPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//********************Web Elements***************************
	
	By accountBy = By.className("icon-face");
	By dropdownitemBy = By.cssSelector("a.dropdown-item");
	By currentpasswordBy = By.id("currentPassword");
	By newpasswordBy = By.id("newPassword");
	By confirmnewpasswordBy = By.id("confirmNewPassword");
	By setnewpasswordBy = By.cssSelector("button.btn.btn-primary.btn-block.mb-2");
	
	//***********************Page Methods*****************************
	
	public ChangePasswordPage changepassword(String cpass, String npass, String cnpass) {
		click(accountBy);
		WebElement elp = driver.findElements(dropdownitemBy).get(0);
		elp.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		writeText(currentpasswordBy,cpass);
		click(newpasswordBy);
		writeText(newpasswordBy,npass);
		click(confirmnewpasswordBy);
		writeText(confirmnewpasswordBy,cnpass);
		click(setnewpasswordBy);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String curURL = driver.getCurrentUrl();
		
		Assert.assertEquals(curURL,"http://35.232.136.118.xip.io/change-password");
		
		return this;
	}
	
	
	
	

}
