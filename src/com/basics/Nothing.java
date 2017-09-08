package com.basics;

import java.util.Optional;

public class Nothing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Optional<String> opt = Optional.ofNullable(null);	
	    opt.ifPresent(name -> System.out.println("length: " + name.length()));
	    
	    String nullName = null;
	    String name = Optional.ofNullable(nullName).orElse("john");
	    String name2 = Optional.ofNullable(nullName).orElseGet(() -> "john2");
	    System.out.println(name);
	    System.out.println(name2);
	    
	    
	    Integer year = 2016;
	    Optional<Integer> yearOptional = Optional.of(year);
	    boolean is2016 = yearOptional.filter(y -> y == 2016).isPresent();
	    System.out.println(is2016);
	    boolean is2017 = yearOptional.filter(y -> y == 2017).isPresent();
	    System.out.println(is2017);
	}

}
