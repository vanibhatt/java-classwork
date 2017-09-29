/**
 * 
 */
package EmployerTax;

/**
 * @author PSAdmin
 *
 */
public class Employee {

	long employeeId;
	String employeeName;
	String employeeAddress;
	Long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double Hra = 1000.50;
	
	
	Employee(long Id, String Name, String address, Long phone) { 
	
		this.employeeId = Id;
		this.employeeName = Name;
		this.employeeAddress = address;
		this.employeePhone = phone;

	}

	double calculateSalary () {
		double salary = this.basicSalary + (this.basicSalary * specialAllowance/100) + (this.basicSalary * Hra/100);
		return salary;
	}
	
	double calculateTransportAllowance() {
		double transportAllowance = (10.0/100.0)*this.basicSalary;
		return transportAllowance;
	}
}
