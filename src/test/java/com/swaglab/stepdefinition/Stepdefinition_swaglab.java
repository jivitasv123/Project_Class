package com.swaglab.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.ReusableMethods.BaseClass;
import com.swaglab.runner.Runner_swaglab;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinition_swaglab extends BaseClass {
	
	public WebDriver driver = Runner_swaglab.driver;
	
	@Given("User launch swaglab application")
	public void user_launch_swaglab_application() {
		driver.get("https://www.saucedemo.com/v1/");
	}

	@When("User enter the username in username field")
	public void user_enter_the_username_in_username_field() {
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("standard_user");
	    
	}

	@When("User enter the password in password field")
	public void user_enter_the_password_in_password_field() {
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		//pass.sendKeys("secret_sauce");
		toPassValue(pass,"secret_sauce");
	    
	}

	@Then("user click on the login button and navigate")
	public void user_click_on_the_login_button_and_navigate() {
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		//login.click();
		toClickAElement(login);
		
	    
	}

	@When("User sort the products from low to high")
	public void user_sort_the_products_from_low_to_high() {
		WebElement drop = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select s = new Select(drop);
		s.selectByIndex(2);  
	    
	}

	@When("User select the fleece jacket product")
	public void user_select_the_fleece_jacket_product() {
		driver.findElement(By.xpath("(//button[contains(text(),'ADD')])[3]")).click();
				    
	}
	@When("User select the Bolt t-shirt")
	public void user_select_the_bolt_t_shirt() {
		driver.findElement(By.xpath("(//button[contains(text(),'ADD')])[2]")).click();
	}

	@Then("User click on add to cart button")
	public void user_click_on_add_to_cart_button() {
		driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']")).click();
		driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click(); 
	   	   	}
	

	@When("User enter the firstname in firstname field")
	public void user_enter_the_firstname_in_firstname_field() {
		driver.findElement(By.id("first-name")).sendKeys("Ravi"); 
	    
	}

	@Then("User enter the lastname in lastname field")
	public void user_enter_the_lastname_in_lastname_field() {
		driver.findElement(By.id("last-name")).sendKeys("raj");
	    
	}

	@Then("User enter the zipcode in zipcode field")
	public void user_enter_the_zipcode_in_zipcode_field() {
		driver.findElement(By.id("postal-code")).sendKeys("600072");  
	    
	}

	@Then("User click the continue button")
	public void user_click_the_continue_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	    
	}
	@Then("user click the finish button")
	public void user_click_the_finish_button() {
		driver.findElement(By.xpath("//a[text()='FINISH']")).click();
	}



	
}
