package by.htp.les02.train.entity;

public class Train {

	private int id;
	private String destination;
	private String dispatchTime;

	public Train() {
	}

	public Train(int id, String destination, String dispatchTime) {

		this.id = id;
		this.destination = destination;
		this.dispatchTime = dispatchTime;

	}

	public void setId(int id) {

		this.id = id;

	}

	public void setDestination(String destination) {

		this.destination = destination;

	}

	public void setDispatchTime(String dispatchTime) {

		this.dispatchTime = dispatchTime;

	}

	public int getId() {

		return this.id;

	}

	public String getDestination() {

		return this.destination;

	}

	public String getDispatchTime() {

		return this.dispatchTime;

	}

	public String getInfo() {

		return ("Train number " + this.id + " to " + this.destination + " departs at " + this.dispatchTime
				+ " local time.");

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((dispatchTime == null) ? 0 : dispatchTime.hashCode());
		result = prime * result + id;
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
		Train other = (Train) obj;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (dispatchTime == null) {
			if (other.dispatchTime != null)
				return false;
		} else if (!dispatchTime.equals(other.dispatchTime))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Train [id=" + id + ", destination=" + destination + ", dispatchTime=" + dispatchTime + "]";
	}

}
