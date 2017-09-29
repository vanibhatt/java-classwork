package Taxes;

public class TaxCalculator {

	
	public double calculateTax(String empName, double empSal, boolean isIndian) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
		
		double taxAmount = 0;

				
				if (!isIndian) {	
				     throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
				} else if (empName.equals("")) {
					 throw new EmployeeNameInvalidException("The employee name cannot be empty");
				} else if (empSal > 100000 && isIndian) {
					taxAmount = empSal*8/100;
				} else if ((empSal > 50000 && empSal < 100000) && isIndian) {
					taxAmount = empSal*6/100;
				} else if ((empSal > 30000 && empSal < 50000) && isIndian) {
					taxAmount = empSal*6/100;
				}else if ((empSal > 10000 && empSal <  30000) && isIndian) {
					taxAmount = empSal*5/100;
				} else {
					throw new TaxNotEligibleException("The employee does not need to pay tax");
				}
			

		System.out.println("Tax amount is " +taxAmount);
		return taxAmount;
	}	
}

class CountryNotValidException extends Exception
{
      // Parameterless Constructor
      public CountryNotValidException() {}

      // Constructor that accepts a message
      public CountryNotValidException(String message)
      {
         super(message);
         System.out.println(message);
      }
 }

class EmployeeNameInvalidException extends Exception
{
      // Parameterless Constructor
      public EmployeeNameInvalidException() {}

      // Constructor that accepts a message
      public EmployeeNameInvalidException(String message)
      {
         super(message);
         System.out.println(message);
      }
 }

class TaxNotEligibleException extends Exception
{
      // Parameterless Constructor
      public TaxNotEligibleException() {}

      // Constructor that accepts a message
      public TaxNotEligibleException(String message)
      {
         super(message);
         System.out.println(message);
      }
 }