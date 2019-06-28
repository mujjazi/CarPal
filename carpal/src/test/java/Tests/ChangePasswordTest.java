package Tests;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Pages.ChangePasswordPage;;

public class ChangePasswordTest extends BaseTest {

	@Test (priority = 0)
    public void changepassword () throws AWTException {
 
        //*************PAGE INSTANTIATIONS*************
        ChangePasswordPage ChangePasswordPage = new ChangePasswordPage(driver);
 
        //*************PAGE METHODS********************
        ChangePasswordPage.changepassword("Sys@admin21","Sys@admin211","Sys@admin211");
	}
	
}
