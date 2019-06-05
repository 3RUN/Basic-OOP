package by.htp.les02.counter.main;

import by.htp.les02.counter.entity.DecimalCounter;
import by.htp.les02.counter.logic.DecimalCounterLogic;

public class Main {

	public static void main(String[] args) {

		// create our counter and check it's state
		DecimalCounter counter = new DecimalCounter(1, 1, 10);
		System.out.println(counter.getCurrentState());

		// count up till we hit the upper limit and get error
		// display each step
		while (!counter.getError()) {
			DecimalCounterLogic.increase(counter);
			System.out.println(counter.getCurrentState());
		}

		// show our error
		System.out.println(counter.getErrorMessage());

		// reset counter to default values
		DecimalCounterLogic.reset(counter);

		// show it's state again
		System.out.println(counter.getCurrentState());

	}

}
