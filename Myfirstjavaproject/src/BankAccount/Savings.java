package BankAccount;

public class Savings {
	
	private float balance;
	public Savings() {
		this.balance = 0f;
	}
	
	public void deposit(float amt) {
		this.balance = this.balance + amt;
	};
	
	public void withdraw(float amt) {
		this.balance = this.balance - amt;
		
	};
	
	public float getBalance() {
		return this.balance;
		
	};

}
