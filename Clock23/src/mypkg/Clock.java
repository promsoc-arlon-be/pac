package mypkg;

public class Clock {

		
		/*----- Variable ----*/
		
		boolean displayFormat;
		Time time;
		boolean stop = false;
		int Hour = 0;
		
		/*---- Constructor ----*/
		
		public Clock(){
			this.time = new Time();
			this.time.hours = this.time.minutes = this.time.seconds = 0;
		}
		
		/*----- Procedure start -----
		 * setting bollean stop as false
		 * working until stop became true
		 * */
		public void start() {
			stop = false;
			while (!stop) {
				nextSecond();
			}
		}
		
		/*----- Procedure stop -----
		 * setting bollean stop as true
		 * */
		public void stop() {
			stop = true;
		}
		
		/*----- Procedure affichage heure -----
		 * @param value integer
		 * */
		public void displayFormat(int value) {
			Hour = this.time.hours;
			if (value == 12) {
				if (Hour == 24) {
					Hour = 0;
				} else if (Hour > 12) {
					Hour = Hour - 12;
				}
			}
			System.out.println("Actual time is:  " + Hour + ":" + this.time.minutes + ":" + this.time.seconds);
		}
		
		/*----- Procedure setting time ------*/
		public void setTime(int hours, int minutes, int seconds) {
			this.time.hours = hours;
			this.time.minutes = minutes;
			this.time.seconds = seconds;
		}
		
		/*----- Procedure changement de seconde*/
		public void nextSecond() {
			/*La classe time doit avoir une procedure next fonction*/
			time.nextSecond();
			/* Affichage en mode 24h */
			displayFormat(24);
		}


	}

}
