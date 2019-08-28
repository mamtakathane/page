package com.page;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class cookies {
	
@Test
public void testCookiesOperation()throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.facebook.com");
	Set<Cookie> allcookies = driver.manage().getCookies();
	//cookies count
	
	System.out.println("count of cookies ="+allcookies.size());
	
	for(Cookie cookies:allcookies){

		System.out.println("Name="+cookies.getName());
		
		System.out.println("Doman="+cookies.getDomain());
		System.out.println("Path="+cookies.getPath());
		
		System.out.println("Value="+cookies.getValue());
		
		System.out.println("===========================");
	
		
	}
	driver.manage().deleteAllCookies();
	Set<Cookie> afterDel = driver.manage().getCookies();
	System.out.println("count after delete="+afterDel.size());
}
	
	
	
}
