package Tests;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Pages.CreateUserPage;
import Pages.UpdateUserPage;

public class UpdateUserTest extends BaseTest {

	@Test (priority=0)
	public void Update_user () throws AWTException {
		 
        //*************PAGE INSTANTIATIONS*************
        UpdateUserPage UpdateUserPage = new UpdateUserPage(driver);
 
        //*************PAGE METHODS********************
        
        long millis = System.currentTimeMillis();
        UpdateUserPage.loggedinuserupdate("User" + millis);
 }	
}
