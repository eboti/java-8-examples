package com.foo;

public interface DoNothing {

	default void stand(){
		System.out.println(this.getClass().getSimpleName() + " is standing");
	}
	
	static public void sleep(){
		System.out.println(DoNothing.class.getSimpleName() + " is sleeping");
	}	
}
