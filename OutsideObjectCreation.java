package com.javaprograms.java;

public class OutsideObjectCreation {

	

	public static void main(String[] args) {
		ObjectCreation OC1 = new ObjectCreation();
		ObjectCreation2 OC2 = new ObjectCreation2(76, 54);
		
		System.out.println(OC1.hashCode());
		System.out.println(OC2.add());
		
	}

}
