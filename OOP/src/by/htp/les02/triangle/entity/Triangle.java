package by.htp.les02.triangle.entity;

import java.util.Arrays;
import by.htp.les02.triangle.logic.TriangleLogic;

public class Triangle {
	private double AB;
	private double BC;
	private double AC;
	private Point centroid;

	public Triangle(double x1, double x2, double y1, double y2, double c1, double c2) {

		Point a = new Point(x1, x2);
		Point b = new Point(y1, y2);
		Point c = new Point(c1, c2);

		this.AB = TriangleLogic.getLength(a, b);
		this.BC = TriangleLogic.getLength(b, c);
		this.AC = TriangleLogic.getLength(a, c);

		double[] temp = { this.AB, this.BC, this.AC };
		Arrays.sort(temp);

		if (!TriangleLogic.isCheckTriangle(temp[2], temp[0], temp[1])) {
			System.out.println("Triangle doesn't exist!");
		}

		double x = a.x + b.x + c.x;
		double y = a.y + b.y + c.y;
		centroid = new Point(x / 3, y / 3);

	}

	public double getAB() {

		return this.AB;

	}

	public double getBC() {

		return this.BC;

	}

	public double getAC() {

		return this.AC;

	}

	public Point getCentroid() {

		return this.centroid;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(AB);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(AC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(BC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((centroid == null) ? 0 : centroid.hashCode());
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
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(AB) != Double.doubleToLongBits(other.AB))
			return false;
		if (Double.doubleToLongBits(AC) != Double.doubleToLongBits(other.AC))
			return false;
		if (Double.doubleToLongBits(BC) != Double.doubleToLongBits(other.BC))
			return false;
		if (centroid == null) {
			if (other.centroid != null)
				return false;
		} else if (!centroid.equals(other.centroid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Triangle [AB=" + AB + ", BC=" + BC + ", AC=" + AC + ", centroid=" + centroid + "]";
	}

}
