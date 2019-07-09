package Tests;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Pages.CreateUserRolePage;
import Pages.UpdateUserRolePage;

public class UpdateUserRoleTest extends BaseTest {

	@Test (priority = 0)
    public void Update_user () throws AWTException {
 
        //*************PAGE INSTANTIATIONS*************
        UpdateUserRolePage UpdateUserRolePage = new UpdateUserRolePage(driver);
 
        //*************PAGE METHODS********************
        
        long millis = System.currentTimeMillis();
        UpdateUserRolePage.loggedinuserupdateRole("T" + millis);
 }	
}
