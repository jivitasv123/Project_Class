package com.POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Used to mark a field on a Page Object to indicate an alternative 
	//mechanism for locating theelement or a list of elements. 
	
    WebDriver driver ;
	
	@FindBy(xpath ="//input[@type='text']" )
	private  WebElement username;  
	

	@FindBy(xpath = "//input[@type='password']")
	private WebElement pass;
	 

	@FindBy(xpath ="//input[@type='submit']" )
	private WebElement button;


	public LoginPage(WebDriver driver) {
     this.driver= driver;
     PageFactory.initElements(driver, this);
	}


	public WebElement getUsername() {
		return username;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getButton() {
		return button;
	}
	
	
	
	
	
	
	
	

}
