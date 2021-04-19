import java.awt.Color;

public class MotorVehicle extends Vehicle {
	Engine e;
	GearBox gb;

	public MotorVehicle(int capacity, int maximumRPM, int numberOfGear, Color c, int sizeWheel, int nbWheel) {
		super(c, sizeWheel, nbWheel);

		e = new Engine(capacity, maximumRPM);
		gb = new GearBox(numberOfGear);

		e.setGearBox(gb);
		gb.setEngine(e);
	}

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	public GearBox getGb() {
		return gb;
	}

	public void setGb(GearBox gb) {
		this.gb = gb;
	}

	@Override
	public void start() {
		System.out.println("Je demarre");
		e.start();
		gb.setCurrentGear(1);
	}

	@Override
	public void stop() {
		System.out.println("Je m'arrete");
		gb.setCurrentGear(0);
	}

	@Override
	public void speedUp() {
		System.out.println("J'accelere");
		while (true) {
			try {
				getE().accelerate();
			} catch (AlreadyInMaxRPM e) {
				try {
					getGb().gearUp();
					getE().setCurrentRPM(Engine.STEP);
				} catch (AlreadyInMaxGear e1) {
					System.out.println("ralentis coco !");
					return;
				}

			}
		}
	}

	@Override
	public void slowDown() {
		System.out.println("Je decelere");

	}

	@Override
	public String toString() {
		return "MotorVehicle [currentSpeed=" + currentSpeed + ", c=" + c + ", toString()=" + super.toString() + "]";
	}

}
