package com.excelr.learningjava.methods;

public class AllMethods_Example1 {
	
	void method1() {
		System.out.println("I am way 1 mehto void () - no return and no input paametr");
		return ; 
	}
	
	
	 void method2(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
	
		return ;
	}
	
	 int method3() {
		
		return 100;
	}
	
	 int method4(String a, String b) {
		int av = Integer.valueOf(a);
		int bv = Integer.parseInt(b);
		return av+bv;
	}
	
	public static void main(String[] args) {
		AllMethods_Example1 ee = new AllMethods_Example1();
		
		ee.method1();  
		ee.method2(19, 20); 
		
		int store_method3 = ee.method3();
		System.out.println(store_method3+10000);
		
		
		int store_method4 = ee.method4("65", "73");  
		System.out.println(store_method4+3000);
	}
}

