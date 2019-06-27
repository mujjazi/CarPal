package Tests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

public class LoginTests extends BaseTest {

	 @Test (priority = 0)
	    public void Login_Valid () {
	 
	        //*************PAGE INSTANTIATIONS*************
	        LoginPage LoginPage = new LoginPage(driver);
	 
	        //*************PAGE METHODS********************
	        LoginPage.logintocarpal("sysadmin", "Sys@admin21");
	 }
	 
	 
	 @Test (priority = 1)
	 public void Forgot_Password() {
		 
		 	//*************PAGE INSTANTIATIONS*************
	        LoginPage LoginPage = new LoginPage(driver);
	      
	        //*************PAGE METHODS********************
	        LoginPage.forgotpassword("mujtaba26@mailinator.com");
	        
	 } 
	 
}
