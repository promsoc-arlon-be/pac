public class Clock {

		
		/*----- Variable ----*/
		
		boolean displayFormat;
		Time time;
		boolean stop = false;
		int Hour = 0;
		
		/*---- Constructor ----*/
		
		public Clock(){
			this.time = new Time();
			this.time.hour = this.time.minute = this.time.second = 0;
		}
		
		/*----- Procedure start -----
		 * setting boolean stop as false
		 * working until stop became true
		 * */
		public void start() {
			stop = false;
			while (!stop) {
				nextSecond();
			}
		}
		
		/*----- Procedure stop -----
		 * setting boolean stop as true
		 * */
		public void stop() {
			stop = true;
		}
		
		/*----- Procedure affichage heure -----
		 * @param value integer
		 * */
		public void displayFormat(int value) {
			Hour = this.time.hour;
			if (value == 12) {
				if (Hour == 24) {
					Hour = 0;
				} else if (Hour > 12) {
					Hour = Hour - 12;
				}
			}
			System.out.println("Actual time is:  " + Hour + ":" + this.time.minute + ":" + this.time.second);
		}
		
		/*----- Procedure setting time ------*/
		public void setTime(int hours, int minutes, int seconds) {
			this.time.hour = hour;
			this.time.minute = minute;
			this.time.second = second;
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
