package com.MavenProject.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="Email") WebElement txtemail;
	
	@FindBy(name="Password") WebElement txtpwd;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button") WebElement loginbtn;
	
	@FindBy(linkText="Logout") WebElement lnlogout;
	

	public void setusername(String uname)
	{
		txtemail.clear();
		txtemail.sendKeys(uname);
	}
	
	public void setpassword(String pwd)
	{
	
		txtpwd.clear();
		txtpwd.sendKeys(pwd);
	}
	public void clicklogin()
	{
		loginbtn.click();
	}
	
	public void clicklogout()
	{
		lnlogout.click();
	}
}
