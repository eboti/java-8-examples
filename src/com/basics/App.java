package com.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		App app = new App();
		app.test();
		// app.testLambda();
		// test2();
		// testOptional();
		// testStream();
	}

	private static void testStream() {
		List<String> list = Arrays.asList("asdf", "qwertwe", "wb wege grrwe3",
				"werewrewr qwer");
		list.stream().filter(x -> x.length() > 4).forEach(System.out::println);

		List<Integer> list2 = Arrays.asList(1, 2);
		int sum = list2.stream().map(x -> x * 2).reduce((x, y) -> (x * y))
				.get();
		System.out.println(sum);

	}

	public static void testOptional() {
		String str = null;
		Optional<String> opt = Optional.ofNullable(str);

		System.out.println(opt);

		Optional<String> opt2 = Optional.empty();
		System.out.println(opt2);
	}

	private void testLambda() {

		Runnable r = () -> System.out.println("hello world");
		r.run();

		// egy input parameter
		Function<Integer, Integer> f = a -> a * 2;
		System.out.println("1 input param: " + f.apply(5));

		// 2 input parameter
		BiFunction<Integer, Integer, Integer> b = (a, c) -> a + c;
		System.out.println("2 input param: " + b.apply(3, 4));

		// lambdaval
		System.out.println("lambdaval: " + temp(a -> a * 2, 6));

		// lambda nelkul
		System.out.println("lambdaval: "
				+ temp(new Function<Integer, Integer>() {
					@Override
					public Integer apply(Integer t) {
						return t * 2;
					}

				}, 6));
	}

	// mindket esetben meghivodik
	private Integer temp(Function<Integer, Integer> f, int num) {
		return f.apply(num);
	}

	public static class Person {
		private int age;

		private String name;

		private Person(int age) {
			super();
			this.age = age;
		}

		private Person(int age, String name) {
			super();
			this.age = age;
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

	}

	public static void test2() {
		System.out.println("test2: ");
		Predicate<Person> isChild = p -> p.getAge() < 20;
		System.out.println(isChild.test(new Person(50)));

		Predicate<Person> startsWithJ = p -> p.getName().startsWith("J");
		System.out.println(startsWithJ.test(new Person(2, "Poe")));
	}

	private void test() {
		List<Integer> list = Arrays.asList(5, 6, 7, 1, 2, 3, 4);

		// list.stream().limit(5).sorted().forEach(System.out::println);

		// list.stream().forEach(System.out::print);

		// Object sum = list.stream()
		// .map(a-> a + "asdf")
		// .filter(a -> a.length() > 2)
		//
		// .toArray(String[]::new);
		//
		// System.out.println(sum);
		// sum.forEach(System.out::println);

		// System.out.println(list.stream().toArray(String[]::new));

		// Object sum = (list.stream()
		// .reduce(0, (a, b) -> a + b));

		// Object sum = (list.stream()
		// .reduce(1, (a, b) -> a * b));
		// System.out.println(sum);

		Object sum = (list.stream().reduce(0, Integer::max));

		// System.out.println(sum);

		Stream<Integer> numbers = Stream.iterate(0, n -> n + 10).limit(5);
		numbers.forEach(System.out::println);

		Stream<Integer> array = Stream.of(1, 2, 3);
		// array.forEach(System.out::println);

		int[] nums = { 1, 2, 4 };
		IntStream numsFromArray = Arrays.stream(nums);

		// System.out.println(numsFromArray.allMatch(t -> t == 3));

		// 3, 5, 7
		// Arrays.stream(new int[] { 1, 2, 3 }).map(n -> 2 * n + 1).min()
		// .ifPresent(System.out::println); // 5.0

	}
}
