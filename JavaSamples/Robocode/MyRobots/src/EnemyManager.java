import java.util.Hashtable;
import java.util.Map;

import robocode.ScannedRobotEvent;

public class EnemyManager {
	/*
	 * holds a reference to a SINGLETON instance of this class to ensure that it
	 * only ever gets instantiated once
	 */

	private static EnemyManager SINGLETON = new EnemyManager();
	/*
	 * holds a map of all our enemy information objects as values with the enemies
	 * name's used as keys.
	 */
	private Map m_allInformation = null;

	// private constructor used to hide unnecessary instantiation
	private EnemyManager() {
		// We want to use a Hashtable, since it is synchronized so
		// we need not worry about data integrity for the most part.
		m_allInformation = new Hashtable();
	}

	// Method which is used to get an instance of this class, as
	// it exists.
	public static EnemyManager getInstance() {
		return SINGLETON;
	}

	// Method use to log an enemy object in the manager
	public Enemy log(ScannedRobotEvent in_event) {
		Enemy newEnemy = EnemyImpl.createEnemy(in_event);
		EnemyCollection col = (EnemyCollection) m_allInformation.get(newEnemy.getName());
		if (null == col) {
			col = new EnemyCollection(newEnemy);

			m_allInformation.put(newEnemy.getName(), col);
		} else {
			col.add(newEnemy);
		}
		;
		return col;
	}

	// Method used to get a dynamic enemy object. By dynamic
	// this means, that calls to any of the methods will always
	// get the most recent data. This does not necessary imply
	// that the data is current, it's just the most current.
	public Enemy get(String in_name) {
		return (Enemy) m_allInformation.get(in_name);
	}

	// Method used to get a reference to an enemy at a certain
	// point in time.
	public Enemy get(String in_name, int in_time) {
		EnemyCollection col = (EnemyCollection) m_allInformation.get(in_name);
		return (null == col) ? null : col.get(in_time);
	}

	// Method used to return the maximum number of cached items
	// we store on any Enemy at any given time.
	public static final int getCacheSize() {
		return EnemyCollection.MAX_STACK_SIZE;
	}
};