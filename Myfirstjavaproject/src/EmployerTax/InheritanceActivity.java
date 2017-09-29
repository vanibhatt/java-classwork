package EmployerTax;

public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager mng1 = new Manager((long) 126534,"Peter","Chennai India", (long) 237844, (double) 65000);
     	System.out.println(mng1.calculateSalary());
     	System.out.println(mng1.calculateTransportAllowance());
     	
     	Trainee trn1 = new Trainee((long) 29846,"Jack","Mumbai India", (long) 442085, (double) 45000);
     	System.out.println(trn1.calculateSalary());
     	System.out.println(trn1.calculateTransportAllowance());
     	
	}

}
