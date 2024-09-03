package com.Runner;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.POM.LoginPage;
import com.ReusableMethods.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLab extends BaseClass {
	
    public static WebDriver driver  = browserLaunch("chrome");
    public static LoginPage lp = new LoginPage(driver);
	
    
    
	
	public static void main(String[] args) throws IOException {

		getUrl("https://www.saucedemo.com/");
		
		toPassValue(lp.getUsername(), "standard_user");
		
		toPassValue(lp.getPass(), "secret_sauce");
		
		toClickAElement(lp.getButton());
		
		
		
		
		/*
		 * WebElement drop =
		 * driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		 * 
		 * selectValueFromDropDrown(drop, "index", "2");
		 */
		
		/*
		 * 
		 * driver.findElement(By.xpath("(//button[contains(text(),'ADD')])[1]"));
		 * driver.findElement(By.xpath("(//button[contains(text(),'ADD')])[2]")).click()
		 * ; driver.findElement(By.
		 * xpath("//a[@class='shopping_cart_link fa-layers fa-fw']")).click();
		 * driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();
		 * driver.findElement(By.id("first-name")).sendKeys("Ravi");
		 * driver.findElement(By.id("last-name")).sendKeys("raj");
		 * driver.findElement(By.id("postal-code")).sendKeys("600072");
		 * driver.findElement(By.xpath("//input[@type='submit']")).click();
		 * driver.findElement(By.xpath("//a[text()='FINISH']")).click();
		 * 
		 * browserClose();
		 * 
		 * toTakeScreenshot("swag1");
		 * 
		 */	}
	
	
 
	
	
	

}
