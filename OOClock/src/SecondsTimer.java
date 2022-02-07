
public class SecondsTimer {
	Clock clock;

	public void startTicking() throws InterruptedException {
			Thread.sleep(1000);
			clock.nextSecond();
		
	}

	public void stopTicking() {
	}

}
