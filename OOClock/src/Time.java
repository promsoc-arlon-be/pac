
public class Time {

	int hours;
	int minutes;
	int seconds;
	
	public void nextSecond()
	{
		if(seconds < 60)
		{
			seconds += 1;
		}
		else 
		{
			seconds = 0;
			nextMinutes();
		}
	}
	
	public void nextMinutes()
	{
		if(minutes < 60)
		{
			minutes += 1;
		}
		else 
		{
			minutes = 0;
			nextHours();
		}
	}
	
	public void nextHours()
	{
		if(hours < 24)
		{
			hours += 1;
		}
		else
		{
			hours = 0;
			nextSecond();
		}
		
	}
}
