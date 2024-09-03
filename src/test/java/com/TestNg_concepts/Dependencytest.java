package com.TestNg_concepts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dependencytest {
	
	@Test
	private static void browserlaunch() {
		System.out.println("browserlaunch");
	}

	@Test(dependsOnMethods = "browserlaunch")
	private static void url() {
		System.out.println("url");
	}

	@Test(dependsOnMethods = "url")
	private static void login() {
		System.out.println("login");
	}

	@Test(dependsOnMethods = "login")
	private static void search() {
		System.out.println("search");

	}

	@Test(dependsOnMethods = "search")
	private static void orderSamsung() {
		System.out.println("orderSamsung");
	}

	
	
	
	
	
}
