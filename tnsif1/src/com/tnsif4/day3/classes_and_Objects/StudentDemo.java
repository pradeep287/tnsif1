package com.tnsif4.day3.classes_and_Objects;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("student id " + s1.sid);
		System.out.println("student name " + s1.name);
		System.out.println("student city " + s1.city);
		Student s2 = new Student();
		System.out.println("student id " + s2.sid);
		System.out.println("student name " + s2.name);
		System.out.println("student city " + s2.city);
		Student s3 = new Student();
		System.out.println("student id " + s3.sid);
		System.out.println("student name " + s3.name);
		System.out.println("student city " + s3.city);
		s1.sid = 123 ;

	}

}
