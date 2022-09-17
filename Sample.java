package com.excelr.learningjava.methods;

// return type_with parameter

public class Sample {
	
	int max(int a, int b) {
		
		if(a>b)
			 return a;
		else
			return b;
	}
	public static void main(String[] args)
	
	{
		int x = new Sample().max(44,56) ;
		System.out.println(x);
		
		Sample d = new Sample() ;
		
		int y = d.max(44,56) ;
		System.out.println(y);
	}
}