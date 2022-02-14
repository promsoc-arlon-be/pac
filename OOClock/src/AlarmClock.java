
public class AlarmClock extends Clock {
	/*
	 * OOP for AlarmClock Language dependent: How represent the AlarmThingToDo?
	 * 
	 * In Squeak: Use a block
	 * 
	 * Clock subclass: #AlarmClock
	 * 
	 * instanceVariableNames: 'alarmTime alarmBlock '
	 * 
	 * classVariableNames: ''
	 * 
	 * poolDictionaries: ''
	 * 
	 * category:
	 * 
	 * alarmBlock: aBlock
	 * 
	 * 	alarmBlock := aBlock.
	 * 
	 * alarmTime
	 * 
	 * 	^alarmTime
	 * 
	 * setAlarmTime: aString
	 * 
	 * 	alarmTime := Time readFrom:
	 * 
	 * 		(ReadStream on: aString).
	 * 
	 * nextSecond delegates up to Clock, then checks the alarmTime 
	 * 
	 * nextSecond 
	 * 
	 * 	super nextSecond. 
	 * 
	 * 	(time = alarmTime) 
	 * 
	 * 		ifTrue: [alarmBlock value].
	 * 
	 * cl := AlarmClock new. 
	 * 
	 * cl setTime: '2:04 pm'. 
	 * 
	 * cl alarmBlock: 
	 * 
	 * 	[3 timesRepeat:
	 * 
	 * 		[Smalltalk beep. Transcript show: 'ALARM!']]. 
	 * 
	 * cl setAlarmTime: '2:05 pm'. 
	 * 
	 * cl start "Don't forget cl stop later!"
	 */
	
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
	  	super(); 
	  	if(Time = alarmTime){ 
	  		for (int i = 1; i <= 3; i++) {
	  			System.out.println("BIP BIP!");
	  		}
	  	}
	 }

}
