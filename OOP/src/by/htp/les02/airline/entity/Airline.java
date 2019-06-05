package by.htp.les02.airline.entity;

public class Airline {

	private String destination;
	private int flightNumber;
	private String aircraftType;
	private int depatureHour;
	private int depatureMinute;
	private String dayOfTheWeek;

	public Airline() {
	}

	public Airline(String destination, int flightNumber, String aircraftType, int depatureHour, int depatureMinute,
			String dayOfTheWeek) {

		if (depatureHour > 24) {
			depatureHour = 0;
		}
		if (depatureMinute > 60) {
			depatureMinute = 0;
		}

		this.destination = destination;
		this.flightNumber = flightNumber;
		this.aircraftType = aircraftType;
		this.depatureHour = depatureHour;
		this.depatureMinute = depatureMinute;
		this.dayOfTheWeek = dayOfTheWeek;

	}

	public void setDestination(String destination) {

		this.destination = destination;

	}

	public void setFlightNumber(int flightNumber) {

		this.flightNumber = flightNumber;

	}

	public void setAircraftType(String aircraftType) {

		this.aircraftType = aircraftType;

	}

	public void setDepatureHour(int depatureHour) {

		this.depatureHour = depatureHour;

	}

	public void setDepatureMinute(int depatureMinute) {

		this.depatureMinute = depatureMinute;

	}

	public void setDayOfTheWeek(String dayOfTheWeek) {

		this.dayOfTheWeek = dayOfTheWeek;

	}

	public String getDestination() {

		return this.destination;

	}

	public int getFlightNumber() {

		return this.flightNumber;

	}

	public String getAircraftType() {

		return this.aircraftType;

	}

	public int getDepatureHour() {

		return this.depatureHour;

	}

	public int getDepatureMinute() {

		return this.depatureMinute;

	}

	public String getDayOfTheWeek() {

		return this.dayOfTheWeek;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aircraftType == null) ? 0 : aircraftType.hashCode());
		result = prime * result + ((dayOfTheWeek == null) ? 0 : dayOfTheWeek.hashCode());
		result = prime * result + depatureHour;
		result = prime * result + depatureMinute;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flightNumber;
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
		Airline other = (Airline) obj;
		if (aircraftType == null) {
			if (other.aircraftType != null)
				return false;
		} else if (!aircraftType.equals(other.aircraftType))
			return false;
		if (dayOfTheWeek == null) {
			if (other.dayOfTheWeek != null)
				return false;
		} else if (!dayOfTheWeek.equals(other.dayOfTheWeek))
			return false;
		if (depatureHour != other.depatureHour)
			return false;
		if (depatureMinute != other.depatureMinute)
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNumber != other.flightNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return ("Flight\n" + "  number: " + this.flightNumber + "\n" + "  to: " + this.destination + "\n"
				+ "  aircraft type: " + this.aircraftType + "\n" + "  depature time: " + this.dayOfTheWeek + " at "
				+ this.depatureHour + ":" + this.depatureMinute + " o'clock" + "\n");
	}

}
