package com.MavenProject.TestCases;

import org.testng.annotations.Test;

import com.MavenProject.PageObject.DeletingCustomer;
import com.MavenProject.PageObject.LoginPage;

public class TC_DeletingCustomer_006 extends BaseClass
{
	@Test
	public void deletecustomer() throws InterruptedException
	{
		driver.get(baseURL);
		
		LoginPage lp=new LoginPage(driver);
		/*lp.setpassword(username);
		logger.info("Successfully put username");
		lp.setpassword(password);
		logger.info("Successfully put password");*/
		lp.clicklogin();
		
		   logger.info("Successfully Login");
		   
		   logger.info("Editing Customer Details.....................");
		   
		   DeletingCustomer dc=new DeletingCustomer(driver);
		   
		   dc.ClickonCustomer();
		   Thread.sleep(2000);
		   
		   dc.ClickonCusItem();
		   Thread.sleep(2000);
		   
		   dc.SetFrsName("abc");
		   Thread.sleep(2000);
		   
		   dc.SetlstName("xyz");
		   Thread.sleep(2000);
		   
		   dc.ClickOnSearch();
		   Thread.sleep(2000);
		   
		   dc.ClickOnEdit();
		   Thread.sleep(2000);
		   
		   dc.ClickOnDelete();
	}

}
