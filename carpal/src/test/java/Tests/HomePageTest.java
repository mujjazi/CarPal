package Tests;

import org.testng.annotations.Test;

import Pages.HomePage;

public class HomePageTest extends BaseTest {
	
	@Test(priority=0)
	public void createBUlink() throws InterruptedException {

		String createURL = "http://35.232.136.118.xip.io/ma/create-bu";
		   //*************PAGE INSTANTIATIONS*************
        HomePage HomePage = new HomePage(driver);
 
        //*************PAGE METHODS********************
        HomePage.createBUlink(createURL);
	}
	
	@Test(priority=1)
	public void viewBUlink() throws InterruptedException {

		String viewURL = "http://35.232.136.118.xip.io/ma/list-bu";
		
		   //*************PAGE INSTANTIATIONS*************
        HomePage HomePage = new HomePage(driver);
 
        //*************PAGE METHODS********************
        HomePage.viewBUlink(viewURL);
		
	}

}