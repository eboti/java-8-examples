package com.basics;

public class EqualsAndHashCode {

	public static void main(String[] args) {
		EqualsAndHashCode equalsAndHashCode = new EqualsAndHashCode();
		System.out.println(equalsAndHashCode);
		System.out.println(equalsAndHashCode.hashCode());
		// System.out.println(equalsAndHashCode.equals(null));
		// equalsAndHashCode = null;
		// NPE
		// System.out.println(equalsAndHashCode.equals(null));

		String a = "a";
		String b = "a";
		System.out.println(a.equals(b));
		System.out.println(a == b);
		b = a;
		System.out.println(a.equals(b));
		System.out.println(a == b);

		testStringEquality();
		testObjectEquality();
	}

	private Long id;
	private String name;
	private Integer age;

	public static void testStringEquality() {
		String personalLoan = new String("cheap personal loans");
		String homeLoan = new String("cheap personal loans");

		// since two strings are different object result should be false
		boolean result = personalLoan == homeLoan;
		System.out.println("Comparing two strings with == operator: " + result);

		// since strings contains same content , equals() should return true
		result = personalLoan.equals(homeLoan);
		System.out
				.println("Comparing two Strings with same content using equals method: "
						+ result);

		homeLoan = personalLoan;
		// since both homeLoan and personalLoand reference variable are pointing
		// to same object
		// "==" should return true
		result = (personalLoan == homeLoan);
		System.out
				.println("Comparing two reference pointing to same String with == operator: "
						+ result);
	}

	public static void testObjectEquality() {
		Object obj1 = new Object();
		Object obj2 = new Object();

		// == should return false
		boolean result = (obj1 == obj2);
		System.out.println("Comparing two different Objects with == operator: "
				+ result);

		// equals should return false because obj1 and obj2 are different
		result = obj1.equals(obj2);
		System.out
				.println("Comparing two different Objects with equals() method: "
						+ result);

		// "==" should return true because both obj1 and obj2 points same object
		obj1 = obj2;
		result = (obj1 == obj2);
		System.out
				.println("Comparing two reference pointing to same Object with == operator: "
						+ result);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsAndHashCode other = (EqualsAndHashCode) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
