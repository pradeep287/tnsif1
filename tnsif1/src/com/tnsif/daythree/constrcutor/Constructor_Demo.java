package com.tnsif.daythree.constrcutor;

import java.util.Scanner;

public class Constructor_Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name,city;
		int id;
		System.out.println("Enter the customer name:");
		name = sc.nextLine();
		System.out.println("Enter the customer   id:");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the customer city:");
		city = sc.nextLine();
		
		Customer c1 = new Customer();
		System.out.println("DEFAULT CONSTRCUTOR IS INVOKED");
		c1.setCustomer_Name(name);
		c1.setCustomer_Id(id);
		c1.setCustomer_City(city);
		System.out.println(c1);
	
	}

}
