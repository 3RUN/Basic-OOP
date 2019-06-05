package by.htp.les02.book.entity;

import java.util.*;

public class Library {

	private List<Book> list;

	public Library() {
	}

	public Library(Book[] list) {

		int i = 0;
		this.list = new ArrayList<Book>();

		for (i = 0; i < list.length; i++) {
			this.list.add(list[i]);
		}

	}

	public void setList(Book[] list) {

		int i = 0;
		this.list = new ArrayList<Book>();

		for (i = 0; i < list.length; i++) {
			this.list.add(list[i]);
		}

	}

	public List<Book> getList() {

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
		Library other = (Library) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Library [list=" + list + "]";
	}

}
