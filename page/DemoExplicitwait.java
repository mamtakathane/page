package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoExplicitwait {
	
	
	public static void main(String[] args) {
		
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://seleniumpractise.blogspot.com/");
	driver.findElement(By.xpath(""));
	driver.findElement(By.xpath(""));
	
		
		
		
	}
	
	

}
