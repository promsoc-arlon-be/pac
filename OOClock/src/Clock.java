
public class Clock {

	boolean displayFormat;
	Time time = new Time();

	public Clock() {
		
	}
	
	public void start() {
		
	}
	
	public void stop() {
		
	}
	
	public void setTime(int hours, int minutes, int seconds) {
		this.time.hours = hours;
		this.time.minutes = minutes;
		this.time.seconds = seconds;
	}
	
	public void nextSecond() {
		if(this.time.seconds < 59) {
			this.time.seconds += this.time.seconds;
		}
		else if(this.time.seconds == 59) {
			
			this.time.seconds = 0;
			
			if(this.time.minutes < 59) {
				this.time.minutes += this.time.minutes;
			}
			else if(this.time.minutes == 59) {
				
				this.time.minutes = 0;
				
				if(this.time.hours < 23) {
					this.time.hours += this.time.hours;
				}
				else if(this.time.hours == 24) {
					this.time.hours = 1;
				}
			}
		}
	}