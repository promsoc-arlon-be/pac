
public class C extends B {
	public void method() {
		System.out.println("Dans C");
		super.method();
	}
	public void methodDeC() {
		System.out.println("Dans C");

	}
	@Override
	String getName() {
		return "C";
	}
}
