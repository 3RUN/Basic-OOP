package by.htp.les02.test1.entity;

public class Test1 {

	private int a;
	private int b;

	public Test1() {
	}

	public Test1(int a, int b) {

		this.a = a;
		this.b = b;

	}

	public void setA(int a) {

		this.a = a;

	}

	public void setB(int b) {

		this.b = b;

	}

	public int getA() {

		return this.a;

	}

	public int getB() {

		return this.b;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
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
		Test1 other = (Test1) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Test1 [a=" + a + ", b=" + b + "]";
	}

}
