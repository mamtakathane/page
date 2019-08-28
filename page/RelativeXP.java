package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RelativeXP {
public static void main(String[] args) {

	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.gmail.com");
	
	driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("mamta.kathane@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("destination123");
	driver.findElement(By.xpath("//input[@id='signIn")).click();
	
	
	
	
}
	
	
	
	
	
	
}
