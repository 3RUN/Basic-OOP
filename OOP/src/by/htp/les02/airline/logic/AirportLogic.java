package by.htp.les02.airline.logic;

import java.util.*;

import by.htp.les02.airline.entity.Airline;
import by.htp.les02.airline.entity.Airport;

public class AirportLogic {

	public static List<Airline> getByDestination(Airport airport, String destination) {

		int i = 0;
		List<Airline> list = airport.getList();
		List<Airline> temp = new ArrayList<Airline>();

		for (i = 0; i < list.size(); i++) {

			// get current airline's destination
			String tempDestination = list.get(i).getDestination();

			if (tempDestination.equals(destination)) {
				temp.add(list.get(i));
			}

		}

		return temp;

	}

	public static List<Airline> getByDayOfTheWeek(Airport airport, String day_of_the_week) {

		int i = 0;
		List<Airline> list = airport.getList();
		List<Airline> temp = new ArrayList<Airline>();

		for (i = 0; i < list.size(); i++) {

			if (list.get(i).getDayOfTheWeek().equals(day_of_the_week)) {
				temp.add(list.get(i));
			}

		}

		return temp;

	}

	public static List<Airline> getByDayAndTime(Airport airport, String day_of_the_week, int hour, int minute) {

		int i = 0;
		List<Airline> list = airport.getList();
		List<Airline> temp = new ArrayList<Airline>();

		for (i = 0; i < list.size(); i++) {

			if (list.get(i).getDayOfTheWeek().equals(day_of_the_week)) {

				if (list.get(i).getDepatureHour() >= hour && list.get(i).getDepatureMinute() > minute) {
					temp.add(list.get(i));
				}

			}

		}

		return temp;

	}

}
