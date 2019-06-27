package Tests;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Pages.CreateBUPage;

public class CreateBUTest extends BaseTest {

	 @Test (priority = 0)
	    public void Create_BU () throws AWTException {
	 
	        //*************PAGE INSTANTIATIONS*************
	        CreateBUPage CreateBUPage = new CreateBUPage(driver);
	 
	        //*************PAGE METHODS********************
	        CreateBUPage.loggedinusercreateBU("Test", "Test");
	 }
	
}
