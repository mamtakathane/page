package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class webdriver {

	
	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe" );
		
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.youtube.com");
	driver.manage().window().maximize();
		
	driver.close();	
		
		
		
	}
	
	
	
	
	
	
	
	
}
