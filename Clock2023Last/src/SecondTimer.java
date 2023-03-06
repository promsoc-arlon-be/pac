
public class SecondTimer {

	public SecondTimer() implements Runnable{
		
		// attributs
		
		// objet clock
		Clock clock;
		Thread t; 
		boolean flag = false;
		
		
		// constructeur
		
		public void SecondTimer(clock clock) {
			this.clock = clock;
			t = new Thread(this);
		}
		
		// methode
		public void startTicking () {
			t.start();
			System.out.println("tick tock tick tock");
		}
		
		public void stopTicking () {
			flag = true;
			t.sleep();
			System.out.println("Stop ticking");
		}
		
	
		// methode run qui lancera les threads
		
		public void run() throws InterruptedException{
			
			System.out.println(" the second timer is launched !");
			try {
				TimerTicking();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		// Timer cf schema
		
		public void timerTicking() throws InterruptedException {
			
			Thread.sleep(null);
		}
		
	}

}
