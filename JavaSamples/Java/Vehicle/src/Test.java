import java.awt.Color;

public class Test {

	public static void main(String[] args) {
		Bicycle b1 = new Bicycle(Color.RED, 24, 2);
		System.out.println(b1);
		
		Car c1 = new Car(2000, 8500, 6, Color.BLUE, 19, 4);
		System.out.println(c1);
		
		c1.start();
		c1.getGb().setCurrentGear(1);
		c1.getE().setCurrentRPM(500);
		c1.speedUp();
		c1.slowDown();
		c1.stop();
	}

}
