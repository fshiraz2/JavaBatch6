package com.syntax.class02;

public class StringConcatination {
	

		public static void main (String[]args) {
			
		//I love Java
			String language= "Java";
			
			System.out.println("I love "+language);
			
			//you can add space before "Java" or after "I love". 
			//always add space within double quotes.
			
		String love= "I love ";
		System.out.println(love+""+language);
		
		int year= 2020;
		String car= "BMW";
		
		//I purchased BMW 2020
		
		System.out.println("I purchased "+car+" "+ year);
		//above same as below
		System.out.println("I purchased "+car+" 2020");
		
		
		}
	

}
