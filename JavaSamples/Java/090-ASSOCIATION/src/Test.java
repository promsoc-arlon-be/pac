
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//je crée un objet a de type A et il est référencé par a.
		// a est une variable temporaire parce qu'on est dans une méthode
		A a = new A();
		
		//Dans la classe A, il y a un attribut appelé b
		//setter de b
		a.setB(new B());
		//similaire à B b = new B(); a.setB(b); 
		
		// le point c'est la déréferenciation
		//le print est la méthode
		a.print();
		a.getB().print();
	}

}
