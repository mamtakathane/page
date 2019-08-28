package com.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AA {

	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("file:///E:/Selenium%20Software/Offline%20Website/index.html");
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
	driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button")).click();
	driver.close();
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
