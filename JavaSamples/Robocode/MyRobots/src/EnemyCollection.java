
class EnemyCollection implements Enemy {
	/*
	 * constant which holds our maximum stack size - the number of Enemy information
	 * objects to maintain
	 */
	protected static final int MAX_STACK_SIZE = 500;
	private Enemy[] m_information = new Enemy[MAX_STACK_SIZE];
	private int next = 0;
	private int size = 0;
	/*
	 * our constructor, which takes in the first object in our collection, this
	 * ensures that any collection always has at least one entry.
	 */

	public EnemyCollection(Enemy in_newEnemy) {
		add(in_newEnemy);

	}

	public void add(Enemy in_new) {
		size = (size == MAX_STACK_SIZE) ? size : size + 1;
		m_information[next] = in_new;
		next = (next + 1) % MAX_STACK_SIZE;
	}
	// Method used to get a enemy represented by an index,
	// where 0 is the last element inserted.

	public Enemy get(int in_index) {
		int index = next - in_index - 1;
		if (index < 0)
			index += MAX_STACK_SIZE;
		return m_information[index];

	}
	// Method that returns the number of Enemy object
	// that we currently are storing.

	public int size() {
		return size;

	}

	// Enemy interface methods /* NOTE: By having this class implement enemy, we can
	// use it * as an enemy object and be ensured that whenever it is * updated, we
	// always have the most recent information */
	public String getName() {
		return get(0).getName();

	}

	public double getEnergy() {
		return get(0).getEnergy();

	}

	public double getVelocity() {
		return get(0).getVelocity();

	}

}
