package com.TestNg_concepts;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class Timeout_ExceptionTEST {

	@Test(timeOut = 2000 , expectedExceptions = ThreadTimeoutException.class)
	private void fb() throws InterruptedException {
		System.out.println("Fb");
		Thread.sleep(5000);
		System.out.println("Insta");
	}
	
	@Test
	private void myntra() {
		System.out.println("Mytra");

	}

}
