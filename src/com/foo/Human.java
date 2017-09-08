package com.foo;

public class Human implements Move{

	@Override
	public void walk() {
		System.out.println(this.getClass().getSimpleName() + " is walking");
	}

	@Override
	public void run() {
		System.out.println(this.getClass().getSimpleName() + " is running");
	}


}
