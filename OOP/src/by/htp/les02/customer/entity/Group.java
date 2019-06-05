package by.htp.les02.customer.entity;

import java.util.ArrayList;
import java.util.List;

public class Group {

	private List<Customer> list;

	public Group() {
	}

	public Group(Customer massive[]) {

		int i = 0;
		this.list = new ArrayList<Customer>();

		for (i = 0; i < massive.length; i++) {
			this.list.add(massive[i]);
		}

	}

	public void setList(Customer massive[]) {

		int i = 0;
		this.list = new ArrayList<Customer>();

		for (i = 0; i < massive.length; i++) {
			this.list.add(massive[i]);
		}

	}

	public List<Customer> getList() {

		return this.list;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
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
		Group other = (Group) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Group [list=" + list + "]";
	}

}
