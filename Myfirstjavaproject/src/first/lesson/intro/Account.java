package first.lesson.intro;

public class Account {
		private double amount;
		private int num;
		private String name;
		private boolean hungry;
		
		public int getnum() {		
			return this.num;
		}
		
		public double checkBalance() {		
			return this.amount;
		}
		
		public void deposit (double amt)  {		
			this.amount += amt;
		}
		
		public String getName()  {		
			return this.name;
		}
		
		public Account()  {		
			this.amount = 100;
		}
		
		public double withdraw(double amt) {
			this.amount -= amt;
			return this.amount;
		}
		
}

