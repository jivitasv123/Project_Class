package com.Runner;

import com.Pojo.Pojo_Class;

public class PojoRunner {
	
	
	public static void main(String[] args) {
		Pojo_Class pc = new Pojo_Class();
		
		System.out.println(pc.getA());
		
		pc.setA("Abc");
		
		System.out.println(pc.getA());

	}
	
	
	
	
	
	

}
