
public class Test 
{
	public static void main(String[] args) 
	{
			// création objet de type A référencé par a 	
		A a = new A();	// a est une variable temporaire de la méthode
		
			// dans classe A, attribut appelé b		
		a.setB(new B());	// setter de b
		// idem ci-dessus
		// B b = newB();
		// a.setB(b);
		
			// déférenciation	
		a.print();		// print est la méthode		
		a.getB().print();				
	}
}
