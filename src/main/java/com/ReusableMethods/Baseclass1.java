package com.ReusableMethods;

import java.awt.Window;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
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

public class Baseclass1 {

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

	public static void toScrollanElement(int x, int y) {
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

	public static void toPassValue(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void scrollby(int x, int y) {
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		//js.executeScript(Window.scro);
	}

	public static void selectValueFromDropDrown(WebElement element, String option, String value) {
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
		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File target = new File(
				"C:\\Users\\Raviraj\\eclipse-workspace\\Framework_concepts\\Screenshot" + filename + ".png");

		FileHandler.copy(source, target);

	}

}
