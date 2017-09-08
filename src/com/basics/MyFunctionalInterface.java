package com.basics;

@FunctionalInterface
public interface MyFunctionalInterface {

	static void doSomething4() {};
	static void doSomething5() {};
	
//	abstract void doSomething2();
	
	void doSomething();
	
	default void doSomething3(){};
	String toString(); // From Object.java

}
