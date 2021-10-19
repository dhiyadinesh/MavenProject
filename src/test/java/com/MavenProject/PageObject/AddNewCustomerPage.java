package com.MavenProject.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewCustomerPage
{
 public WebDriver ldriver;
 
 public AddNewCustomerPage(WebDriver rdriver)
 {
	 ldriver=rdriver;
	 PageFactory.initElements(rdriver, this);
 }
 
  By lnkcustomermenu=By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a");
  
  By lnkcustomermenuitem=By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a");
 
  By lnkaddnew=By.xpath("/html/body/div[3]/div[1]/form[1]/div/div/a"); 
  
  
  By txtemail=By.id("Email");
  By txtpwd=By.xpath("//*[@id=\'Password\']");
  By txtfirstname=By.xpath("//*[@id=\'FirstName\']");
  By txtlastname=By.xpath("//*[@id=\'LastName\']");
  
  By rdmale=By.xpath("//*[@id=\'Gender_Male\']");
  By rdfemale=By.xpath("//*[@id=\'Gender_Female\']");
  
  By txtdop=By.xpath("//*[@id=\'DateOfBirth\']");
  By txtcmpname=By.id("Company");
  By chkboxtax=By.id("IsTaxExempt");
  
  By txtnewsletter=By.xpath("/html/body/div[3]/div[1]/form/section/div/div/nop-cards/nop-card/div/div[2]/div[9]/div[2]/div/div[1]/div/div");
  By lstnletterystory=By.xpath("/html/body/div[5]/div/div[2]/ul/li[1]");
  By lstnlettertstory2=By.xpath("//*[@id=\"afeb26d3-93d6-47c2-a077-91f2393a1d33\"]");
  
  By txtcustomerrole=By.xpath("/html/body/div[3]/div[1]/form/section/div/div/nop-cards/nop-card/div/div[2]/div[10]/div[2]/div/div[1]/div/div");
  By lstitemadmini=By.xpath("/html/body/div[6]/div/div[2]/ul/li[1]");
  By lstitemfmoderator=By.xpath("/html/body/div[6]/div/div[2]/ul/li[2]");
  By lstitemguests=By.xpath("/html/body/div[6]/div/div[2]/ul/li[3]");
  By lstitemregistered=By.xpath("/html/body/div[6]/div/div[2]/ul/li[4]");
  By lstitemvendors=By.xpath("/html/body/div[6]/div/div[2]/ul/li[5]");
  
  By txtvendors=By.id("VendorId");
  By txtadmincmt=By.id("AdminComment");
  
  By btnsave=By.xpath("/html/body/div[3]/div[1]/form/div[1]/div/button[1]");
  
  
  public void ClickOncustomermenu()
  {
	  ldriver.findElement(lnkcustomermenu).click();
  }
  
  public void ClickOncustomermenuitem()
  {
	  ldriver.findElement(lnkcustomermenuitem).click();
  }
  
  public void ClickOnAddnew()
  {
	  ldriver.findElement(lnkaddnew).click();
  }
  
  public void SetEmail(String email)
  {
	  ldriver.findElement(txtemail).sendKeys(email);
  }
  
  public void setpwd(String pwd)
  {
	  ldriver.findElement(txtpwd).sendKeys(pwd);;
  }
  
  public void setfname(String fname)
  {
	  ldriver.findElement(txtfirstname).sendKeys(fname);
  }
  
  public void setlname(String lname)
  {
	  ldriver.findElement(txtlastname).sendKeys(lname);
  }
  
  public void Setgender(String gender)
  {
	  if(gender.equals("Male"))
	  {
	  ldriver.findElement(rdmale).click();
	  }
     
	 else if(gender.equals("Female"))
	 {
	  ldriver.findElement(rdfemale).click();
     }
	  
	 else
	 {
		 ldriver.findElement(rdfemale).click();
	 }
	  
  }
  
  public void Setdob(String dob)
  {
	  ldriver.findElement(txtdop).sendKeys(dob);;
  }
  
  public void SetComName(String Cname)
  {
	  ldriver.findElement(txtcmpname).sendKeys(Cname);
  }
  
  public void ClickOnTaxCheck()
  {
	  ldriver.findElement(chkboxtax).click();
  }
  
  public void SetNewsLetter(String letter)
  {
	  ldriver.findElement(txtnewsletter).click();
	  WebElement newsletter;
	  
	  switch(letter)
	  {
	  case "Your Story Name":
		  newsletter=ldriver.findElement(lstnletterystory);
		  break;
	  case "Test Story 2":
		  newsletter=ldriver.findElement(lstnlettertstory2);
		  break;
	  default:
	      newsletter=ldriver.findElement(lstnletterystory);
	  }
	  
	  JavascriptExecutor njs=(JavascriptExecutor) ldriver;
	  njs.executeScript("arguments[0].click()",newsletter);
  }
  
  public void SetcustomerRole(String role)
  {
	  ldriver.findElement(By.xpath("/html/body/div[3]/div[1]/form/section/div/div/nop-cards/nop-card/div/div[2]/div[10]/div[2]/div/div[1]/div/div/ul/li/span[2]")).click();
	  ldriver.findElement(txtcustomerrole).click();
	  WebElement lisitem;
	  
	  switch(role)
	  {
	  case "Administrators":
		  lisitem=ldriver.findElement(lstitemadmini);
		  break;
	  case "Forum Moderators":
		  lisitem=ldriver.findElement(lstitemfmoderator);
		  break;
	  case "Guests":
		  lisitem=ldriver.findElement(lstitemguests);
		  break;
	  case "Registered":
		  lisitem=ldriver.findElement(lstitemregistered);
		  break;
	  case "Vendors":
		  lisitem=ldriver.findElement(lstitemvendors);
		  break;
	  default:
		  lisitem=ldriver.findElement(lstitemguests);
		 
	  
	  }
	  
	  JavascriptExecutor js=(JavascriptExecutor)ldriver;
	  js.executeScript("arguments[0].click()", lisitem);
  }
  
  public void Setvendors()
  {
	  Select slc=new Select(ldriver.findElement(txtvendors));
	  slc.selectByVisibleText("Vendor 2");
  }
  
  public void SetAdmincmt(String comment)
  {
	  ldriver.findElement(txtadmincmt).sendKeys(comment);
  }
  
  public void ClickOnSave()
  {
	  ldriver.findElement(btnsave).click();
  }
  
  
  
  
  
  
  
  
  
  
  
  
}
