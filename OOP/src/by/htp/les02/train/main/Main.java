package by.htp.les02.train.main;

import by.htp.les02.train.entity.*;
import by.htp.les02.train.logic.DepotLogic;

public class Main {

	public static void main(String[] args) {

		// create trains
		Train[] train = new Train[5];
		train[0] = new Train(10, "Minsk", "10:00");
		train[1] = new Train(2, "Moscow", "02:00");
		train[2] = new Train(5, "Kazan", "05:45");
		train[3] = new Train(8, "Brest", "14:40");
		train[4] = new Train(3, "Moscow", "01:40");

		// create depot and write all trains into it
		Depot depot = new Depot(train);

		// sort them by their id's
		DepotLogic.sortById(depot);

		// display all trains
		displayDepot(depot);

		// display train by it's number
		System.out.println(depot.getTrainInfoById(5) + "\n");

		// sort them by their destinations
		// for trains with same destinations
		// we sort them by destination time
		DepotLogic.sortByDestination(depot);

		// display all trains
		displayDepot(depot);

	}

	public static void displayDepot(Depot depot) {

		int i = 0;
		Train[] tempTrain = depot.getTrains();
		for (i = 0; i < tempTrain.length; i++) {
			System.out.println(tempTrain[i].getInfo());
		}
		System.out.println();

	}

}
