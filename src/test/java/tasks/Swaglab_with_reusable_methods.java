package tasks;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ReusableMethods.Baseclass1;

public class Swaglab_with_reusable_methods extends Baseclass1 {

	public static void login() {
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		toPassValue(username, "standard_user");
		//WebElement "pass = driver.findElement(By.xpath("//input[@type='password']"));
		//toPassValue(pass, "secret_sauce");
	}
	public static void dropd() {
		WebElement drop = driver.findElement(By.xpath("//input[@type='submit']"));
		selectValueFromDropDrown(drop, "index", "0");
	}
	public static void addtocart() {
		WebElement c1 = driver.findElement(By.xpath("(//button[contains(text(),'ADD')])[1]"));
		toClickAElement(c1);
		WebElement c2 = driver.findElement(By.xpath("(//button[contains(text(),'ADD')])[2]"));
		toClickAElement(c2);
		WebElement c3 = driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']"));
		toClickAElement(c3);
	}
	public static void checkout() {
		WebElement check = driver.findElement(By.xpath("//a[text()='CHECKOUT']"));
		toClickAElement(check);
		WebElement firstname = driver.findElement(By.id("first-name"));
		toPassValue(firstname, "Ravi");
		WebElement lastname = driver.findElement(By.id("last-name"));
		toPassValue(lastname, "raj");
		WebElement pincode = driver.findElement(By.id("postal-code"));
		toPassValue(pincode, "600072");
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		toClickAElement(submit);
		WebElement finish = driver.findElement(By.xpath("//a[text()='FINISH']"));
		toClickAElement(finish);
	}
	
	public static void main(String[] args) throws IOException {
		browserLaunch("chrome");
		getUrl("https://www.saucedemo.com/v1/");
		login();
		dropd();
		addtocart();
		checkout();
		toTakeScreenshot("swag");
		
		
	}
	
}
