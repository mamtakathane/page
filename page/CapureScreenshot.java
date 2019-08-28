package com.page;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CapureScreenshot {
	@Test

	public void  CapureScreenshot() throws Exception
	{
		
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("http://www.facebook.com");
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mamta.kathane@gmail.com");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("aaaaaaaaaaaa");
	//driver.findElement(By.xpath("//[@id='loginbutton']")).click();
	
    TakesScreenshot ts =(TakesScreenshot)driver;
	
	File source = ts.getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(source,new File("./Screenshots/facebook.png"));
	System.out.println("Screenshot taken");
	
	
	driver.quit();
	
	
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
