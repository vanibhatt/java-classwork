package com.cognizant.tax;

public class EmployeeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TaxCalculator t = new TaxCalculator(1000000, true);
		t.calculateTax();
		t.deductTax();
		t.validateSalary();

	}

}
