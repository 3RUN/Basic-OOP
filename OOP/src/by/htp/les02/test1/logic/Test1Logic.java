package by.htp.les02.test1.logic;

import by.htp.les02.test1.entity.Test1;

public class Test1Logic {

	public static int getSum(Test1 test1) {

		return (test1.getA() + test1.getB());

	}

	public static int getBiggest(Test1 test1) {

		if (test1.getA() > test1.getB()) {
			return test1.getA();
		} else {
			return test1.getB();
		}

	}

}
