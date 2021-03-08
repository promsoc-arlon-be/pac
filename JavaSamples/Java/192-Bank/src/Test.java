
public class Test {

	Account a;

	public Test() {
		a = new Account();
	}

	public static void main(String[] args) {
		Test t = new Test();

		t.a.credit(178);

		/*
		 * try { a.debit(300); } catch (MyException e) {
		 * System.out.println(e.getMessage()); }
		 * 
		 * try { a.debit(150); } catch (MyException e) {
		 * System.out.println(e.getMessage()); }
		 */

		t.virerMax(t.a);

		t.a.balance();
	}

	public void virerMax(Account a) {
		int i = 300;

		while (i >= 1) {
			try {
				a.debit(i);
				a.balance();
			} catch (MyException e) {
				System.out.println(e.getMessage());
				a.balance();
				i = i / 2;
			}
			
		}
	}

}
