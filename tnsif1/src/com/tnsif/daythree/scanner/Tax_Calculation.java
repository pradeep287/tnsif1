package com.tnsif.daythree.scanner;

public class Tax_Calculation {
	public void calculate_tax(Person person) {
		if(person.getAge()>65 || person.getGender().equalsIgnoreCase("female")) {
			person.setTax(0);
			System.out.println("tax not applicable");
		} else {
				if(person.getIncome() <= 160000) {
					person.setTax(0);
				}
		}
		
		}
}
	
