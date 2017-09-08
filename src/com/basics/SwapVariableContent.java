package com.basics;

public class SwapVariableContent {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// solution #1
//		a = a + b; //30
//		b = a - b; //10
//		a = a - b;
//		System.out.println("a: " + a + ", b: " + b);

		// solution #2
		b = a + b; //30
		a = b - a; //20
		b = b - a;
		System.out.println("a: " + a + ", b: " + b);

	}

}
