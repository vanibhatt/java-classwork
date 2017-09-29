package EmployerTax;

public class Manager extends Employee {
	
	Manager(long Id, String Name, String address, Long phone, double basicSalary) {
		super(Id, Name, address, phone);
		this.basicSalary = basicSalary;
		
	}
	
	double calculateTransportAllowance() {
		
		double transportAllowance = (15.0/100.0)*this.basicSalary;
		return transportAllowance;
	}
}
