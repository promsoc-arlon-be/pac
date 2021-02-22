
public class Coordonnee {
	private int x, y;

	@Override
	public String toString() {
		return "Coordonnee " + x + " " + y;
	}

	public Coordonnee(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}
}
