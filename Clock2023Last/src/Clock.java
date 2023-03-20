public class Clock {

	/*----- Variable ----*/

	public final static int H24 = 24;
	public final static int H12 = 12;
	boolean displayFormat;
	Time time;
	boolean stop = false;
	int diplayHour = 0;

	/*---- Constructor ----*/

	public Clock() {
		this.time = new Time();	
	}
	
	public Clock(Time t) {
		this.time = t;	
	}

	public Clock(int a, int b, int c) {
		time = new Time (a,b,c);
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
		diplayHour = this.time.hour;
		if (value == 12) {
			if (diplayHour == 24) {
				diplayHour = 0;
			} else if (diplayHour > 12) {
				diplayHour = diplayHour - 12;
			}
		}
		System.out.println("Actual time is:  " + diplayHour + ":" + this.time.minute + ":" + this.time.second);
	}

	/*----- Procedure setting time ------*/
	public void setTime(int hours, int minutes, int seconds) {
		this.time.hour = hours;
		this.time.minute = minutes;
		this.time.second = seconds;
	}

	/*----- Procedure changement de seconde*/
	public void nextSecond() {
		/* La classe time doit avoir une procedure next fonction */
		time.nextSecond();
		/* Affichage en mode 24h */
		displayFormat(H24);
	}

}
