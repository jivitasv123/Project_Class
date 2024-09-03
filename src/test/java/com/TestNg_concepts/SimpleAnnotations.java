package com.TestNg_concepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations {

	@BeforeSuite
	private static void browserlaunch() {
		System.out.println("browserlaunch");
	}
	@BeforeTest
	private static void url() {
		System.out.println("url");
	}
	@BeforeClass
	private static void login() {
		System.out.println("login");
	}
	@BeforeMethod
	private static void search() {
		System.out.println("search");
	}
	@Test
	private static void orderSamsung() {
		System.out.println("orderSamsung");
	}
	@Test
	private static void Iphone() {
		System.out.println("Iphone");
	}	
	@AfterMethod
	private static void confirmationStatus() {
		System.out.println("confirmationStatus");
	}
	@AfterClass
	private static void logout() {
		System.out.println("logout");
	}
	@AfterTest
	private static void deleteCookies() {
		System.out.println("deleteCookies");
	}
	@AfterSuite
	private static void broswerClose() {
		System.out.println("broswerClose");
	}
	

}
