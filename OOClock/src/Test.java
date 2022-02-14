
public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		t.test1();
		t.test2();
	}

	public void test1() {

		Clock cl = new Clock();
		cl.setTime(19, 58, 53);

		SecondsTimer st = new SecondsTimer(cl);
		try {
			st.startTicking();
			Thread.sleep(10 * 1000);
		} catch (InterruptedException e) {
			System.out.println("J'ai été interrompu ...");
		}
		st.stopTicking();
	}

	public void test2() {
		// TODO Auto-generated method stub
		AlarmClock cl = new AlarmClock();
		cl.setTime(19, 58, 53);
		cl.setAlarmTime(19, 58, 57);

		SecondsTimer st = new SecondsTimer(cl);
		try {
			st.startTicking();
			Thread.sleep(10 * 1000);
		} catch (InterruptedException e) {
			System.out.println("J'ai été interrompu ...");
		}
		st.stopTicking();
	}

}
