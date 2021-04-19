import java.util.ArrayList;

public class TemplateExample {

	public void sansTemplate() {
		ArrayList a = new ArrayList();
		a.add(new Integer(32));
		a.add(33);
		// a.add(new Double(0));

		for (int k = 0; k < a.size(); k++) {
			// Integer i = a.get(k);
			Object o = a.get(k);
			Integer i = (Integer) (o);
			System.out.println(i);
		}
	}

	public void avecTemplate() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(new Integer(32));
		a.add(33);
		// a.add(new Double(0));

		for (int k = 0; k < a.size(); k++) {
			Integer i = a.get(k);
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		TemplateExample t = new TemplateExample();
		t.sansTemplate();
		t.avecTemplate();
		
		// Double dd = new Double("2.0");
		// String s = "2.0";
		// dd = s;
		

	}
}
