
public class Account {

	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	double amount;

	public double getAmount() {
		return amount;
	}

	public void credit(double amount) {
		this.amount += amount;
	}
	
	public void debit(double amount) throws MyException {
		System.out.println("trying to debit : " + amount);
		if(this.amount < amount) {
			MyException me = new MyException("solde insuffisant");
			throw me;
		}
		
		this.amount -= amount;
	}
	
	public void balance() {
		System.out.println(amount);
	}
	
	

}
