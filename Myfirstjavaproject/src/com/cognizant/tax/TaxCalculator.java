package com.cognizant.tax;

public class TaxCalculator {
	
	float basicsalary,tax;
	boolean citizenship;
	int nettSalary;
	
	TaxCalculator (float basicsalary, boolean citizenship) {
	this.basicsalary = basicsalary;
	this.citizenship = citizenship;
	}
	
	public void calculateTax() {
		
		this.tax = 30 * this.basicsalary/100;
		System.out.println("The Tax of the employee  for  the " + basicsalary + " is " + tax);
	}
	
    public void deductTax() {
		
		int nettSalary =  (int)this.basicsalary - (int)this.tax;
		System.out.println("The nett salary for the employee is " + nettSalary);
	}

    public void validateSalary() {
    	
    	if (citizenship =true && basicsalary > 100000 ){
    		System.out.println("The salary and citizenship availability " + true);
    	} 
    	
    	else {
    		System.out.println("The salary and citizenship availability " + false);
    	}  
    }  
}
