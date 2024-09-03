package com.ReusableMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		
		else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}
		return driver;
	}
	
	
	public static  void toScrollanElement(int x , int y) {
     JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("window.scrollBy(" + x + " , " + y + ")");
	}
	
	
	
	

	public static void browserClose() {
		driver.close();
	}
	
	public static void getUrl(String url) {
        driver.get(url);
	}
	
	
	public static void toClickAElement(WebElement element) {
		element.click();
	}
	
	public static void toPassValue(WebElement element , String value) {
     element.sendKeys(value);
	}
	
	
	public static void selectValueFromDropDrown(WebElement element , String option ,String value) {
       Select s = new Select(element);
       if (option.equalsIgnoreCase("value")) {
		s.selectByValue(value);
	} else if (option.equalsIgnoreCase("VisibleText")) {
		s.selectByVisibleText(value);
	} else if (option.equalsIgnoreCase("index")) {
		s.selectByIndex(Integer.parseInt(value));
	}
        
	}
	
	
	public static void toTakeScreenshot(String filename) throws IOException {
		TakesScreenshot ts =(TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File target = new File(".\\Framework_concepts\\Screenshots" + filename   +".png");
	
		FileHandler.copy(source, target);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Non Static variable cannot be accessed with Static properties which is static method
	//Non Static Method will accept both static & non static properties
}
