import java.util.ArrayList;

public class Dessin extends FormeGeometrique {

	private ArrayList<FormeGeometrique> formes = new ArrayList<FormeGeometrique>();

	public void addForme(FormeGeometrique forme) {
		this.formes.add(forme);
	}

	public void dessine() {
		System.out.println("Je dessine un dessin");
		
		for(int i=0; i < formes.size(); i++) {
			// formes.get(i).dessine();
			FormeGeometrique fg = formes.get(i);
			fg.dessine();
		}
	}

}
