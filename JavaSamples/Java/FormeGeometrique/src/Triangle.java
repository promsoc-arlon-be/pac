
public class Triangle extends FormeGeometrique {
	private Coordonnee x;
	private Coordonnee y;
	private Coordonnee z;

	public Coordonnee getX() {
		return x;
	}

	public void setX(Coordonnee x) {
		this.x = x;
	}

	public Coordonnee getY() {
		return y;
	}

	public void setY(Coordonnee y) {
		this.y = y;
	}

	public Coordonnee getZ() {
		return z;
	}

	public void setZ(Coordonnee z) {
		this.z = z;
	}

	public Triangle(Coordonnee x, Coordonnee y, Coordonnee z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public void dessine() {
		// TODO Auto-generated method stub
		super.dessine();

		System.out.println("Je suis un triangle");
		System.out.println(" de sommet : " + x.toString());
		System.out.println(" ; " + y);
		System.out.println(" ; " + z);
	}

}
