package by.htp.les02.airline.main;

import java.util.List;

import by.htp.les02.airline.entity.Airline;
import by.htp.les02.airline.entity.Airport;
import by.htp.les02.airline.logic.AirportLogic;

public class Main {

	public static void main(String[] args) {

		Airline[] airline = new Airline[5];
		airline[0] = new Airline("New-York", 145, "Boeing 737", 12, 45, "Sunday");
		airline[1] = new Airline("Moscow", 134, "Airbus A320", 22, 15, "Thuesday");
		airline[2] = new Airline("Bali", 386, "Comac C919", 2, 30, "Monday");
		airline[3] = new Airline("Grodno", 225, "Airbus A320", 7, 30, "Sunday");
		airline[4] = new Airline("Berlin", 525, "Airbus A320", 15, 25, "Thursday");

		// create massive
		Airport airport = new Airport(airline);

		String destination = "Moscow";
		String dayOfTheWeek = "Sunday";
		int hour = 12;
		int minute = 30;

		// display by destination
		System.out.println("Display airlines by destination " + destination + ".");
		DisplayAirlineList(AirportLogic.getByDestination(airport, destination));

		// display by day of the week
		System.out.println("Display airlines by " + dayOfTheWeek + ".");
		DisplayAirlineList(AirportLogic.getByDayOfTheWeek(airport, dayOfTheWeek));

		// display by day and time
		System.out.println("Display airlines by " + dayOfTheWeek + " and after " + hour + ":" + minute + " o'clock.");
		DisplayAirlineList(AirportLogic.getByDayAndTime(airport, dayOfTheWeek, hour, minute));

	}

	public static void DisplayAirlineList(List<Airline> list) {

		int i = 0;
		for (i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
