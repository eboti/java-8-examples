package com.foo;

public interface Move {

	void walk();
	void run();
	
	default void jump(){
		System.out.println(this.getClass().getSimpleName() + " is jumping");
	}
}
