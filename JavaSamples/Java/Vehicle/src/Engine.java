
public class Engine {

	public static final int STEP = 500;
	int capacity;
	int maximumRPM;
	int currentRPM;

	GearBox gearBox;

	public Engine(int capacity, int maximumRPM) {
		super();
		this.capacity = capacity;
		this.maximumRPM = maximumRPM;
	}

	public int getCurrentRPM() {
		return currentRPM;
	}

	public void setCurrentRPM(int currentRPM) {
		this.currentRPM = currentRPM;
	}
	
	public void accelerate() throws AlreadyInMaxRPM {
		if (currentRPM + STEP >= maximumRPM) {
			AlreadyInMaxRPM e = new AlreadyInMaxRPM(); 
			throw e;
		}
		
		this.currentRPM += STEP;
		System.out.println("Current RPM : " + currentRPM);
		
	}

	public GearBox getGearBox() {
		return gearBox;
	}

	public void setGearBox(GearBox gearBox) {
		this.gearBox = gearBox;
	}

	public void start() {
		System.out.println("Je demarre le moteur");
		
	}

}
