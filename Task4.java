package com.syntax.class15;

public class Task4 {

	public static void main(String[] args) {
		//Create a String and print it in reverse order (Sunday → yadnuS).

		
		String name="Sunday";
		
		
		String reversed="";
		
		for(int i=name.length()-1;i>=0;i--) {
			
		reversed+=name.charAt(i);
		
		
		
		}
		
		
		System.out.println(reversed);
		
		
		
		
		
		
	}

}
