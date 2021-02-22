import java.awt.Color;

public class Bicycle extends Vehicle {

	public Bicycle(Color c, int sizeWheel, int nbWheel) {
		super(c, sizeWheel, nbWheel);
	}

	@Override
	public void start() {
		System.out.println("Je demarre");
	}

	@Override
	public void stop() {
		System.out.println("Je m'arrete");
	}

	@Override
	public void speedUp() {
		System.out.println("J'accelere");
	}

	@Override
	public void slowDown() {
		System.out.println("Je decelere");
		
	}

	@Override
	public String toString() {
		return "Bicycle [currentSpeed=" + currentSpeed + ", c=" + c + "]";
	}

}
