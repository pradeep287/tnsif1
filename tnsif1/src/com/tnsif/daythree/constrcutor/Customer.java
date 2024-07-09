package com.tnsif.daythree.constrcutor;

public class Customer {
	private String customer_Name ;
	private int customer_Id;
	private String customer_City;
	public Customer(){
		System.out.println("This is default constrcutor method");
		//DEFAULT CONSTRCUTOR BODY
	}
	public Customer(String customer_Name,int customer_Id,String customer_City  ) {
		this();
		System.out.println("THIS IS PARAMETERIZED CONSTRCUTOR");
		this.customer_Name = customer_Name ;
		this.customer_Id   = customer_Id ;
		this.customer_City = customer_City ;
		
		
	}
	public String getCustomer_Name() {
		return customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}
	public int getCustomer_Id() {
		return customer_Id;
	}
	public void setCustomer_Id(int customer_Id) {
		this.customer_Id = customer_Id;
	}
	public String getCustomer_City() {
		return customer_City;
	}
	public void setCustomer_City(String customer_City) {
		this.customer_City = customer_City;
	}
	@Override
	public String toString() {
		return "Customer [customer_Name=" + customer_Name + ", customer_Id=" + customer_Id + ", customer_City="
				+ customer_City + "]";
	}
	
	
	

}
