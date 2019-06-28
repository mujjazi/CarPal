package Tests;

import java.awt.AWTException;

import org.testng.annotations.Test;
import Pages.ViewBUPage;

public class ViewBUPageTest extends BaseTest {

	@Test (priority = 0)
    public void searchBU () throws AWTException {
 
        //*************PAGE INSTANTIATIONS*************
        ViewBUPage ViewBUPage = new ViewBUPage(driver);
 
        //*************PAGE METHODS********************
        ViewBUPage.searchBU("Test");
	}

}
