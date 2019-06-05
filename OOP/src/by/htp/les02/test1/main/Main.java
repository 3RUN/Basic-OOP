package by.htp.les02.test1.main;

import by.htp.les02.test1.entity.Test1;
import by.htp.les02.test1.logic.Test1Logic;

public class Main {

	public static void main(String[] args) {

		Test1 test1 = new Test1(20, 10);
		System.out.println("a = " + test1.getA() + "; b = " + test1.getB() + ";");
		
		int sum = Test1Logic.getSum(test1);
		System.out.println("Sum of a and b, equals to " + sum);
		
		int biggest = Test1Logic.getBiggest(test1);
		System.out.println("Biggest number within a and b is " + biggest);
		
	}

}
