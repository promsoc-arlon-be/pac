
public class Engine {

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
