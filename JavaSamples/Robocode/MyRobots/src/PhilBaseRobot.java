import robocode.AdvancedRobot;

public class PhilBaseRobot extends AdvancedRobot {

	final static double BORDER_WIDTH = 100;
	final static double SPEED = 8;
	
	double h;
	double w;
	double x;
	double y;
	double heading;
	double v;

	double oldX;
	double oldY;

	protected boolean isCloseOfBorder(double x, double y) {
		System.out.println("x " + x + " y " + y);
		System.out.println("w " + w + " h " + h);
		if (x < BORDER_WIDTH || w - BORDER_WIDTH < x) {
			System.err.println("Close to X: " + (w - x));
			return true;
		} else {
		}
		if (y < BORDER_WIDTH || h - BORDER_WIDTH < y) {
			System.err.println("Close to Y: " + (h - y));
			return true;
		} else {
		}
		return false;
	}
}
