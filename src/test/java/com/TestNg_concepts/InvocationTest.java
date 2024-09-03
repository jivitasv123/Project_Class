package com.TestNg_concepts;

import org.testng.annotations.Test;

public class InvocationTest {

	@Test(invocationCount  = 14)
	private void fb() {
		System.out.println("Fb");

	}
	
	
	
}
