package com.tnsif5.day3.encapsulation;

public class Student_Encapsulation {
	private int sid ;
	private String name ;
	private String city ;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student_Encapsulation [sid=" + sid + ", name=" + name + ", city=" + city + "]";
	}
	

}

