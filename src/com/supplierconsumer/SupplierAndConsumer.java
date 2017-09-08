package com.supplierconsumer;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierAndConsumer {

	public static void main(String[] args) {

		Consumer<String> consumer = A::printNames;
		consumer.accept("Jeremy");
		consumer.accept("Paul");
		consumer.accept("Richard");
		
		Supplier supplier = A::getName;
		System.out.println(supplier.get());
		
		List<String> list = Arrays.asList( "c", "a", "b", "d" );
		list.sort( ( e1, e2 ) -> e1.compareTo( e2 ) );
		System.out.println(list);


		LocalDate now = LocalDate.now();
		System.out.println(now.plusWeeks(12));
	}


}

