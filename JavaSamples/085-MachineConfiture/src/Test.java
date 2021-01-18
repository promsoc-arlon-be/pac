
public class Test {
	public static void main(String[] args) {
		MachineConfiture mc = new MachineConfiture();
		mc.addFruit(new Pomme());
		mc.addFruit(new Pomme());
		mc.addFruit(new Orange());
		mc.addFruit(new Prune());
		mc.cuire();
		mc.sucrer();
		mc.printLabel();
	}
}
