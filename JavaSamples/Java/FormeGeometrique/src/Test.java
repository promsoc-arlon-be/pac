
public class Test {
	public static void main(String[] args) {
		Coordonnee x = new Coordonnee(3, 0);
		Coordonnee y = new Coordonnee(0, 3);
		Coordonnee z = new Coordonnee(0, 0);
		Triangle t1 = new Triangle(x, y, z);

		// Triangle.dessine(); --> appel de methode statique

		t1.dessine();

		Coordonnee c = new Coordonnee(4, 4);
		Cercle c1 = new Cercle(c, 1);

		Dessin d1 = new Dessin();
		d1.addForme(t1);
		d1.addForme(c1);
		d1.dessine();

	}

}
