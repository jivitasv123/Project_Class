package com.TestNg_concepts;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {

	@Ignore
	@Test()
	private void insta() {
		System.out.println("Insta");
	}	
	@Test(enabled = false)
	private void fb() {
		System.out.println("Fb");
	}	
	@Test
	private void bookmyshow() {
		System.out.println("bookMyshow");
	}	
	@Test
	private void myntra() {
		System.out.println("Myntra");

	}

}
