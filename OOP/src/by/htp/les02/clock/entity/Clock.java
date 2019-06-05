package by.htp.les02.clock.entity;

public class Clock {

	private int hour = 0;
	private int minute = 0;
	private int second = 0;

	public Clock() {
	}

	public Clock(int hour, int minute, int second) {

		// check for lower and upper limits of values
		if (hour < 0 || hour > 24) {
			hour = 0;
		}
		if (minute < 0 || minute > 60) {
			minute = 0;
		}
		if (second < 0 || second > 60) {
			second = 0;
		}

		this.hour = hour;
		this.minute = minute;
		this.second = second;

	}

	public void setHour(int hour) {

		this.hour = hour;

	}

	public void setMinute(int minute) {

		this.minute = minute;

	}

	public void setSecond(int second) {

		this.second = second;

	}

	public int getHour() {

		return this.hour;

	}

	public int getMinute() {

		return this.minute;

	}

	public int getSecond() {

		return this.second;

	}

	public String getTime() {

		return this.hour + ":" + this.minute + ":" + this.second;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
		result = prime * result + second;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clock other = (Clock) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		if (second != other.second)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Clock [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}

}
