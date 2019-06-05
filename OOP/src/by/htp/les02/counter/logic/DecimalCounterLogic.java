package by.htp.les02.counter.logic;

import by.htp.les02.counter.entity.DecimalCounter;

public class DecimalCounterLogic {

	public static void increase(DecimalCounter decimalCounter) {

		// increase current state by one step
		int state = decimalCounter.getCurrentState();
		state++;
		decimalCounter.setCurrentState(state);

		if (decimalCounter.getCurrentState() >= decimalCounter.getUpperLimit()) {

			decimalCounter.setCurrentState(decimalCounter.getUpperLimit());
			decimalCounter.setError(true);
			decimalCounter.setErrorMessage("Out of bounds!");

		}

	}

	public static void decrease(DecimalCounter decimalCounter) {

		// decrease current state by one step
		int state = decimalCounter.getCurrentState();
		state--;
		decimalCounter.setCurrentState(state);

		if (decimalCounter.getCurrentState() <= decimalCounter.getLowerLimit()) {

			decimalCounter.setCurrentState(decimalCounter.getLowerLimit());
			decimalCounter.setError(true);
			decimalCounter.setErrorMessage("Out of bounds!");

		}

	}

	public static void reset(DecimalCounter decimalCounter) {

		decimalCounter.setCurrentState(1);
		decimalCounter.setLowerLimit(1);
		decimalCounter.setUpperLimit(10);
		decimalCounter.setError(false);
		decimalCounter.setErrorMessage(null);

	}

}
