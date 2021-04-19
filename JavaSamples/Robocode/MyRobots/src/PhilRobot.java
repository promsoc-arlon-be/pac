import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

public class PhilRobot extends Robot {
	boolean movingForward;

	public void run() {

		while (true) {

			ahead(100);
			turnLeft(90.0);
			turnGunRight(360);

			ahead(100);
			turnLeft(90.0);
			// back(100);

			turnGunRight(360);

			ahead(100);
			turnLeft(90.0);
			ahead(100);
			turnLeft(90.0);
		}
	}

	/**
	 * onScannedRobot: Fire!
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
	}
}
