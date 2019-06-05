package by.htp.les02.triangle.main;

import java.text.DecimalFormat;

import by.htp.les02.triangle.entity.Triangle;
import by.htp.les02.triangle.logic.TriangleLogic;

public class Main {

	private static DecimalFormat decimal = new DecimalFormat("#.##");

	public static void displayTriangleInfo(Triangle triangle) {

		System.out.println("AB length is " + decimal.format(triangle.getAB()));
		System.out.println("BC length is " + decimal.format(triangle.getBC()));
		System.out.println("AC length is " + decimal.format(triangle.getAC()));

		System.out.println("Perimeter of triangle " + decimal.format(TriangleLogic.getPerimeter(triangle)));
		System.out.println("Area of triangle " + decimal.format(TriangleLogic.getArea(triangle)));
		System.out.println("Centroid point of triangle x = " + decimal.format(triangle.getCentroid().x) + " y = "
				+ decimal.format(triangle.getCentroid().y));

	}

	public static void main(String[] args) {

		// point AB = {12, 3}
		// point BC = {35, 6}
		// point AC = {41, 6}
		Triangle triangle = new Triangle(12.0D, 3.0D, 35.0D, 6.0D, 41.0D, 6.0D);
		displayTriangleInfo(triangle); // display all info about this triangle

	}

}
