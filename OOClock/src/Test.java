
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock cl = new Clock();
		cl.setTime(19, 58, 53);
		
		SecondsTimer st = new SecondsTimer(cl);
		try {
			st.startTicking();
			Thread.sleep(10*1000);
		}catch(InterruptedException e) {
			System.out.println("J'ai été interrompu ...");
		}
		st.stopTicking();
	}

}
