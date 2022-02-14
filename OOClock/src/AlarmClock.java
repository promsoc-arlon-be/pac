public class AlarmClock extends Clock {

	// alarm ???

	Time alarmTime = new Time();

	public Time getAlarmTime() {
		return alarmTime;
	}

	public void setAlarmTime(int hours, int minutes, int seconds) {
		this.alarmTime.hours = hours;
		this.alarmTime.minutes = minutes;
		this.alarmTime.seconds = seconds;
	}

	public void nextSecond() {
		super.nextSecond();
		if (time.equals(alarmTime)==true) {
			for (int i = 1; i <= 3; i++) {
				System.out.println("BIP BIP!");
			}
		}
	}

}
