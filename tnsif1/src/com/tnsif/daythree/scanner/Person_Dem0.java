package com.tnsif.daythree.scanner;

import java.util.Scanner;

public class Person_Dem0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age,income;
		System.out.println("ENTER THE PERSON NAME");
		name = sc.next();
		System.out.println("ENTER YOUR AGE");
		age = sc.nextInt();
		System.out.println("ENTER TAXABLE AMOUNT");
		income = sc.nextInt();
		Person person = new Person();
		person.setName(name);
		person.setGender(name);
		person.setGender(name);
		person.setIncome(income);
		System.out.println(person);
		Tax_Calculation calc = new Tax_Calculation();
		calc.calculate_tax(person);
		

	}

}
