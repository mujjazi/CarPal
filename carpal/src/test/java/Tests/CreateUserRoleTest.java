package Tests;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Pages.CreateBUPage;
import Pages.CreateUserRolePage;

public class CreateUserRoleTest extends BaseTest {

	@Test (priority = 0)
    public void Create_user () throws AWTException {
 
        //*************PAGE INSTANTIATIONS*************
        CreateUserRolePage CreateUserRolePage = new CreateUserRolePage(driver);
 
        //*************PAGE METHODS********************
        
        long millis = System.currentTimeMillis();
        CreateUserRolePage.loggedinusercreateRole("TestRoleName" + millis);
 }
}
