package by.htp.les02.train.logic;

import by.htp.les02.train.entity.Depot;
import by.htp.les02.train.entity.Train;

public class DepotLogic {

	public static void sortById(Depot depot) {

		int i = 0;
		int j = 0;
		Train[] inTrain = depot.getTrains();
		Train tempTrain;

		for (i = 0; i < inTrain.length; i++) {

			for (j = i + 1; j < inTrain.length; j++) {

				if (inTrain[i].getId() > inTrain[j].getId()) {
					tempTrain = inTrain[i];
					inTrain[i] = inTrain[j];
					inTrain[j] = tempTrain;
				}

			}

		}

		depot.setTrains(inTrain);

	}

	public static void sortByDestination(Depot depot) {

		int i = 0;
		int j = 0;
		Train[] inTrain = depot.getTrains();
		Train tempTrain;

		for (i = 0; i < inTrain.length; i++) {

			for (j = i + 1; j < inTrain.length; j++) {

				// alphabetical order
				// get destination
				String destinationA = inTrain[i].getDestination();
				String destinationB = inTrain[j].getDestination();

				if (destinationA.compareTo(destinationB) > 0) {
					tempTrain = inTrain[i];
					inTrain[i] = inTrain[j];
					inTrain[j] = tempTrain;
				}

				// same names ? order by time!
				if (destinationA.compareTo(destinationB) == 0) {

					// get dispatch times to compare
					String timeA = inTrain[i].getDispatchTime();
					String timeB = inTrain[j].getDispatchTime();

					if (timeA.compareTo(timeB) > 0) {
						tempTrain = inTrain[i];
						inTrain[i] = inTrain[j];
						inTrain[j] = tempTrain;
					}

				}

			}

		}

		depot.setTrains(inTrain);

	}

}
