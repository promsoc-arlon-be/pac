
public class Time {
	int hours;
	int minutes;
	int seconds;

	public void nextSecond() {
		if (seconds < 59) {
			seconds += 1;
		} else {
			seconds = 0;
			nextMinute();
		}
	}

	public void nextMinute() {
		if (minutes < 59) {
			minutes += 1;
		} else {
			minutes = 0;
			nextHour();
		}
	}

	public void nextHour() {
		if (hours < 23) {
			hours += 1;
		} else {
			hours = 0;
			nextSecond();
		}
	}

	public boolean equals(Time obj) {
		if (hours == obj.hours) {
			if (minutes == obj.minutes) {
				if (seconds == obj.seconds) {
					return true;
				}
			}
		}
		return false;
	}

}
