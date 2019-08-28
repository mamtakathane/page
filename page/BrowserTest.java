package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
public static void main(String[] args) {
	//System.setProperty("Webdriver.firefox.driver","" )
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.seleniumhq.org/");
	driver.close();
	
	
	
}
	
	
	
	
	
}
