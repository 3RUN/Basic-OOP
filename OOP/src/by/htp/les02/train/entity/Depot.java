package by.htp.les02.train.entity;

import java.util.Arrays;

public class Depot {

	private Train[] train;

	public Depot() {
	}

	public Depot(Train[] train) {

		this.train = train;

	}

	public void setTrains(Train[] train) {

		this.train = train;

	}

	public Train[] getTrains() {

		return this.train;

	}

	public String getTrainInfoById(int id) {

		int i = 0;
		for (i = 0; i < this.train.length; i++) {

			if (this.train[i].getId() != id) {
				continue;
			}

			return this.train[i].getInfo();

		}

		return null;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(train);
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
		Depot other = (Depot) obj;
		if (!Arrays.equals(train, other.train))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Depot [train=" + Arrays.toString(train) + "]";
	}

}
