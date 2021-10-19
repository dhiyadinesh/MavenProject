package com.MavenProject.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.MavenProject.PageObject.LoginPage;
import com.MavenProject.PageObject.SearchCustomer;

public class TC_SearchCustomer_004 extends BaseClass
{
	
	@Test
	public void searchcustomer() throws InterruptedException
	{
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		/*lp.setpassword(username);
		logger.info("Successfully put username");
		lp.setpassword(password);
		logger.info("Successfully put password");*/
		lp.clicklogin();
		
		   logger.info("Successfully Login");
		   
		   logger.info("Searching Customer Details.....................");
		   
		   SearchCustomer srh=new SearchCustomer(driver);
		   
		   srh.ClickonCustomer();
		   srh.ClickonCusItem();
		   Thread.sleep(3000);
		   srh.Setemail("xyz@gmail.com");
		   Thread.sleep(3000);
		   srh.SetFrsName("abc");
		   
		   logger.info("Test Passed..................");
		   srh.SetlstName("xyz");
		   logger.info("Test Passed..................");
		   
		   
		   srh.ClickOnSearch();
		   
		   
	}

}
