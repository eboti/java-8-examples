package com.foo;

public class ThirdHuman implements DoNothing{

	public void sleep(){
		DoNothing.sleep();
	}

	public static void sleep2(){
		DoNothing.sleep();
	}

}
