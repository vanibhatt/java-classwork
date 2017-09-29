package Taxes;

public class CalculatorSimulator {

	public static void main(String[] args) {
		
		TaxCalculator t1 = new TaxCalculator();
	
		try {
//			t1.calculateTax("Ron", 34000, false);
//			t1.calculateTax("Tim", 1000, true);
			t1.calculateTax("Jack", 55000, true);
//			t1.calculateTax("", 3000, true);
		} catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

}
