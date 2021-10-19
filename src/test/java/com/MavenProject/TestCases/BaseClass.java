package com.MavenProject.TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import com.MavenProject.Utilitis.ReadConfig;

public class BaseClass {
	
	ReadConfig rdconfig=new ReadConfig();
	
	public String baseURL=rdconfig.getApplicationURL();
	public String username=rdconfig.getusername();
	public String password=rdconfig.getpassword();
	
	public static WebDriver driver;
	
	public static Logger logger;
	

	@BeforeTest
	public void setup() throws InterruptedException
	{
        FirefoxProfile profile=new FirefoxProfile();
		
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain,application/pdf"); // set Mime type according to your file format
		profile.setPreference("browser.download.manager.showWhenStarting", false);
				
		//download files in desired location
		profile.setPreference("browser.download.dir","C:\\Downloadedfiles");
		profile.setPreference("browser.download.folderList", 2); 
		profile.setPreference("pdfjs.disabled", true); // only for pdf file
		
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile);
				
        
		System.setProperty("webdriver.gecko.driver",rdconfig.getfirefoxpath());
		driver=new FirefoxDriver();
		
		
		
		logger=Logger.getLogger("MavenProject");
		PropertyConfigurator.configure("Log4j.properties");
		
		
		    
		
	}
	
   
	@AfterTest
	public void closebrowser() 
	{
		driver.close();
		
		
	}

   public void captureScreen(WebDriver driver, String tname) throws IOException
  
   {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
	FileUtils.copyFile(source, target);
	System.out.println("Screenshot taken");
   }
   
   public static String randomestring() 
   {
		String generatedString1 = RandomStringUtils.randomAlphabetic(8);
		return (generatedString1);
		
   }



     
}
