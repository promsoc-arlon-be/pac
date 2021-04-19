import java.awt.Color;

import robocode.AdvancedRobot;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;
import robocode.TurnCompleteCondition;

public class PhilMemoryAdvRobot extends PhilBaseRobot {
	boolean movingForward;

	final static double DISTANCE = 200;
	final static double DISTANCE_TURN = 10;
	final static double DISTANCE_REVERSE = 20;

	EnemyManager em = null;

	public PhilMemoryAdvRobot() {
		em = EnemyManager.getInstance();
	}

	public void run() {

		// Loop forever
		while (true) {
			setAhead(DISTANCE);
			waitFor(new TurnCompleteCondition(this));
			// setTurnLeft(60);
			// waitFor(new TurnCompleteCondition(this));
			// setAhead(DISTANCE);
			// waitFor(new TurnCompleteCondition(this));
			// setTurnRight(60);
			// waitFor(new TurnCompleteCondition(this));
			for (int i = 0; i < 2; i++) {
				setTurnRadarLeft(45);
				setAhead(DISTANCE);
				waitFor(new TurnCompleteCondition(this));
			}
			waitFor(new TurnCompleteCondition(this));
		}
	}

	public void onHitWall(HitWallEvent e) {
		System.out.println("onHitWall");
		System.out.println("Location: " + getX() + " " + getY());
		// Bounce off!
		reverseDirection();
	}

	public void reverseDirection() {
		System.out.println("reverseDirection");
		System.out.println("Position: " + getX() + " " + getY() + " " + getHeading() + " " + getVelocity());
		stop();
		setTurnLeft(90);
		waitFor(new TurnCompleteCondition(this));
		setAhead(DISTANCE);
		waitFor(new TurnCompleteCondition(this));
		setTurnLeft(90);
		waitFor(new TurnCompleteCondition(this));
		setAhead(DISTANCE);
		waitFor(new TurnCompleteCondition(this));
	}

	/**
	 * onScannedRobot: Fire!
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		System.out.println("Bearing " + e.getBearing());
		System.out.println("Distance " + e.getDistance());
		System.out.println("Energy: " + e.getEnergy());
		System.out.println("Name: " + e.getName());
		if(e.getDistance() > 80)
			setAhead(10);
		setTurnRight(e.getBearing());
		waitFor(new TurnCompleteCondition(this));
		Enemy enemy = em.get(e.getName());
		em.log(e);
		System.out.println(e);
		
		// Assuming radar and gun are aligned...
		if (e.getDistance() < 100) {
			fire(3);
		} else {
			fire(1);
		}

	}

}
