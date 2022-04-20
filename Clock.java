public class Clock {
	private int hour;
	private int seconds;
	private int minute;
	private String time;
	
	
	public Clock(int hour, int sconds, int minute) {
		
		this.hour = hour;
		this.seconds = seconds;
		this.minute = minute; 
	}
	
	public void setHour(){
		if (hour > 23) {
			this.hour = 0;
		}
	}
	
	public void setSeconds(){
		if (seconds > 59) {
			this.seconds = 0;
		}
		this.seconds = seconds;
	}
	
	public void setMinutes(){
		if (minute > 59) {
			this.minute = 0;
		}
	}
	
	public int getMinute(){
		return minute;
	}
	
	public int getSeconds(){
		return seconds;
	}
	
	public int getHour(){
		return hour;
	}
	
	public String getDisplayTime(){
		return time = hour +":" + minute + ":" + seconds;
	}
	
	
}
