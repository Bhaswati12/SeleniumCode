package com.excelr.learningjava.methods;

//no return value with parameter

public class Main {
	
	 public static void main(String args[])
	    {
	        int a = 4;
	        int b = 5;
	 
	        calc(a, b);
	    }
	    public static void calc(int x, int y)
	    {
	        int sum = x + y;
	        
	        System.out.print("Sum of two numbers is :" + sum);
	    }
	}

