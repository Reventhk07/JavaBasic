package com.tnsif.daythree_scanner;

public class TaxCalculation {
	public void calculateTax(Person person) {
	if(person.getAge()> 65 || person.getGender().equalsIgnoreCase("female")) {
		person.setTax(0);
		System.out.println("Tax not applicable");
	}
	else {
		if(person.getIncome()<=160000 && person.getIncome()<=500000) {
			person.setTax((person.getIncome()-160000) * 10/100 +34000);
		}else if(person.getIncome()<=160000) {
			person.setTax(0);
		}else {
			person.setTax((person.getIncome()-8000000)* 30/100 + 94000);
		}
	}
	}
}
