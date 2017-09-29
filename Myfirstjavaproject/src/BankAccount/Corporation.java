package BankAccount;

public class Corporation extends Account {

				
		Corporation(String accountholder) {
			super(accountholder);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Account account = new Corporation("Bairon");
			System.out.println(account.getCheckingBalance());
			System.out.println(account.getsavingsBalance());
			
		}
}
