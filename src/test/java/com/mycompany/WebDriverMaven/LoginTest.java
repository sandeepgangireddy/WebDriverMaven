package com.mycompany.WebDriverMaven;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class LoginTest {


	
		public static WebDriver driver;
		
		@BeforeSuite
		public void setup() {
		
			driver = new FirefoxDriver();
		}
		
		@Test
		public void doLogin() {
			
			driver.get("https://gmail.com");
			driver.findElement(By.id("Email")).sendKeys("sandeepg8081@gmail.com");
			driver.findElement(By.id("Passwd")).sendKeys("sdfsdf");
			driver.findElement(By.id("SignIn")).click();
			
			//added new comments - more
			
		}

		
		@AfterSuite
		public void tearDown() {
			
			driver.quit();
		}
	}


