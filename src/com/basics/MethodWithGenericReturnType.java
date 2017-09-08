package com.basics;

public class MethodWithGenericReturnType {

	public static void main(String[] args){
		
		System.out.println(new MethodWithGenericReturnType().asdf(Elephant.class));
	}
	
	
	public <T extends Animal> T asdf(Class<T> type){
		return  type.cast(new Elephant(3L));		
	}
	
	class Animal{
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
	}
	
	class Elephant extends Animal{
		private Long snoutLength;

		
		private Elephant(Long snoutLength) {
			super();
			this.snoutLength = snoutLength;
		}

		public Long getSnoutLength() {
			return snoutLength;
		}

		public void setSnoutLength(Long snoutLength) {
			this.snoutLength = snoutLength;
		}

		@Override
		public String toString() {
			return "Elephant [snoutLength=" + snoutLength + ", getName()="
					+ getName() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
		
		
	}
}
