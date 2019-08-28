 package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {
public static void main(String[] args) {
	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com");
	
	try
	{
	Thread.sleep(5000);	
	driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}
	
	
	
	
	
	
	
}
