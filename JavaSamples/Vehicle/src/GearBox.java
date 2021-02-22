
public class GearBox {

	int numberOfGear;
	int currentGear;
	
	Engine engine;
	

	public GearBox(int numberOfGear) {
		super();
		this.numberOfGear = numberOfGear;
	}


	public int getCurrentGear() {
		return currentGear;
	}


	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}


	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	

}
