package com.test.automation1.uiAutomation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {
	WebDriver driver;
	
	@Test
	
	public void test123(){
		
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://learn-automation.com/");
		Assert.assertTrue(driver.getTitle().contains("Selenium"));
		System.out.println("Test1");
	}

}
