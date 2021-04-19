
public class ReferenceExample {

	// i est un attribut.
	Integer i;
	
	public static void main(String[] args) {

		// a est une reference de type A.
		// A est un type

		// Un type definit un domaine et des operations.
		// Une domaine c'est l'ensemble des valeurs que A
		// peut contenir
		// Les Operations sont les methodes definie dans A.
		
		// refA est une variable temporaire.
		
		A refA = new A();
		refA.setI(32);
		System.out.println(refA.getI());
		
		refA.getI();
	}

}
