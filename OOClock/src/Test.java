
public class Test {

	public static void main(String[] args) {
		Clock cl = new Clock();
		// cl.displayFormat("12");
		// cl.setTime("2.05 pm");

		SecondsTimer st = new SecondsTimer(new Clock());
		try {
			st.startTicking();
			Thread.sleep(10*1000);
		} catch (InterruptedException e) {
			System.out.println("J'ai été interrompu ...");
		}
		st.stopTicking();
	}

}
