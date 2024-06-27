package com.tnsif1;

import java.util.Scanner;


class UnderAgeException extends Exception{
	public String getMessage() {
		return"you are too young,have some patience";
	}
}
class OverAgeException extends Exception{
	public String getMessage() {
		return"you are too old,cool down";
	}
}
class Applicant{
	int age;
	void acceptInput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your age");
		age=scan.nextInt();
		System.out.println("hello");
	}
	void verify() throws Exception {
		if(age<18) {
			 UnderAgeException uae=new  UnderAgeException();
			 System.out.println(uae.getMessage());
			 throw uae;
		}
		else if(age>60) {
			OverAgeException oae=new  OverAgeException();
			System.out.println(oae.getMessage());
			throw oae;
			}
		else {
			System.out.println("collect your licence");
		}
	}
}
class Rto{
	void initiate() {
		Applicant a=new Applicant();
		try {
			a.acceptInput();
			a.verify();
			}
		catch(Exception e) {
			System.out.println("you are not eligible for voting");
		}
	}
	}


public class First_Class {

	public static void main(String[] args) {
		
		
		Rto r=new Rto();
		r.initiate();

		
		}

}
