import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args)
	{
		ArrayList<A> aArray = new ArrayList<A>();
		A tempA = new A(); // lignes 8 et 9 similaires à la ligne 10
		aArray.add(tempA);
		aArray.add(new B());
		aArray.add(new C());
		//aArray.remove(0).methodB();
		A a = aArray.remove(0);
		B ba = (B) aArray.remove(0);
		ba.methodB();
		C ca = (C) (aArray.remove(aArray.size()-1));
		ca.methodB();
		((B)a).methodB();
	}

}
