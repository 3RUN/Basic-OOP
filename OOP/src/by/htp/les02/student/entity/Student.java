package by.htp.les02.student.entity;

import java.util.Arrays;

public class Student {

	private String surname;
	private String initials;

	private int group;
	private int[] grade = new int[5];

	public Student() {
	}

	public Student(String surname, String initials, int group) {

		this.surname = surname;
		this.initials = initials;
		this.group = group;

	}

	public void setSurname(String surname) {

		this.surname = surname;

	}

	public void setInitials(String initials) {

		this.initials = initials;

	}

	public void setGroup(int group) {

		this.group = group;

	}

	public void setGrades(int a, int b, int c, int d, int e) {

		if (a > 10 || a < 0) {
			a = 0;
		}
		if (b > 10 || b < 0) {
			b = 0;
		}
		if (c > 10 || c < 0) {
			c = 0;
		}
		if (d > 10 || d < 0) {
			d = 0;
		}
		if (e > 10 || e < 0) {
			e = 0;
		}

		this.grade[0] = a;
		this.grade[1] = b;
		this.grade[2] = c;
		this.grade[3] = d;
		this.grade[4] = e;

	}

	public String getSurname() {

		return this.surname;
	}

	public String getInitials() {

		return this.initials;

	}

	public int getGroup() {

		return this.group;

	}

	public int[] getMarks() {

		return this.grade;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(grade);
		result = prime * result + group;
		result = prime * result + ((initials == null) ? 0 : initials.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Student other = (Student) obj;
		if (!Arrays.equals(grade, other.grade))
			return false;
		if (group != other.group)
			return false;
		if (initials == null) {
			if (other.initials != null)
				return false;
		} else if (!initials.equals(other.initials))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [surname=" + surname + ", initials=" + initials + ", group=" + group + ", grade="
				+ Arrays.toString(grade) + "]";
	}

}
