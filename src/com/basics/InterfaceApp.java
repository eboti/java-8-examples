package com.basics;

public class InterfaceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceApp app = new InterfaceApp();
		app.temp();
	}

	
	private void temp(){
		MyClass myClazz = new MyClass();
		myClazz.log("asdfasdf");
	}

	 
	public interface Interface1 {
	 
	    void method1(String str);
	     
	    default void log(String str){
	        System.out.println("I1 logging::"+str);
	        print(str);
	    }

		static void print(String str){
			System.out.println("print fgv");
		}
	}
	 
	public interface Interface2 {
	 
	    void method2();
	     
	    default void log(String str){
	        System.out.println("I2 logging::"+str);
	    }
	 
	}
	
	
	public class MyClass implements Interface1, Interface2 {

		@Override
		public void method2() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void method1(String str) {
			// TODO Auto-generated method stub
			
		}
		 
	    @Override
	    public void log(String str){
	        System.out.println("MyClass logging::"+str);
	        Interface1.print("abc");
	    }
	}


}
