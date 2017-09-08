package com.foo;

public class AnotherHuman extends Human implements AnotherMove{

	@Override
	public void sit() {
		System.out.println(this.getClass().getSimpleName() + " is sitting");
		
	}





}
