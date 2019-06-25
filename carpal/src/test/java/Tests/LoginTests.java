package Tests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

public class LoginTests extends BaseTest {

	 @Test (priority = 1)
	    public void Login_Valid () {
	 
	        //*************PAGE INSTANTIATIONS*************
	        LoginPage LoginPage = new LoginPage(driver);
	 
	        //*************PAGE METHODS********************
	        LoginPage.logintocarpal("onur@swtestacademy.com", "11223344");
	       
	 }
	 
	 
	 @Test (priority = 0)
	 public void Forgot_Password() {
		 
		 	//*************PAGE INSTANTIATIONS*************
	        LoginPage LoginPage = new LoginPage(driver);
	      
	        //*************PAGE METHODS********************
	        LoginPage.forgotpassword("mujtaba@mailinator.com");
	 } 
	 
}
