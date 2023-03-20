
public class Time {

	int second;
	int minute;
	int hour;

	public Time() {
		super();
		hour = minute = second = 0;
	}
	public Time(int hour,int minute, int seconde) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = seconde;
	}

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
	public boolean compare(Time t) {
		if(t.hour != this.hour)return false;
		if(t.minute != this.minute)return false;
		if(t.second != this.second)return false;
		return true;
	}
}
