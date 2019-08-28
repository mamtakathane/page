package com.page;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class SelectFacebookDropdown {

	public static void main(String[] args) {
		

	
	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
         driver.manage().window().maximize();
		
	  // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      
	   WebElement month_dropdown = driver.findElement(By.xpath("//select[@id='month']"));

		Select month_dd = new Select(month_dropdown);
		
		WebElement Select_value = month_dd.getFirstSelectedOption();
		
		//it should return month
		System.out.println("Before Selection selected value is"+Select_value.getText());
		
		
		
	// it will select march
		month_dd.selectByIndex(3);
		
		WebElement Select_value1 = month_dd.getFirstSelectedOption();
		
		//month_dd.selectByValue("10");
		
		
		System.out.println("After Selection selected value is"+Select_value1.getText());
		
		
				
}}
