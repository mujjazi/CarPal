package Tests;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Pages.AssignUserRolePage;
import Pages.CreateUserPage;

public class CreateUserTest extends BaseTest {

	@Test (priority=0)
	public void Create_user () throws AWTException {
		 
        //*************PAGE INSTANTIATIONS*************
        CreateUserPage CreateUserPage = new CreateUserPage(driver);
 
        //*************PAGE METHODS********************
        
        long millis = System.currentTimeMillis();
        CreateUserPage.loggedinusercreate("User" + millis);
 }	
}
