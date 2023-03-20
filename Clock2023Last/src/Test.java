import java.util.Date;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		t.testAlarmClock();
		
	} 
	public void testClock() {
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

		// busy
		if (0 == 1) {

			long start = new Date().getTime();
			long stop = new Date().getTime();
			System.out.println(start);
			while (stop - start < 1000) {
				stop = new Date().getTime();
				System.out.println(stop);
			}
			System.out.println("End");
		}
		/*
		 * Time t = new Time(); for(int i = 0; i < 3 * 60; i++) {t.nextSecond();
		 * System.out.println(t);}
		 */
	}
	public void testAlarmClock() {
		//Clock ccc = new Clock(new Time(11,59,58));
		
		AlarmClock alarmClock = new AlarmClock(12,0,0);
		alarmClock.setAlarm(new Time(12,0,2));
		SecondTimer st = new SecondTimer(alarmClock);
		st.startTicking();
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		st.stopTicking();
	
	}

}
