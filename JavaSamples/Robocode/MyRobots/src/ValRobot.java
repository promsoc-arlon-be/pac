import robocode.*;

import java.awt.*;

public class ValRobot extends AdvancedRobot {
	// Set to true when setAhead is called, set to false on setBack
	boolean movingForward;

	// Is true when robot is near the wall.
	boolean nearWall;

	// Turn direction clockwise or counterclockwise
	int turnDirection = 1;

	/**
	 * run: main run function
	 */
	public void run() {
		// COSMETICS
		setBodyColor(Color.red);
		setGunColor(Color.yellow);
		setRadarColor(Color.black);
		setBulletColor(Color.white);
		setScanColor(Color.orange);

		// MOVEMENT
		// Direction : ahead
		setAhead(4000);

		// Turn on engine
		movingForward = true;
		
		// Loop forever
		while (true) {


			// Direction received from onScannedRobot()
			turnRight(5 * turnDirection);

			// WALL AVOIDANCE
			// All the time, check if the robot is closer than 20px from the wall, keep
			// nearWall up to date.
			// getX() Returns the X position of the robot. (0,0) is at the bottom left of
			// the battlefield.
			// getY() Returns the Y position of the robot. (0,0) is at the bottom left of
			// the battlefield.
			// getBattleFieldWidth() Returns the width of the current battlefield measured
			// in pixels.
			if (getX() > 60 && getY() > 60 && getBattleFieldWidth() - getX() > 60
					&& getBattleFieldHeight() - getY() > 60 && nearWall == true) {
				nearWall = false;
			}
			if (getX() <= 60 || getY() <= 60 || getBattleFieldWidth() - getX() <= 60
					|| getBattleFieldHeight() - getY() <= 60) {
				if (nearWall == false) {
					reverseDirection();
					nearWall = true;
				}

				// Executes any pending actions, or continues executing actions that are in
				// process. This call returns after the actions have been started.
				execute();
			}

//			

		}

	}

	/**
	 * onHitWall: Handle collision with wall.
	 */
	public void onHitWall(HitWallEvent e) {
		// Bounce off!
		reverseDirection();
	}

	/**
	 * reverseDirection: Switch from ahead to back & vice versa
	 */
	public void reverseDirection() {
		if (movingForward) {
			setBack(4000);
			movingForward = false;
		} else {
			setAhead(4000);
			movingForward = true;
		}
	}

	/**
	 * onScannedRobot: Fire at him and ram him!
	 */
	public void onScannedRobot(ScannedRobotEvent e) {

		// FIRE ON ENEMY
		if (e.getDistance() < 300 && e.getEnergy() > 3) {
			fire(3);
		} else if (e.getDistance() < 600 && e.getEnergy() > 2) {
			fire(2);
		} else {
			fire(1);
		}

		// MOVE TOWARDS ENEMY AND RAM HIM
		// getBearing: Returns the bearing to the robot you scanned, relative to your
		// robot's heading, in degrees (-180 <= getBearing() < 180)
		if (e.getBearing() >= 0) {
			turnDirection = 1;
		} else {
			turnDirection = -1;
		}

		// getDistance: Returns the distance to the robot (your center to his center).
		turnRight(e.getBearing());
		ahead(e.getDistance() + 5); // Ram enemy
		scan();
	}

	/**
	 * onHitRobot: Fire at him and ram him!
	 */
	public void onHitRobot(HitRobotEvent e) {
		if (e.getBearing() >= 0) {
			turnDirection = 1;
		} else {
			turnDirection = -1;
		}
		turnRight(e.getBearing());

		if (e.getEnergy() > 3) {
			fire(3);
		} else if (e.getEnergy() > 2) {
			fire(2);
		} else {
			fire(1);
		}

		ahead(40); // Ram him again!

	}
}
