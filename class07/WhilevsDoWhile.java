package com.syntax.class07;

public class WhilevsDoWhile {

	public static void main(String[] args) {
		// hello 5 times
		int num=1;
		while(num<=5){
			System.out.println("Hello");
			num++;
		}
	System.out.println("------------USING DO WHILE LOOP-------------");
	
	int num1=11;//this will only print once bc first they print then check condition
	
	do {
		System.out.println("Hello");
		num1++;
	}while(num1<=5);
	}

}
