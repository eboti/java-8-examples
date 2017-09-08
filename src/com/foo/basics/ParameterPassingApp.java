package com.foo.basics;

public class ParameterPassingApp {

	public static void main(String[] args) {
		new ParameterPassingApp().testPrimitiveType();

		new ParameterPassingApp().testObject();
		new ParameterPassingApp().testObject2();
		
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
	}

	// will print out 0, because not the x variable is passed only the value of
	// it, which is 0.
	private void testPrimitiveType() {
		int x = 0;
		giveMeATen(x);
		System.out.println(x);
	}

	void giveMeATen(int y) {
		y = 10;
	}

	// should print null, since there is no reference
	private void testObject() {
		Object x = null;
		giveMeAFive(x);
		System.out.println(x);
	}

	void giveMeAFive(Object y) {
		y = "This is a string";
	}

	// should print bmw, maruti, maruti, since the reference's value is passed
	void testObject2() {
		Car car = new Car("BMW");
		System.out.println("Brand of Car Inside main() before: " + car.brand);
		printBrand(car);
		System.out.println("Brand of Car Inside main()after: " + car.brand);
	}

	public void printBrand(Car car) {
		car.brand = "Maruti";
		System.out.println("Brand of Car Inside printBrand(): " + car.brand);
	}

	private class Car {
		private String brand;

		public Car(String brand) {
			this.brand = brand;
		}

	}
}
