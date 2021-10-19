package com.MavenProject.TestCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MavenProject.PageObject.LoginPage;
import com.MavenProject.Utilitis.XLutils;

public class TC_LoginDDT_002 extends BaseClass
{
	
    @Test(dataProvider="LoginData")
	public void logindata(String uname,String pwd) throws InterruptedException
	{
    	driver.get(baseURL);
    	
    	LoginPage lp=new LoginPage(driver);
   
		lp.setusername(uname);
		logger.info("Successfully put username");
		
		Thread.sleep(2000);
	
		lp.setpassword(pwd);
		logger.info("Successfully put password");
		
		lp.clicklogin();
		logger.info("Successfully Login");
		
		Thread.sleep(2000);
		
		if(driver.getTitle().equals("Dashboard / nopCommerce administration"))
		{
			Assert.assertTrue(true);
			System.out.println("Title is:Dashboard / nopCommerce administration");
			lp.clicklogout();
			
			logger.info("Successfully Logout");
		}
		else
		{
			//captureScreen(driver,"logintest");
			System.out.println("Failed");
		}
	}
	
    @DataProvider(name="LoginData")
    public String[][] getdata() throws IOException
    {
    	String path="C:\\Users\\keert\\eclipse-workspace\\MavenProject\\src\\test\\java\\com\\MavenProject\\TestData\\LoginData.xlsx";
    	int rownum=XLutils.getRowCount(path, "Sheet1");
    	int colcount=XLutils.getCellCount(path, "Sheet1", 1);
    	
    	String logindata[][]=new String [rownum][colcount];
    	
    	for(int i=1;i<=rownum;i++)
    	{
    		
    		
    		for(int j=1;j<colcount;j++)
    		{
    			logindata[i-1][j]=XLutils.getCellData(path, "Sheet1", i, j);
    		}
    	}
    	
    	return logindata;
    	
  
	
    }
}
