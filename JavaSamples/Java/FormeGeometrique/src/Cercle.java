
public class Cercle extends FormeGeometrique {
	
	//attributs d'instance car sans "static"
	private Coordonnee centre;
	private int rayon;

	public Coordonnee getCentre() {
		return centre;
	}

	public void setCentre(Coordonnee centre) {
		this.centre = centre;
	}

	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	public Cercle(Coordonnee centre, int rayon) { // constructeur avec une valeur ajoutee
		this.centre = centre;
		this.rayon = rayon;
	}

	public void dessine() {
		super.dessine();
		
		System.out.println("Je suis un cercle");
		System.out.println(" de rayon : " + rayon);
		System.out.println(" et de centre : " + centre);
	}

}
