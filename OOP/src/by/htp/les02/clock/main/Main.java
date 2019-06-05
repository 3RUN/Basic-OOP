package by.htp.les02.clock.main;

import by.htp.les02.clock.entity.Clock;
import by.htp.les02.clock.logic.ClockLogic;

public class Main {

	public static void main(String[] args) {

		Clock clock = new Clock(12, 00, 00);
		System.out.println(clock.getTime());

		// add time to the clock
		ClockLogic.addTime(clock, 0, 70, 70);
		System.out.println(clock.getTime());

		// set new time
		ClockLogic.setTime(clock, 12, 34, 60);
		System.out.println(clock.getTime());

	}

}
