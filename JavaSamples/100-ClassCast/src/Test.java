

//100 - Class Cast

public class Test {

	public static void main(String[] args) {
		
		B b = new B();
		//C c = new C();
		
		b.addC(new C());
		b.addC(new C());
		b.print();
	//	b = c;
		//b.methodB(/*(B) c*/); // cast à faire ici 
		C test = b.getC();
		test.methodB();
		
	}

}
