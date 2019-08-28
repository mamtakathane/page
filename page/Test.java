package com.page;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;
	 
	public class Test{
		public static void main(String[] args) throws IOException {
			
		

	FileInputStream objFis = new FileInputStream("C:\\Mamta\\programs\\scrollpage\\Test1.properties");

		Properties objPro = new Properties();
		
		objPro.load(objFis);
		
		System.out.println(objPro.getProperty("browser"));
		
		System.out.println(objPro.getProperty("url"));
		
		String browserName = objPro.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
	
	}
	else if(browserName.equalsIgnoreCase("Firefox"))
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		
		
	}
		}
	}

