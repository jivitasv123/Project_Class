package com.TestNg_concepts;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority = -1)
	private void insta() {
		System.out.println("Insta");
	}
	
	@Test(priority = 1)
	private void fb() {
		System.out.println("Fb");
	}
	
	@Test(priority = 2)
	private void bookmyshow() {
		System.out.println("bookMyshow");
	}
	
	@Test(priority = 0)
	private void myntra() {
		System.out.println("Myntra");

	}

	
	
	
	
	
}
