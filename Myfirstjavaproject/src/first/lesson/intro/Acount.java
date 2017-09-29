package first.lesson.intro;

public class Acount {

	private double amount;
	private int num;
	private String name;
	public static String bankName = "Citibank"; 
	
	Acount () {

	}
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}


