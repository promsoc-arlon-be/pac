
public class MyClass extends Object {	// définition de la classe

	public static void main(String[] args) {
		MyClass constructor = new MyClass();	// appelle le constructeur ligne 17 (par défaut)
		MyClass constructor2 = new MyClass("toto");	// appelle le constructeur ligne 12 (pas par défaut car argument)
		constructor.s = "tutu";
	}

	private String s;
	
	public MyClass(String s){	// définition du constructeur avec argument
		super();		// fait référence à la superclasse (object)
		this.s  = s;	// affecte une valeur à l'attribut s
	}

	public MyClass() {		//définition du constructeur par défaut
		//MyClass("Hello");
		this("Hello");	// appelle le constructeur de la classe courante
	}
}
