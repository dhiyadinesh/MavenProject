package com.MavenProject.TestCases;

import org.testng.annotations.Test;

import com.MavenProject.PageObject.EditCustomer;
import com.MavenProject.PageObject.LoginPage;

public class TC_EditCustomer_005 extends BaseClass
{
	@Test
	public void editcustomer() throws InterruptedException
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
		   
		   EditCustomer ec=new EditCustomer(driver);
		   Thread.sleep(2000);
		   
		   ec.ClickonCustomer();
		   Thread.sleep(2000);
		   
		   ec.ClickonCusItem();
		   Thread.sleep(2000);
		   
		   ec.SetFrsName("abc");
		   Thread.sleep(2000);
		   
		   ec.SetlstName("xyz");
		   Thread.sleep(2000);
		   
		   ec.ClickOnSearch();
		   Thread.sleep(2000);
		   
		   ec.ClickOnEdit();
		   Thread.sleep(2000);
		   
		   ec.ClickOnCmp();
		   Thread.sleep(2000);
		   
		   ec.SetCmpName("ABCD");
		   Thread.sleep(2000);
		   
		   ec.ClickOnSave();
		   
		  
		   
		   
		   
		
	}

}
