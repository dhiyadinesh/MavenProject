package com.MavenProject.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_AddNewCus_003 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C://Drivers//geckodriver-v0.23.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://admin-demo.nopcommerce.com/");
		
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		
		//customer
		driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a/p")).click();
		//customer list
		driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a/p")).click();
		
		Thread.sleep(3000);
		//add new
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/form[1]/div/div/a")).click();
		
		//customer details
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("dhivya@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("divya@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Divya");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("sri");
		
		WebElement rdfemale=driver.findElement(By.xpath("//*[@id=\'Gender_Female\']"));
		rdfemale.click();
		System.out.println(rdfemale.isSelected());
		
		driver.findElement(By.xpath("//*[@id=\'DateOfBirth\']")).sendKeys("10/12/1996");
		
		driver.findElement(By.id("Company")).sendKeys("Tecknow");
		//tax
		WebElement chktax= driver.findElement(By.id("IsTaxExempt"));
		chktax.click();
		//newsletter
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/section/div/div/nop-cards/nop-card/div/div[2]/div[9]/div[2]/div/div[1]/div/div")).click();
		WebElement ystory=driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/ul/li[1]"));
		ystory.click();
		
		//company roles
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/section/div/div/nop-cards/nop-card/div/div[2]/div[10]/div[2]/div/div[1]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/ul/li[5]")).click();
		
		//Manager of vendor
		
		WebElement ven=driver.findElement(By.id("VendorId"));
		Select slc=new Select(ven);
		slc.selectByVisibleText("Vendor 2");
		
		//admincmt
		
		driver.findElement(By.id("AdminComment")).sendKeys("This is for practise................");
		
		//save
		driver.findElement(By.name("save")).click();
		
				
			
	}

}
