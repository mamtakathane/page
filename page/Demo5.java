package com.page;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class Demo5 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	//  driver.findElement(By.xpath("//a[@href='about-us.html']")).click();
	 // Thread.sleep(3000);
	
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.setProperty("webdriver.chrome.driver","Resource/chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("file:///D:/JBK%20Offline/index.html");
  }

  @AfterSuite
  public void afterSuite() {
	  driver.close();
	  
	  
  }

}
