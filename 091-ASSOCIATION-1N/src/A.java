import java.util.ArrayList;
// 1 ---> N
public class A {
	private ArrayList<B> bArray = new ArrayList<B>();
	
	public void addB( B b)
	{
		bArray.add(b);
	}
	
	public B getB(/*int x*/)
	{
		return bArray.get(0);  //get(0) similaire à [0] pour un tableau
			//ou get(x) 		// = indice 0
	}
	
	public void print()
	{
		System.out.println("Je suis un A qui contient : ");
		for(int x = 0; x < bArray.size(); x++)
		{
			bArray.get(x).print();
		}
	}
}
