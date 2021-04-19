import java.awt.Color;

import robocode.AdvancedRobot;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;
import robocode.TurnCompleteCondition;

public class PhilAdvRobot extends PhilBaseRobot {
	boolean movingForward;

	final static double DISTANCE = 100;
	final static double DISTANCE_TURN = 10;
	final static double DISTANCE_REVERSE = 20;

	boolean stillCloseToX = false;
	boolean stillCloseToY = false;

	/**
	 * run: Crazy's main run function
	 */
	public void run() {
		// Set colors
		setBodyColor(new Color(200, 0, 0));
		setGunColor(new Color(0, 150, 50));
		setRadarColor(new Color(0, 100, 100));
		setBulletColor(new Color(255, 255, 100));
		setScanColor(new Color(255, 200, 200));

		h = getBattleFieldHeight();
		w = getBattleFieldWidth();

		// The board

		System.out.println("Width: " + w + " Height: " + h);
		System.out.println("Position: " + getX() + " " + getY() + " " + getHeading() + " " + getVelocity());
		System.out.println("Velocity " + getVelocity());

		// Loop forever
		while (true) {

			setMaxVelocity(SPEED);
			// Position
			x = getX();
			y = getY();
			heading = getHeading();
			v = getVelocity();
			if (isCloseOfBorder(x, y)) {
				setMaxVelocity(SPEED / 2);
				reverseDirectionAndTurn();
			}
			// Tell the game we will want to move ahead 40000 -- some large number
			setAhead(DISTANCE);
			movingForward = true;
			// Tell the game we will want to turn right 90
			// setTurnRight(85);
			// setTurnRadarLeft(360);

			// At this point, we have indicated to the game that *when we do something*,
			// we will want to move ahead and turn right. That's what "set" means.
			// It is important to realize we have not done anything yet!
			// In order to actually move, we'll want to call a method that
			// takes real time, such as waitFor.
			// waitFor actually starts the action -- we start moving and turning.
			// It will not return until we have finished turning.
			// waitFor(new TurnCompleteCondition(this));
			// Note: We are still moving ahead now, but the turn is complete.
			// Now we'll turn the other way...
			// setTurnLeft(90);
			// ... and wait for the turn to finish ...
			// waitFor(new TurnCompleteCondition(this));
			// ... then the other way ...
			// setTurnRight(90);
			// .. and wait for that turn to finish.
			position();
			oldX = x;
			oldY = y;

			waitFor(new TurnCompleteCondition(this));
			// then back to the top to do it all again
			// execute();

		}

	}

	/**
	 * onHitWall: Handle collision with wall.
	 */
	public void onHitWall(HitWallEvent e) {
		System.out.println("onHitWall");
		System.out.println("Location: " + getX() + " " + getY());
		// Bounce off!
		reverseDirection();
	}

	public void position() {
		System.out.println("Position now: " + x + " " + y);
		System.out.println("Position old: " + oldX + " " + oldY);
		double diffX = x - oldX;
		double diffY = y - oldY;

		System.out.println("Difference: " + diffX + " " + diffY);
		System.out.println("Bearing: " + getHeading());

		if (0 < diffX) {
			System.out.println("Right>>");
		} else {
			System.out.println("<< Left");
		}
		if (0 < diffY) {
			System.out.println("/\\ Up");
		} else {
			System.out.println("\\/ Down");
		}
	}

	/**
	 * reverseDirection: Switch from ahead to back & vice versa
	 */
	public void reverseDirectionAndTurn() {
		System.out.println("reverseDirectionAndTurn");
		stop();
		// if (getHeading() < 180)
		setTurnRight(-15);
		// else
		// setTurnRight(45);
		reverseDirection();
		// turnGunRight(180);
		setMaxVelocity(2);
	}

	public void reverseDirection() {
		System.out.println("reverseDirection");
		System.out.println("Position: " + getX() + " " + getY() + " " + getHeading() + " " + getVelocity());
		if (movingForward) {
			setBack(DISTANCE_TURN);
			// back(1000);
			movingForward = false;
		} else {
			setAhead(DISTANCE_REVERSE);
			// ahead(1000);
			movingForward = true;
		}
	}

	/**
	 * onScannedRobot: Fire!
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// System.out.println("Bearing " + e.getBearing());

		// setTurnRight(e.getBearing() + 90 - 30);
		// Assuming radar and gun are aligned...
		if (e.getDistance() < 100) {
			fire(3);
		} else {
			fire(1);
		}
	}

	/**
	 * onHitRobot: Back up!
	 */
	public void onHitRobot(HitRobotEvent e) {
		System.out.println("onHitRobot");
		// If we're moving the other robot, reverse!
		// if (e.isMyFault()) {
		reverseDirection();
		// }
	}
}
