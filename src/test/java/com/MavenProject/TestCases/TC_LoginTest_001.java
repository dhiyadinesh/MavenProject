package com.MavenProject.TestCases;



import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import org.testng.annotations.Test;

import com.MavenProject.PageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	
	@Test
	public void logintest() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		
		LoginPage lp=new LoginPage(driver);
	
		lp.setusername(username);
		logger.info("Successfully put username");
		Thread.sleep(2000);
		
		lp.setpassword(password);
		logger.info("Successfully put password");
		lp.clicklogin();
		logger.info("Successfully Login");
		
		Thread.sleep(5000);
		
		if(driver.getTitle().equals("Dashboard / nopCommerce administration"))
		{
			Assert.assertTrue(true);
			System.out.println("Title is:Dashboard / nopCommerce administration");
			lp.clicklogout();
			
			logger.info("Successfully Logout");
		}
		else
		{
			captureScreen(driver,"logintest");
			System.out.println("Failed");
		}
		
		
	}
	
	

}
