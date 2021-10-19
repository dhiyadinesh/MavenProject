package com.MavenProject.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletingCustomer 
{
	WebDriver ldriver;
	
	public DeletingCustomer(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
    @FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a/p") WebElement cust;
	
	@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a/p") WebElement custitem;
	
	@FindBy(name="SearchEmail") WebElement shemail;
	
	@FindBy(name="SearchFirstName") WebElement shfrtname;
	
	@FindBy(name="SearchLastName") WebElement shlstname;
	
	
	@FindBy(id="search-customers") WebElement srhbutton;
	
	@FindBy(xpath="//*[@id=\"customers-grid\"]/tbody/tr[1]/td[7]/a") WebElement edit;
	
	@FindBy(id="customer-delete") WebElement delete;
	
	public void ClickonCustomer()
	{
		cust.click();
	}
	
	public void ClickonCusItem()
	{
		custitem.click();
	}
	
	public void Setemail(String email)
	{
		shemail.sendKeys(email);
	}
	
	public void SetFrsName(String firstname)
	{
		shfrtname.sendKeys(firstname);
	}
	
	public void SetlstName(String lastname)
	{
		shlstname.sendKeys(lastname);
	}
	
	
	public void ClickOnSearch()
	{
		srhbutton.click();
	}
	
	public void ClickOnEdit()
	{
		edit.click();
	}

	public void ClickOnDelete()
	{
		delete.click();
	}
	

}
