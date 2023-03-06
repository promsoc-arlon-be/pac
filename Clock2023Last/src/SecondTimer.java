
public class SecondTimer implements Runnable {

	// objet clock
	Clock clock;
	Thread t;
	boolean flag = false;

	// constructeur

	public SecondTimer(Clock clock) {
		this.clock = clock;
		t = new Thread(this);
	}

	// methode
	public void startTicking() {
		flag = true;
		t.start();
		System.out.println("tick tock tick tock");
	}

	public void stopTicking() {
		flag = false;
		//t.stop();
		System.out.println("Stop ticking");
	}

	// methode run qui lancera les threads

	public void run(){

		while (flag == true) {
			System.out.println(" the second timer is launched !");
			try {
				timerTicking();

			} catch (InterruptedException e) {
				e.printStackTrace();
				flag = false;
			}
		}
		System.out.println("Thread terminated");
	}

	// Timer cf schema

	public void timerTicking() throws InterruptedException {

		Thread.sleep(1000);
		System.out.println("a second elapsed");
		clock.nextSecond();
	}

}
