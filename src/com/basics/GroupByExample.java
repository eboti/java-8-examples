package com.basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample {

	public static void main(String[] args) {
		test();
	}

	public static void test() {

		List<MyStructure> list = Arrays.asList(new MyStructure("HUN",
				"Budapest", "Kovacs Pista", 20), new MyStructure("HUN",
				"Budapest", "Feher Miklos", 22), new MyStructure("HUN",
				"Budapest", "Szabo Peter", 24), new MyStructure("HUN",
				"Budapest", "Nyihaha Lajos", 31), new MyStructure("HUN",
				"Pecs", "Gipsz Karoly", 50), new MyStructure("USA", "New York",
				"Joe Brown", 63));

		String joined = list.stream().map(Object::toString)
				.collect(Collectors.joining(", "));

		System.out.println(list.stream().filter(t -> t.getAge() < 40)
				.map(MyStructure::getAge).collect(Collectors.toList()));

		Map<String, List<MyStructure>> map = list.stream()
				.filter(t -> t.getAge() < 40)
				.sorted(Comparator.comparing(MyStructure::getAge).reversed())
				.collect(Collectors.groupingBy(MyStructure::getCountry));
		System.out.println();

		// System.out.println(
		// list.stream().collect(Collectors.groupingBy(MyStructure::getCountry,
		// Collectors.groupingBy(MyStructure::getTown)))
		// );
		//
		// Map map2 = (Map)
		// list.parallelStream().collect(Collectors.groupingBy(MyStructure::getCountry,
		// Collectors.groupingBy(MyStructure::getTown)));

	}

	public static class MyStructure {
		private String country;
		private String town;
		private String salesman;
		private Integer age;

		public MyStructure(String country, String town, String salesman,
				Integer age) {
			super();
			this.country = country;
			this.town = town;
			this.salesman = salesman;
			this.age = age;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getTown() {
			// throw new RuntimeException();
			return town;
		}

		public void setTown(String town) {
			this.town = town;
		}

		public String getSalesman() {
			return salesman;
		}

		public void setSalesman(String salesman) {
			this.salesman = salesman;
		}

		@Override
		public String toString() {
			return "MyStructure [country=" + country + ", town=" + town
					+ ", salesman=" + salesman + ", age=" + age + "]";
		}

	}
}
