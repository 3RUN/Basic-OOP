package by.htp.les02.counter.entity;

public class DecimalCounter {

	private int currentState;
	private int lowerLimit;
	private int upperLimit;
	private boolean error;
	private String errorMessage;

	public DecimalCounter() {

		this.currentState = 1;
		this.lowerLimit = 1;
		this.upperLimit = 10;
		this.error = false;
		this.errorMessage = null;

	}

	public DecimalCounter(int value, int min, int max) {

		if (min > max) {
			int temp = max;
			max = min;
			min = temp;
		}

		if (value < min || value > max) {
			this.currentState = min;
		} else {
			this.currentState = value;
		}

		this.lowerLimit = min;
		this.upperLimit = max;
		this.error = false;
		this.errorMessage = null;

	}

	public void setCurrentState(int currentState) {

		this.currentState = currentState;

	}

	public void setLowerLimit(int lowerLimit) {

		this.lowerLimit = lowerLimit;

	}

	public void setUpperLimit(int lowerLimit) {

		this.lowerLimit = lowerLimit;

	}

	public void setError(boolean error) {

		this.error = error;

	}

	public void setErrorMessage(String errorMessage) {

		this.errorMessage = errorMessage;

	}

	public int getCurrentState() {

		return this.currentState;
	}

	public int getLowerLimit() {

		return this.lowerLimit;
	}

	public int getUpperLimit() {

		return this.upperLimit;

	}

	public boolean getError() {

		return this.error;

	}

	public String getErrorMessage() {

		return this.errorMessage;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + currentState;
		result = prime * result + lowerLimit;
		result = prime * result + upperLimit;
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
		DecimalCounter other = (DecimalCounter) obj;
		if (currentState != other.currentState)
			return false;
		if (lowerLimit != other.lowerLimit)
			return false;
		if (upperLimit != other.upperLimit)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DecimalCounter [currentState=" + currentState + ", lowerLimit=" + lowerLimit + ", upperLimit="
				+ upperLimit + "]";
	}

}
