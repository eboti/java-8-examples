package com.foo;

public class InterfaceExtendsApp {

	public static void main(String[] args) {
		Human human = new Human();
		human.walk();
		human.run();
		human.jump();
		
		AnotherHuman anotherHuman = new AnotherHuman();
		anotherHuman.walk();
		anotherHuman.run();
		anotherHuman.jump();
		anotherHuman.sit();
		anotherHuman.stand();

		ThirdHuman thirdHuman = new ThirdHuman();
		thirdHuman.stand();
		thirdHuman.sleep();
		
		ThirdHuman.sleep2();
	}

}
