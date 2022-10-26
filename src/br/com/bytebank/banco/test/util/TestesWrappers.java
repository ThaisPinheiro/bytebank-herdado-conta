package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TestesWrappers {

	public static void main(String[] args) {
		Integer ageRef = Integer.valueOf(29); //autoboxing
		System.out.println(ageRef.intValue()); //unboxing

		Double dRef = Double.valueOf(3.2); //autoboxing
		System.out.println(dRef); //unboxing
		
		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());
		
		Number refNumbers = Float.valueOf(29.3f);
		System.out.println(refNumbers);

		List<Number> list = new ArrayList<>(); //mais genérico
		list.add(10);
		list.add(32.6);
		list.add(23.9f);	
	}
}
