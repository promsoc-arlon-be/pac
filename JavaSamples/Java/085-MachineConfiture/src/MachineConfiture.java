import java.util.ArrayList;
import java.util.Iterator;

public class MachineConfiture {

	ArrayList<Fruit> recipient = new ArrayList<Fruit>();

	public void addFruit(Fruit f) {
		recipient.add(f);
	}

	public void cuire() {

	}

	public void sucrer() {

	}

	public void printLabel() {
		System.out.print("Confiture de: ");
		Iterator<Fruit> i = recipient.iterator();
		while (i.hasNext()) {
			Fruit f = i.next();
			System.out.print(f.toString() + ", ");
		}
		System.out.println(".");
	}
}
