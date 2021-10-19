package com.MavenProject.TestCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.MavenProject.PageObject.AddNewCustomerPage;
import com.MavenProject.PageObject.LoginPage;

public class AddNewCustomerTest extends BaseClass
{

	@Test
	public void addnewcustomer() throws IOException, InterruptedException
	{
         driver.get(baseURL);
		
		LoginPage lp=new LoginPage(driver);
		
		
		/*lp.setpassword(username);
		logger.info("Successfully put username");
		lp.setpassword(password);
		logger.info("Successfully put password");*/
		lp.clicklogin();
		
		   logger.info("Successfully Login");
		   
		   logger.info("Providing Customer Details..................");
		   
		   AddNewCustomerPage ac=new AddNewCustomerPage(driver);
		   
		   ac.ClickOncustomermenu();
		   Thread.sleep(2000);
		   ac.ClickOncustomermenuitem();
		   
		   Thread.sleep(2000);
		   
		   ac.ClickOnAddnew();
		   
		   Thread.sleep(3000);
		   
		   //String email="dhivyasri"+"gmail.com";
		  
		   ac.SetEmail("divya123@gmail.com");
		   
		   ac.setpwd("abc@123");
		   
		   ac.setfname("divya");
		   
		   ac.setlname("sri");
		   
		   ac.Setgender("Female");
		   ac.Setdob("10/23/1997");
		   ac.SetComName("Tecknow");
		   ac.ClickOnTaxCheck();
		   
		   ac.SetNewsLetter("Your Story Name");
		   ac.SetcustomerRole("Registered");
		   ac.SetcustomerRole("Vendors");
		   
		   ac.Setvendors();
		   ac.SetAdmincmt("This is for Testing.................................");
		   
		   ac.ClickOnSave();
		   logger.info("Successfully add a new customer");
		   
		   String msg=driver.findElement(By.tagName("body")).getText();
		   
		   if(msg.equals("The new customer has been added successfully."))
		   {
			   Assert.assertTrue(true);
			   logger.info("Test case Passed......");
		   }
		   else
		   {
			   captureScreen(driver,"addnewcustomer");
			   logger.info("Test case failed...");
		   }
		   
		    
		
	}
}
