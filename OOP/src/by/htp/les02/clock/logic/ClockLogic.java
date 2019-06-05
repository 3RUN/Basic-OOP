package by.htp.les02.clock.logic;

import by.htp.les02.clock.entity.Clock;

public class ClockLogic {

	public static void addTime(Clock clock, int hour, int minute, int second) {

		int i = 0;

		if (second < 0) {
			second = 0;
		}
		if (second > 60) {

			int diff = second;

			for (i = 0; diff > 60; i++) {

				diff = second - 60;
				second = diff;
				if (diff > 0) {
					minute++;
				}

			}

		}

		if (minute < 0) {
			minute = 0;
		}
		if (minute > 60) {

			int diff = minute;

			for (i = 0; diff > 60; i++) {

				diff = minute - 60;
				minute = diff;
				if (diff > 0) {
					hour++;
				}

			}

		}

		if (hour < 0 && hour > 24) {
			hour = 0;
		}

		clock.setHour(clock.getHour() + hour);
		clock.setMinute(clock.getMinute() + minute);
		clock.setSecond(clock.getSecond() + second);

	}

	public static void setTime(Clock clock, int hour, int minute, int second) {

		// check for lower and upper limits of values
		if (hour < 0 || hour > 24) {
			hour = 0;
		}
		if (minute < 0 || minute > 60) {
			minute = 0;
		}
		if (second < 0 || second > 60) {
			second = 0;
		}

		clock.setHour(hour);
		clock.setMinute(minute);
		clock.setSecond(second);

	}

}
