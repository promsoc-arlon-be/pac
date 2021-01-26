// A ---> B
// 1 ---> n

import java.util.ArrayList;

public class A {
	private ArrayList<B> b_Array = new ArrayList<B>();

	public void addB(B b) {
		b_Array.add(b);
	}

	public B getB(int i) {
		return b_Array.get(0);
	}

	public void print() {
		System.out.println("Je suis un A");
		for (int i = 0; i < b_Array.size(); i++) {
			b_Array.get(i).print();
			// idem ci-dessus getB(i).print();
		}
	}
}
