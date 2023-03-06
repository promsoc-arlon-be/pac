
public class Time {

	int second;
	int minute;
	int hour;

	public void nextSecond() {
		if (second < 59)
			second += 1;
		else {
			second = 0;
			nextMinute();
		}
	}

	@Override
	public String toString() {
		return "Time [second=" + second + ", minute=" + minute + ", hour=" + hour + "]";
	}

	public void nextMinute() {
		if (minute < 59)
			minute += 1;
		else {
			minute = 0;
			nextHour();
		}
	}

	public void nextHour() {
		if (hour < 23)
			hour += 1;
		else {
			hour = 0;
			nextSecond();
		}
	}
}
