package com.MavenProject.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExportXMLFile 
{
	WebDriver ldriver;
	
	public ExportXMLFile(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
    @FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a/p") WebElement cust;
	
	@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a/p") WebElement custitem;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/form[1]/div/div/div/button[2]") WebElement exportarrow;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/form[1]/div/div/div/ul/li[1]/button") WebElement exportall;
	
	@FindBy(xpath="//*[@id=\"exportxml-selected\"]") WebElement exportselected;
	
	@FindBy(xpath="//*[@id=\"customers-grid\"]/tbody/tr[1]/td[1]/input") WebElement chkbox1;
	
	@FindBy(xpath="//*[@id=\"customers-grid\"]/tbody/tr[2]/td[1]") WebElement chkbox2;
	
	@FindBy(xpath="//*[@id=\"customers-grid\"]/tbody/tr[3]/td[1]/input") WebElement chkbox3;
	
	@FindBy(xpath="//*[@id=\"customers-grid\"]/tbody/tr[4]/td[1]") WebElement chkbox4;
	
	@FindBy(xpath="//*[@id=\"customers-grid\"]/tbody/tr[5]/td[1]/input") WebElement chkbox5;
	
	public void ClickonCustomer()
	{
		cust.click();
	}
	
	public void ClickonCusItem()
	{
		custitem.click();
	}
	
	public void SltCus1()
	{
		chkbox1.click();
	}
	
	public void SltCus2()
	{
		chkbox2.click();
	}
	
	public void SltCus3()
	{
		chkbox3.click();
	}
	
	public void SltCus4()
	{
		chkbox4.click();
	}
	
	public void SltCus5()
	{
		chkbox5.click();
	}
	
	public void ClickOnExport()
	{
		exportarrow.click();
	}
	
	public void ClickOnExportAll()
	{
		exportall.click();
	}
	
	public void ClickOnExportSelected()
	{
		exportselected.click();
	}
	
	
	

}
