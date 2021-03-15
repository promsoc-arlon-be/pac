import java.awt.Color;
import java.util.ArrayList;

public abstract class Vehicle implements MyInterface {
	int currentSpeed;
	static int vehicleCounter;
	Color c;

	// public abstract void start();
	// public abstract void stop();
	// public abstract void speedUp();
	// public abstract void slowDown();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private ArrayList<Wheel> wheels = new ArrayList<Wheel>();

	public void addWheel(Wheel wheel) {
		this.wheels.add(wheel);
	}

	public Vehicle(Color c, int sizeWheel, int nbWheel) {
		super();
		this.c = c;
		 

		for (int i = 0; i < nbWheel; i++) {
			Wheel w = new Wheel(sizeWheel);
			addWheel(w);
		}
	}

	@Override
	public String toString() {
		return "Vehicle [currentSpeed=" + currentSpeed + ", c=" + c + ", wheels=" + wheels + "]";
	}

	
}
