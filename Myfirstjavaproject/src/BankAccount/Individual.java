package BankAccount;

public class Individual extends Account {
	
	Individual(String accountholder) {
		super(accountholder);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Individual("Bairon");
		System.out.println(account.getCheckingBalance());
		System.out.println(account.getsavingsBalance());
		
	}

}
