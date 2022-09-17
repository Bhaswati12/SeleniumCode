package com.excelr.learningjava.methods;

// no parameter_no return

import java.util.Scanner;
public class Course {
	
	private String studentName ;
	
	private String courseCode ;
	
	 static Scanner input = new Scanner(System.in) ;
	
	public void enterDatafromKeyBoard(java.util.Scanner input) {
		
		System.out.println("Enter the student name :") ;
		
		studentName = input.next() ;
		
		System.out.println("Enter the course code :") ;
		courseCode = input.next() ;
		
	}
	
	public void displayData() {
		
		System.out.println("Enter the student name :" + studentName) ;
		
		System.out.println("Enter the course code :" + courseCode) ;
		
	}
}

        