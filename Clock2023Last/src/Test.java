
public class Test {



	public static void main(String[] args) {
		Clock c = new Clock();
		SecondTimer st = new SecondTimer(c);
		st.startTicking();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		st.stopTicking();
	}

}
