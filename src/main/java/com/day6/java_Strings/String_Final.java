package com.day6.java_Strings;

public class String_Final {

	//final concept is related to String classes
	
	public static void main(String[] args) {
	String S1 = new String("Apple");
	S1.concat("Mango");
	System.out.println(S1); //AppleMango
	S1 = S1.concat("Oranges");
	System.out.println(S1);
	
	
	final int i = 20;
	
	System.out.println(i);
	
	}
}
