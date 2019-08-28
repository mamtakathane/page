package com.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoImplicitwait {
public static void main(String[] args) {
	
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mamta.kathane@gmail.com");
	
	
}
	
	
	
	
	
	
}
