package com.TestNg_concepts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterTest {
	
	WebDriver driver;
	
	@BeforeMethod
	private void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
     
	}
	
	@Test(dataProvider = "myCredentials")
	private void loginTest(String user , String pass) {
      driver.findElement(By.xpath("//input[@type='text']")).sendKeys(user);
      driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
      driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@DataProvider
	private Object[][] myCredentials() {
		
		return new Object[][] {
			{"standard_user" , "secret_sauce"},
			{"locked_out_user" , "secret_sauce"},
			{"problem_user" , "helloworld"},
			{"secret_sauce" , "swaglabs"}
		};
	}
	
	
	
	@AfterMethod
	private void tearDown() throws InterruptedException {
         Thread.sleep(2000);
		driver.quit();
	}
	
	
	
	
	

}
