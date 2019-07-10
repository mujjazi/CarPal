package Tests;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Pages.ViewBUPage;
import Pages.ViewUserRolePage;

public class ViewUserRoleTest extends BaseTest {
	
	@Test (priority=0)
	public void  viewuserrole() throws AWTException {
		

        //*************PAGE INSTANTIATIONS*************
        ViewUserRolePage ViewUserRolePage = new ViewUserRolePage(driver);
 
        //*************PAGE METHODS********************
        ViewUserRolePage.viewuserrole("Test");
	}
	
}
