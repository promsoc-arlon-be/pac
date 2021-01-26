// A ---> B

public class A {

	private B b; //attribut b de type B

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	
	public void print()
	{
		System.out.println("Je suis un A");
	}

}
