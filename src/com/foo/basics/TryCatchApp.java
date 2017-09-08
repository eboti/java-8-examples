package com.foo.basics;

public class TryCatchApp {

	public static void main(String[] args) {
		
		try{
			System.out.println(1.0/0.0);
			System.out.println("try");
			int i = 5/0;
//			String str = null;
//			str.charAt(1);
		}catch (Exception e){
			System.exit(-1);
			System.out.println(e);
		}finally{
			System.out.println("finally");
		}

	}
	
	

}
