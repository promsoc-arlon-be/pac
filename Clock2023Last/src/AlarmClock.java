
public class AlarmClock extends Clock {
	
	public Time getAlarm() {
		return alarm;
	}
	public void setAlarm(Time alarm) {
		this.alarm = alarm;
	}
	public AlarmClock(int a,int b,int c) {
		super(a,b,c);
	}
	Time alarm;
	
	public void nextSecond() {
		super.nextSecond();
		if(time.compare(alarm)) {
			System.out.println("Je sonne!!!");
		}
	}
	

}
