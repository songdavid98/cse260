package cse260lab2;

import java.util.Calendar;

public class Time {

	public int hour;
	
	public int minute;
	
	public int second;
	
	public Time() {
		Calendar cal = Calendar.getInstance();
		hour = cal.get(Calendar.HOUR_OF_DAY);
		minute = cal.get(Calendar.MINUTE);
		second = cal.get(Calendar.SECOND);
	}
	
	public Time(int h, int m, int s) {
		hour = h;
		minute = m;
		second = s;
	}
	
	
	
	public Time(long elapseTime) {
		int totalSeconds = (int)elapseTime/1000;
		second= totalSeconds%60;
		int totalMinutes = totalSeconds/60;
		minute = totalMinutes%60;
		int totalHours = totalMinutes/60;
		hour = totalHours%24;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setTime(long elapseTime) {
		int totalSeconds = (int)elapseTime/1000;
		second=totalSeconds%60;
		int totalMinutes = totalSeconds/60;
		minute = totalMinutes%60;
		int totalHours = totalMinutes/60;
		hour = totalHours%24;
	}
	
	public String toString() {
		return "";
	}
}
