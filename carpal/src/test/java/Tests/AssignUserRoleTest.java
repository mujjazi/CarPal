package Tests;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Pages.AssignUserRolePage;
import Pages.UpdateUserRolePage;

public class AssignUserRoleTest extends BaseTest {
	
	@Test (priority=0)
	public void Assign_role () throws AWTException {
		 
        //*************PAGE INSTANTIATIONS*************
        AssignUserRolePage AssignUserRolePage = new AssignUserRolePage(driver);
 
        //*************PAGE METHODS********************
        
        long millis = System.currentTimeMillis();
        AssignUserRolePage.loggedinuserassignRole("T" + millis);
 }	
	
}
