
public class Test {

	public static void main(String[] args) {
		A a = new A();
		a.setI(44);
		a.printIt();
		a.onlyMe();

		B b = new B();
		b.setI(66);
		b.printIt();
		b.onlyMe();
		
		// Late binding
		// trouver la methode avec le bon nom et
		// les bons arguments en remantant de 
		// la subclass vers la superclass.
	}
}
