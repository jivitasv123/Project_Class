package com.TestNg_concepts;

import org.testng.annotations.Test;

public class GroupTest {

	@Test(groups = "mobile", dependsOnGroups = "laptop")
	private void vivo() {
      System.out.println("vivo");
	}	
	@Test(groups = "laptop")
	private void lenova() {
      System.out.println("lenova");
	}	
	@Test(groups = "mobile" ,  dependsOnGroups = "laptop")
	private void samsung() {
      System.out.println("samsung");
	}	
	@Test(groups = "mobile" ,  dependsOnGroups = "laptop")
	private void iphone() {
      System.out.println("iphone");
	}	
	@Test(groups = "laptop")
	private void hp() {
      System.out.println("hp");
	}
	@Test(groups = "laptop")
	private void dell() {
      System.out.println("dell");
	}
	
	
	
	
	
	
	
	
	
	
}
