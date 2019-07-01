package Tests;

import java.awt.AWTException;

import org.testng.annotations.Test;
import Pages.UpdateBUPage;

public class UpdateBUPageTest extends BaseTest {

	 @Test (priority = 0)
	    public void updatebu () throws AWTException {
	 
	        //*************PAGE INSTANTIATIONS*************
	        UpdateBUPage UpdateBUPage = new UpdateBUPage(driver);
	 
	        //*************PAGE METHODS********************
	        UpdateBUPage.updatebu("Updated");
	 }
}
