import java.util.ArrayList;

//100 - Class Cast

public class B extends A{   //la classe B hérite de la classe A

	private ArrayList<C> cArray = new ArrayList<C>();
	
	public void addC (C varC)
	{
		cArray.add(varC);
	}
	
	public void methodB(/*B affi*/)  // création d'une méthode "methodB" dans la classe B
	{
		
		System.out.print("Je suis la methodB qui renvoie :"/* + valeur de l'arraylist*/); //je voulais renvoyer la valeur dans l'arraylist via la methodB
		//cArray.get(0).print(); //doit être obtenu autrement
		
	}
	
	public C getC(/*int x*/)
	{
		return cArray.get(0);  //get(0) similaire à [0] pour un tableau
	}
	
	public void print()
	{
		System.out.println("Je suis une liste dans la class B qui contient : ");
		for(int x = 0; x < cArray.size(); x++)
		{
			cArray.get(x).print();
		}
	}
}
