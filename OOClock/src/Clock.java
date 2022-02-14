
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
		while(!stopped) {
			Thread.sleep(1000);
			nextSecond();
		}
	}
	
	public void stop() {
		stopped = true;
	}
	
	public void displayFormat(int value) {
		displayedHour = this.time.hours;
		if(value == 12) {
			if(displayedHour == 24) {
				displayedHour = 0;
			}
			else if(displayedHour > 12){
				displayedHour = displayedHour - 12;
			}
		}		
		System.out.println("Il est actuellement " + displayedHour + ":" + this.time.minutes + ":" + this.time.seconds);
	}
	
	
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}  
	
	public void setTime(int hours, int minutes, int seconds) {
		this.time.hours = hours;
		this.time.minutes = minutes;
		this.time.seconds = seconds;
	}
	
	public void nextSecond() {
		if(this.time.seconds < 59) {
			this.time.seconds += 1;
		}
		else if(this.time.seconds == 59) {
			
			this.time.seconds = 0;
			
			if(this.time.minutes < 59) {
				this.time.minutes += 1;
			}
			else if(this.time.minutes == 59) {
				
				this.time.minutes = 0;
				
				if(this.time.hours < 23) {
					this.time.hours += 1;
				}
				else if(this.time.hours == 24) {
					this.time.hours = 1;
				}
			}
		}
		clearScreen();
		displayFormat(24);
	}