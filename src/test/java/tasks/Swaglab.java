package tasks;

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

import io.github.bonigarcia.wdm.WebDriverManager;

public class Swaglab {

static WebDriver driver;
	
	public static void launch() {
		WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	}
	public static void url() {
		driver.get("https://www.saucedemo.com/v1/");

	}
	public static void login() {
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("standard_user");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("secret_sauce");
	}
	public static void dropd() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement drop = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select s = new Select(drop);
		s.selectByIndex(1);
	}
	public static void addtocart() {
		driver.findElement(By.xpath("(//button[contains(text(),'ADD')])[1]")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'ADD')])[2]")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']")).click();
	}
	public static void checkout() {
		driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();
		driver.findElement(By.id("first-name")).sendKeys("Ravi");
		driver.findElement(By.id("last-name")).sendKeys("raj");
		driver.findElement(By.id("postal-code")).sendKeys("600072");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[text()='FINISH']")).click();
	}
	public static void close() {
		driver.close();
	}
	public static void ssmethod() throws IOException {
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\Raviraj\\eclipse-workspace\\Selenium2024\\Screenshot\\swaglab.png");
		FileHandler.copy(source, target);
		}
			
		
	public static void main(String[] args) throws IOException {
		launch();
		url();
		login();
		dropd();
		addtocart();
		checkout();
		ssmethod();
		
	}
	
	
}
