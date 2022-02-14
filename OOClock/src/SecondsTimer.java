
public class SecondsTimer implements Runnable {
	Clock clock;
	Thread t;

	boolean stop = false;

	public SecondsTimer(Clock clock) {
		super();
		this.clock = clock;
		t = new Thread(this);
	}

	public void startTicking() throws InterruptedException {
		t.start();
		System.out.println("startTicking");

	}

	public void doTicking() throws InterruptedException {
		int i = 0;
		while (stop != true) {
			Thread.sleep(1000);
			clock.nextSecond();
			System.out.println("i: " + i++);
		}
	}

	public SecondsTimer() {
		super();
	}

	public void stopTicking() {
		stop = true;
		System.out.println("stopTicking");
	}

	@Override
	public void run() {
		System.out.println("Starting SecondsTimer");
		try {
			doTicking();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
