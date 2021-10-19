package com.MavenProject.Utilitis;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


import com.aventstack.extentreports.markuputils.MarkupHelper;

public class Reporting extends TestListenerAdapter {
	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extents;
	public ExtentTest logger;
	
    
	public void onStart(ITestContext tc)
	{
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repName="Test-Report-"+timeStamp+".html";
		
		htmlReporter=new ExtentHtmlReporter("C://Users//keert//eclipse-workspace//MavenProject//test-output"+repName);
		htmlReporter.loadXMLConfig(System.getProperty("user.dir")+ "/extent-config.xml");

		
		extents=new ExtentReports();
		
		extents.attachReporter(htmlReporter);
		extents.setSystemInfo("HostName", "localhost");
		extents.setSystemInfo("Environment", "QA");
		extents.setSystemInfo("User", "Keerthana");
		extents.setSystemInfo("OS", "Windows");
		extents.setSystemInfo("Browsers", "firefox");
		extents.setSystemInfo("Project", "MavenProject");
		
		htmlReporter.config().setDocumentTitle("Maven Test Project");
		htmlReporter.config().setReportName("Functional test Report");
		htmlReporter.config().setTheme(Theme.DARK);
		
	}
	
	public void onTestsuccess(ITestResult tr)
	{
		logger=extents.createTest(tr.getName());
		logger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
	}

    
	public void onTestFailure(ITestResult tr)
	{
		logger=extents.createTest(tr.getName());
		logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
		
		String screenshotpath=System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png";
		File f=new File(screenshotpath);
		if(f.exists())
		{
			try
			{
				logger.fail("Screenshot is below:" + logger.addScreenCaptureFromPath(screenshotpath));
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
		
		
		


		
	}

}

