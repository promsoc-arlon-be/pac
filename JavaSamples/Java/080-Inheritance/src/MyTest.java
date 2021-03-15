
public class MyTest {

	public static void main(String[] args) {

		/* digression
		MyClass mc = new MyClass();
		String s = mc.printIt(2);
		System.out.println(s);
		mc.printIt();
		*/
		
		MyClass mc = new MyClass();
		mc.printIt();
		MyExtendedClass mec = new MyExtendedClass();
		mec.printIt();
		mec.methodOfTheExtendedClass();
		
		// hard
		
		MyClass mc2 = new MyExtendedClass();
		mc2.printIt();
		
		MyExtendedClass mec2 = (MyExtendedClass) mc2;
		mec2.methodOfTheExtendedClass();
		
		
	}
	
}
