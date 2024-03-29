
public class Clock {

	boolean displayFormat;
	Time time;
	boolean stopped = false;
	int displayedHour = 0;

	public Clock() {
		this.time = new Time();
		this.time.hours = this.time.minutes = this.time.seconds = 0;
	}

	public void start() {
		stopped = false;
		while (!stopped) {
			// Thread.sleep(1000);
			nextSecond();
		}
	}

	public void stop() {
		stopped = true;
	}

	public void displayFormat(int value) {
		displayedHour = this.time.hours;
		if (value == 12) {
			if (displayedHour == 24) {
				displayedHour = 0;
			} else if (displayedHour > 12) {
				displayedHour = displayedHour - 12;
			}
		}
		System.out.println("Il est actuellement " + displayedHour + ":" + this.time.minutes + ":" + this.time.seconds);
	}

	public void setTime(int hours, int minutes, int seconds) {
		this.time.hours = hours;
		this.time.minutes = minutes;
		this.time.seconds = seconds;
	}

	public void nextSecond() {
		time.nextSecond();
		displayFormat(24);

	}

}