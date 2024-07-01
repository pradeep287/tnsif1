package com.tnsif.day2;

public class Nested_If_Statement {

	public static void main(String[] args) {
	int a=20 , b=30 , c=15 ;
	System.out.println("THE LARGEST NUMBER IS");
	if(a>b) {
		if(a>c) {
			System.out.println(a);
		}
		else {
			System.out.println(c);
		}
	}
	if(c > b) {
		System.out.println(c);
	}
	else {
		System.out.println(b);
	}
	}

}
