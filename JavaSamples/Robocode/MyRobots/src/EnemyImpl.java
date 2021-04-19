import robocode.ScannedRobotEvent;

class EnemyImpl extends Object implements Enemy {
	// Members
	private String m_name = null;
	private double m_energy = 0;
	private double m_velocity = 0;

	// Constructor
	private EnemyImpl() {
	}

	// Set methods
	private void setName(String in_newName) {
		m_name = in_newName;

	}

	private void setEnergy(double in_newEnergy) {
		m_energy = in_newEnergy;

	}

	private void setVelocity(double in_newVelocity) {
		m_velocity = in_newVelocity;

	}

	// Get methods
	public String getName() {
		return m_name;

	}

	public double getEnergy() {
		return m_energy;

	}

	public double getVelocity() {
		return m_velocity;

	}

	// Method used to create an instance of an enemy impl object.
	public static final Enemy createEnemy(ScannedRobotEvent in_event) {
		EnemyImpl out_enemy = new EnemyImpl();
		out_enemy.setName(in_event.getName());
		out_enemy.setEnergy(in_event.getEnergy());
		out_enemy.setVelocity(in_event.getVelocity());
		return out_enemy;

	}
};