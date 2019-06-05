package by.htp.les02.triangle.logic;

import by.htp.les02.triangle.entity.Point;
import by.htp.les02.triangle.entity.Triangle;

public class TriangleLogic {

	public static double getLength(Point a, Point b) {

		return (Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2)));

	}

	public static double getPerimeter(Triangle triangle) {

		return (triangle.getAB() + triangle.getBC() + triangle.getAC());

	}

	public static double getArea(Triangle triangle) {

		double s = getPerimeter(triangle) / 2;
		return (Math.sqrt(s * (s - triangle.getAB()) * (s - triangle.getBC()) * (s - triangle.getAC())));
	}

	public static boolean isCheckTriangle(double a, double b, double c) {

		if (a > b + c) {
			return false;
		} else {
			return true;
		}

	}

}
