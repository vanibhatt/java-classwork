package EmployerTax;

public class Trainee extends Employee {
	
	Trainee(long Id, String Name, String address, Long phone, double basicSalary) {
		super(Id, Name, address, phone);
		this.basicSalary = basicSalary;
	
	}

}
