package com.MavenProject.TestCases;

import org.testng.annotations.Test;

import com.MavenProject.PageObject.ExportXMLFile;
import com.MavenProject.PageObject.LoginPage;

public class TC_ExportCustomer_007 extends BaseClass
{
	@Test
	public void exportcustomer() throws InterruptedException
	{
		
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		/*lp.setpassword(username);
		logger.info("Successfully put username");
		lp.setpassword(password);
		logger.info("Successfully put password");*/
		lp.clicklogin();
		
		   logger.info("Successfully Login");
		   
		   logger.info("Exporting Customer Details using XML.....................");
		   
		   ExportXMLFile ef=new ExportXMLFile(driver);
		   
           Thread.sleep(2000);
		   
		   ef.ClickonCustomer();
		   Thread.sleep(2000);
		   
		   ef.ClickonCusItem();
		   Thread.sleep(2000);
		   
		   //ef.SltCus2();
		   Thread.sleep(2000);
		   
		   //ef.SltCus4();
		   Thread.sleep(2000);
		   
		   ef.ClickOnExport();
		   Thread.sleep(2000);
		   
		   ef.ClickOnExportAll();
		   Thread.sleep(2000);
		   
		   logger.info("Successfully exporting xml file");
	}

}
