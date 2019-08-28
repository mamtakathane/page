package com.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void ScrollpageDown () throws Throwable {
	  
	WebDriver driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://jqueryui.com");
	
	Thread.sleep(5000);
	((JavascriptExecutor) driver).executeScript("scroll(0,1000)");//vartically down
																									
	Thread.sleep(5000);
	((JavascriptExecutor) driver).executeScript("scroll(0,-1000)");//vertically up
																									
	  
	  
	  
  }
}
