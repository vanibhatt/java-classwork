package BankAccount;

public class Account {

	String accountholder, type;
	static long CUSTOMERID = 1000;
	long ID;
	static String Bank = "CTBank";
	Savings saving = new Savings();
	Checkings checking = new Checkings();
	
	public Account(String holder) {
		
		this.accountholder = "holder";
		this.ID = ++CUSTOMERID;
		
	}
	
	public void depositToCheckings(float amt) {
		this.checking.deposit(amt);
	}
	
	public void transferToCheckings(float amt) {
		this.saving.withdraw(amt);
		this.checking.deposit(amt);	
	};
	
	public void transferToSaving(float amt) {
		this.checking.withdraw(amt);
		this.saving.deposit(amt);	
	};
	
	public float getsavingsBalance() {
		return this.saving.getBalance();
		
	} ;
	
	public float getCheckingBalance() {
		return this.checking.getBalance();
	};
	
	
}
