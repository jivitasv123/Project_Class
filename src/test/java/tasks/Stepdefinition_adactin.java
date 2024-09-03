package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.swaglab.runner.Runner_swaglab;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition_adactin {
	static WebDriver driver = Runner_swaglab.driver;
	
	@Given("User launch adactin application")
	public void user_launch_adactin_application() {
			driver.get("https://adactinhotelapp.com/");
			driver.findElement(By.id("username")).sendKeys("RavirajR1");
			driver.findElement(By.id("password")).sendKeys("123456789");
			driver.findElement(By.id("login")).click();
		} 		
	
	@When("User Select the location in location field")
	public void user_select_the_location_in_location_field() {
		WebElement loc = driver.findElement(By.id("location"));
		Select s = new Select(loc);
		s.selectByIndex(4);	     
	}

	@Then("User Select the hotel in hotel field")
	public void user_select_the_hotel_in_hotel_field() {
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotels);
		s1.selectByValue("Hotel Sunshine");	     
	}

	@Then("User select the roomtype in roomtype field")
	public void user_select_the_roomtype_in_roomtype_field() {
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select s2 = new Select(roomtype);
		s2.selectByVisibleText("Super Deluxe");	     
	}

	@Then("User select the number of rooms in number of rooms field")
	public void user_select_the_number_of_rooms_in_number_of_rooms_field() {
		WebElement rooms = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(rooms);
		s3.selectByIndex(1);	     
	}

	@Then("user select the date in check in field")
	public void user_select_the_date_in_check_in_field() {
		driver.findElement(By.xpath("//input[@name='datepick_in']")).sendKeys("10/01/2024");
     
	}

	@Then("User select the check out date in check out field")
	public void user_select_the_check_out_date_in_check_out_field() {
		driver.findElement(By.xpath("//input[@name='datepick_out']")).sendKeys("10/20/2024");
	   	}

	@Then("User select the number of adults in adults per room field")
	public void user_select_the_number_of_adults_in_adults_per_room_field() {
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adult);
		s4.selectByIndex(1);	     
	}

	@Then("User select the number if child in childs per room field")
	public void user_select_the_number_if_child_in_childs_per_room_field() {
		WebElement child = driver.findElement(By.id("child_room"));
		Select s5 = new Select(child);
		s5.selectByIndex(1);	     
	}

	@Then("User click the search button")
	public void user_click_the_search_button() {
		driver.findElement(By.id("Submit")).click();	     
	}

	@When("User click the radio button in confirmation field")
	public void user_click_the_radio_button_in_confirmation_field() {
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click(); 
	}
	@When("User enter the Firstname in Firstname field")
	public void user_enter_the_Firstname_in_Firstname_field() {
		driver.findElement(By.id("first_name")).sendKeys("David");
	}
	@When("User enter the Lastname in Lastname field")
	public void user_enter_the_lastname_in_lastname_field() {
		driver.findElement(By.id("last_name")).sendKeys("R");	     
	}

	@When("User enter the Address in Billing address field")
	public void user_enter_the_address_in_billing_address_field() {
		driver.findElement(By.id("address")).sendKeys("no.100 1st street annangar chennai ");
	    	}

	@When("User enter the card no in credit card no field")
	public void user_enter_the_card_no_in_credit_card_no_field() {
		driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("456 789 3456 123456");  
	   
	}

	@When("User select the credit card type in card type field")
	public void user_select_the_credit_card_type_in_card_type_field() {
		WebElement card = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(card);
		s6.selectByValue("AMEX");
	     
	}

	@When("User select the month in expiry date field")
	public void user_select_the_month_in_expiry_date_field() {
		WebElement ctype = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(ctype);
		s7.selectByIndex(2);	     
	}

	@When("User select the Year in expiry date field")
	public void user_select_the_year_in_expiry_date_field() {
		WebElement exp = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(exp);
		s8.selectByIndex(5);	     
	}

	@When("User Enter the cvv number in cvv field")
	public void user_enter_the_cvv_number_in_cvv_field() {
		driver.findElement(By.id("cc_cvv")).sendKeys("154");
		    
	}

	@Then("User click the book now field")
	public void user_click_the_book_now_field() {
		driver.findElement(By.id("book_now")).click();	     
	}

	
}
